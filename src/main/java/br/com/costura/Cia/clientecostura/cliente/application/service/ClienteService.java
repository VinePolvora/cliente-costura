package br.com.costura.Cia.clientecostura.cliente.application.service;

import br.com.costura.Cia.clientecostura.cliente.application.api.ClienteRequest;
import br.com.costura.Cia.clientecostura.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);
}