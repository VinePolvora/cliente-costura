package br.com.costura.Cia.clientecostura.costura.application.service;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import br.com.costura.Cia.clientecostura.cliente.application.service.ClienteService;
import br.com.costura.Cia.clientecostura.costura.application.api.CosturaClienteDetalhadoResponse;
import br.com.costura.Cia.clientecostura.costura.application.api.CosturaClienteListResponse;
import br.com.costura.Cia.clientecostura.costura.application.api.CosturaRequest;
import br.com.costura.Cia.clientecostura.costura.application.api.CosturaResponse;
import br.com.costura.Cia.clientecostura.costura.domain.Costura;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class CosturaApplicationService implements CosturaService {
	private final ClienteService clienteService;
	private final CosturaRepository costuraRepository;

	@Override
	public CosturaResponse criaCostura(UUID idCliente, @Valid CosturaRequest costuraRequest) {
		log.info("[inicia] CosturaApplicationService - criaCostura");
		clienteService.buscaClienteAtravesId(idCliente);
		Costura costura = costuraRepository.salvaCostura(new Costura(idCliente, costuraRequest));
		log.info("[finaliza] CosturaApplicationService - criaCostura");
		return new CosturaResponse(costura.getIdCostura());
	}

	@Override
	public List<CosturaClienteListResponse> buscaCosturasDoClienteComId(UUID idCliente) {
		log.info("[inicia] CosturaApplicationService - buscaCosturasDoClienteComId");
		clienteService.buscaClienteAtravesId(idCliente);
		List<Costura> costurasDoCliente = costuraRepository.buscaCosturasDoClienteComId(idCliente);
		log.info("[finaliza] CosturaApplicationService - buscaCosturasDoClienteComId");
		return CosturaClienteListResponse.converte(costurasDoCliente);
	}

	@Override
	public CosturaClienteDetalhadoResponse buscaCosturaDoClienteComId(UUID idCliente, UUID idCostura) {
		log.info("[inicia] CosturaApplicationService - buscaCosturaDoClienteComId");
		clienteService.buscaClienteAtravesId(idCliente);
		Costura costura = costuraRepository.buscaCosturaPeloId(idCostura);
		log.info("[finaliza] CosturaApplicationService - buscaCosturaDoClienteComId");
		return new CosturaClienteDetalhadoResponse(costura);
	}

	@Override
	public void deletaCosturaDoClienteComId(UUID idCliente, UUID idCostura) {
		log.info("[inicia] CosturaApplicationService - deletaCosturaDoClienteComId");
//		clienteService.deletaClienteAtravesId(idCliente);
//		Costura costura = costuraRepository.deletaCosturaPeloId(idCostura);
		log.info("[finaliza] CosturaApplicationService - deletaCosturaDoClienteComId");
	}
}