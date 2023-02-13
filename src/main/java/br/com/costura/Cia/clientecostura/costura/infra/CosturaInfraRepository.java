package br.com.costura.Cia.clientecostura.costura.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.costura.Cia.clientecostura.costura.application.service.CosturaRepository;
import br.com.costura.Cia.clientecostura.costura.domain.Costura;
import br.com.costura.Cia.clientecostura.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class CosturaInfraRepository implements CosturaRepository {
	private final CosturaSpringDataJPARepository costuraSpringDataJPARepository;

	@Override
	public Costura salvaCostura(Costura costura) {
		log.info("[inicia] CosturaInfraRepository - salvaCostura");
		costuraSpringDataJPARepository.save(costura);
		log.info("[finaliza] CosturaInfraRepository - salvaCostura");
		return costura;
	}

	@Override
	public List<Costura> buscaCosturasDoClienteComId(UUID idCliente) {
		log.info("[inicia] CosturaInfraRepository - buscaCosturasDoClienteComId");
		var costuras = costuraSpringDataJPARepository.findByIdCliente(idCliente);
		log.info("[fianaliza] CosturaInfraRepository - buscaCosturasDoClienteComId");
		return costuras;
	}

	@Override
	public Costura buscaCosturaPeloId(UUID idCostura) {
		log.info("[inicia] CosturaInfraRepository - buscaCosturaPeloId");
		var costura = costuraSpringDataJPARepository.findById(idCostura).orElseThrow(() -> APIException
				.build(HttpStatus.NOT_FOUND, "Costura não encontrada para o IdCostura = " + idCostura));
		log.info("[finaliza] CosturaInfraRepository - buscaCosturaPeloId");
		return costura;
	}

	@Override
	public void deletaCostura(Costura costura) {
		log.info("[inicia] CosturaInfraRepository - deletaCostura");
		costuraSpringDataJPARepository.delete(costura);
		log.info("[inicia] CosturaInfraRepository - deletaCostura");
	}
}