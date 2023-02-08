package br.com.costura.Cia.clientecostura.costura.application.api;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/cliente/{idCliente}/costura")
public interface CosturaAPI {
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	CosturaResponse postCostura(@PathVariable UUID idCliente,
			@Valid @RequestBody CosturaRequest costuraRequest);
	
	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	List<CosturaClienteListResponse> getCosturasDoClientecomId(@PathVariable UUID idCliente);
}