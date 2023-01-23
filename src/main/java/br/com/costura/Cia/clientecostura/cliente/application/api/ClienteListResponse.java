package br.com.costura.Cia.clientecostura.cliente.application.api;

import java.util.List;
import java.util.UUID;

import br.com.costura.Cia.clientecostura.cliente.domain.Cliente;
import lombok.Value;

@Value
public class ClienteListResponse {
	private UUID idCliente;
	private String nomeCompleto;
	private String email;
	private String celular;
	private String cpf;
	
	public static List<ClienteListResponse> converte(List<Cliente> clientes) {
		// TODO Auto-generated method stub
		return null;
	}
}