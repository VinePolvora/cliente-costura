package br.com.costura.Cia.clientecostura.costura.application.service;

import br.com.costura.Cia.clientecostura.costura.domain.Costura;

public interface CosturaRepository {
	Costura salvaCostura(Costura costura);
}