package br.com.costura.Cia.clientecostura.cliente.application.api;

import java.time.LocalDateTime;
import java.util.UUID;

import br.com.costura.Cia.clientecostura.cliente.domain.Sexo;
import lombok.Value;

@Value
public class ClienteDetalhadoResponse {
	private UUID idCliente;
	private String nomeCompleto;
	private String email;
	private String celular;
	private String telefone;
	private Sexo sexo;
	private String cpf;
	private LocalDateTime dataHoraDoCadastro;
	private Boolean aceitaTermos;
}