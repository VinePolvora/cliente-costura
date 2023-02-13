package br.com.costura.Cia.clientecostura.cliente.application.repository;

import java.util.List;
import java.util.UUID;

import br.com.costura.Cia.clientecostura.cliente.domain.Cliente;

public interface ClienteRepository {
	Cliente salva(Cliente cliente);
	List<Cliente> buscaTodosCleintes();
	Cliente buscaCleinteAtravesId(UUID idCliente);
	void deletaCliente(Cliente cliente);
}