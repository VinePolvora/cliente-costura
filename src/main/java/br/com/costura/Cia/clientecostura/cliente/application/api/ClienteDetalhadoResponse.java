package br.com.costura.Cia.clientecostura.cliente.application.api;

import java.time.LocalDateTime;
import java.util.UUID;

import br.com.costura.Cia.clientecostura.cliente.domain.Cliente;
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

	public ClienteDetalhadoResponse(Cliente cliente) {
		this.idCliente = cliente.getIdCliente();
		this.nomeCompleto = cliente.getNomeCompleto();
		this.email = cliente.getEmail();
		this.celular = cliente.getCelular();
		this.telefone = cliente.getTelefone();
		this.sexo = cliente.getSexo();
		this.cpf = cliente.getCpf();
		this.dataHoraDoCadastro = cliente.getDataHoraDaUltimaAlteracao();
		this.aceitaTermos = cliente.getAceitaTermos();
	}
}