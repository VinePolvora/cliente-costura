package br.com.costura.Cia.clientecostura.cliente.application.service;

import java.util.List;
import java.util.UUID;

import br.com.costura.Cia.clientecostura.cliente.application.api.ClienteDetalhadoResponse;
import br.com.costura.Cia.clientecostura.cliente.application.api.ClienteListResponse;
import br.com.costura.Cia.clientecostura.cliente.application.api.ClienteRequest;
import br.com.costura.Cia.clientecostura.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);
	List<ClienteListResponse> buscaTodosClientes();
	ClienteDetalhadoResponse buscaClienteAtravesId(UUID idCliente);
}