package br.com.costura.Cia.clientecostura.costura.application.service;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import br.com.costura.Cia.clientecostura.costura.application.api.CosturaRequest;
import br.com.costura.Cia.clientecostura.costura.application.api.CosturaResponse;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class CosturaApplicationService implements CosturaService {

	@Override
	public CosturaResponse criaCostura(UUID idCliente, @Valid CosturaRequest costuraRequest) {
		log.info("[inicia] CosturaApplicationService - criaCostura");
		log.info("[finaliza] CosturaApplicationService - criaCostura");
		return null;
	}

}
