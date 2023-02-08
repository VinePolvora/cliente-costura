package br.com.costura.Cia.clientecostura.costura.application.api;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import br.com.costura.Cia.clientecostura.costura.application.service.CosturaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class CosturaController implements CosturaAPI {
	private final CosturaService costuraService;

	@Override
	public CosturaResponse postCostura(UUID idCliente, @Valid CosturaRequest costuraRequest) {
		log.info("[inicia] CosturaController - postCostura");
		log.info("[idCliente] {}", idCliente);
		CosturaResponse costura = costuraService.criaCostura(idCliente, costuraRequest);
		log.info("[finaliza] CosturaController - postCostura");
		return costura;
	}
}