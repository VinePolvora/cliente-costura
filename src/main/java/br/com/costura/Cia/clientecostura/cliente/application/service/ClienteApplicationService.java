package br.com.costura.Cia.clientecostura.cliente.application.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.costura.Cia.clientecostura.cliente.application.api.ClienteAlteracaoRequest;
import br.com.costura.Cia.clientecostura.cliente.application.api.ClienteDetalhadoResponse;
import br.com.costura.Cia.clientecostura.cliente.application.api.ClienteListResponse;
import br.com.costura.Cia.clientecostura.cliente.application.api.ClienteRequest;
import br.com.costura.Cia.clientecostura.cliente.application.api.ClienteResponse;
import br.com.costura.Cia.clientecostura.cliente.application.repository.ClienteRepository;
import br.com.costura.Cia.clientecostura.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class ClienteApplicationService implements ClienteService {

	private final ClienteRepository clienteRepository;


	@Override
	public ClienteResponse criaCliente(ClienteRequest clienteRequest) {
		log.info("[inicia] ClienteApplicationService - criaCliente");
		Cliente cliente = clienteRepository.salva(new Cliente(clienteRequest));
		log.info("[finaliza] ClienteApplicationService - criaCliente");
		return ClienteResponse.builder()
				.idCliente(cliente.getIdCliente())
				.build();
	}

	@Override
	public List<ClienteListResponse> buscaTodosClientes() {
		log.info("[inicia] ClienteApplicationService - buscaTodosClientes");
		List<Cliente> clientes = clienteRepository.buscaTodosCleintes();
		log.info("[finaliza] ClienteApplicationService - buscaTodosClientes");
		return ClienteListResponse.converte(clientes);
	}

	@Override
	public ClienteDetalhadoResponse buscaClienteAtravesId(UUID idCliente) {
		log.info("[inicia] ClienteApplicationService - buscaClienteAtravesId");
		Cliente Cliente = clienteRepository.buscaCleinteAtravesId(idCliente);
		log.info("[finaliza] ClienteApplicationService - buscaClienteAtravesId");
		return new ClienteDetalhadoResponse(Cliente);
	}

	@Override
	public void deletaClienteAtravesId(UUID idCliente) {
		log.info("[inicia] ClienteApplicationService - deletaClienteAtravesId");
		Cliente cliente = clienteRepository.buscaCleinteAtravesId(idCliente);
		clienteRepository.deletaCliente(cliente);
		log.info("[finaliza] ClienteApplicationService - deletaClienteAtravesId");
	}

	@Override
	public void alteraCliente(UUID idCliente, ClienteAlteracaoRequest clienteAlteracaoRequest) {
		log.info("[inicia] ClienteApplicationService - alteraCliente");
		Cliente cliente = clienteRepository.buscaCleinteAtravesId(idCliente);
		cliente.altera(clienteAlteracaoRequest);
		clienteRepository.salva(cliente);
		log.info("[finaliza] ClienteApplicationService - alteraCliente");
	}
}