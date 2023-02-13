package br.com.costura.Cia.clientecostura.costura.application.service;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import br.com.costura.Cia.clientecostura.costura.application.api.CosturaAlteracaoRequest;
import br.com.costura.Cia.clientecostura.costura.application.api.CosturaClienteDetalhadoResponse;
import br.com.costura.Cia.clientecostura.costura.application.api.CosturaClienteListResponse;
import br.com.costura.Cia.clientecostura.costura.application.api.CosturaRequest;
import br.com.costura.Cia.clientecostura.costura.application.api.CosturaResponse;

public interface CosturaService {
	CosturaResponse criaCostura(UUID idCliente, @Valid CosturaRequest costuraRequest);
	List<CosturaClienteListResponse> buscaCosturasDoClienteComId(UUID idCliente);
	CosturaClienteDetalhadoResponse buscaCosturaDoClienteComId(UUID idCliente, UUID idCostura);
	void deletaCosturaDoClienteComId(UUID idCliente, UUID idCostura);
	void alteraCosturaDoClienteComId(UUID idCliente, UUID idCostura,
			CosturaAlteracaoRequest costuraAlteracaoRequest);
}