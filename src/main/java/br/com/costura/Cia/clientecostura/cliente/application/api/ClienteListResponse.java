package br.com.costura.Cia.clientecostura.cliente.application.api;

import java.util.UUID;

import lombok.Value;

@Value
public class ClienteListResponse {
	private UUID idCliente;
	private String nomeCompleto;
	private String email;
	private String celular;
	private String cpf;

}
