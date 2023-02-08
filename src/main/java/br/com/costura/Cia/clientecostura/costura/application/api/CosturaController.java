package br.com.costura.Cia.clientecostura.costura.application.api;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class CosturaController implements CosturaAPI {

	@Override
	public CosturaResponse postCostura(UUID idCliente, @Valid CosturaRequest costuraRequest) {
		log.info("[inicia] CosturaController - postCostura");
		log.info("[finaliza] CosturaController - postCostura");
		return null;
	}
}