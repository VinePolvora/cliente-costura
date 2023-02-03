package br.com.costura.Cia.clientecostura.cliente.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.costura.Cia.clientecostura.cliente.application.repository.ClienteRepository;
import br.com.costura.Cia.clientecostura.cliente.domain.Cliente;
import br.com.costura.Cia.clientecostura.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class ClienteInfraRepository implements ClienteRepository {
	private final ClienteSpringDataJPARepository clienteSpringDataJPARepository;

	@Override
	public Cliente salva(Cliente cliente) {
		log.info("[inicia] ClienteInfraRepository - salva");
		clienteSpringDataJPARepository.save(cliente);
		log.info("[finaliza] ClienteInfraRepository - salva");
		return cliente;
	}

	@Override
	public List<Cliente> buscaTodosCleintes() {
		log.info("[inicia] ClienteInfraRepository - buscaTodosCleintes");
		List<Cliente> todosClientes = clienteSpringDataJPARepository.findAll();
		log.info("[inicia] ClienteInfraRepository - buscaTodosCleintes");
		return todosClientes;
	}

	@Override
	public Cliente buscaCleinteAtravesId(UUID idCliente) {
		log.info("[inicia] ClienteInfraRepository - buscaCleinteAtravesId");
		Cliente cliente = clienteSpringDataJPARepository.findById(idCliente)
				.orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Cliente não encontrado!"));
		log.info("[finaliza] ClienteInfraRepository - buscaCleinteAtravesId");
		return cliente;
	}
}