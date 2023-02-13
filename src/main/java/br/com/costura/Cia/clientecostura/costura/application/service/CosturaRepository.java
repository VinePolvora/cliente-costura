package br.com.costura.Cia.clientecostura.costura.application.service;

import java.util.List;
import java.util.UUID;

import br.com.costura.Cia.clientecostura.costura.domain.Costura;

public interface CosturaRepository {
	Costura salvaCostura(Costura costura);
	List<Costura> buscaCosturasDoClienteComId(UUID idCliente);
	Costura buscaCosturaPeloId(UUID idCostura);
}