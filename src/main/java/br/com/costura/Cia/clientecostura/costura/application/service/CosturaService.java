package br.com.costura.Cia.clientecostura.costura.application.service;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import br.com.costura.Cia.clientecostura.costura.application.api.CosturaClienteListResponse;
import br.com.costura.Cia.clientecostura.costura.application.api.CosturaRequest;
import br.com.costura.Cia.clientecostura.costura.application.api.CosturaResponse;

public interface CosturaService {
	CosturaResponse criaCostura(UUID idCliente, @Valid CosturaRequest costuraRequest);
	List<CosturaClienteListResponse> buscaCosturasDoClienteComId(UUID idCliente);
}