package br.com.costura.Cia.clientecostura.cliente.application.repository;

import br.com.costura.Cia.clientecostura.cliente.domain.Cliente;

public interface ClienteRepository {
	Cliente salva(Cliente cliente);
}