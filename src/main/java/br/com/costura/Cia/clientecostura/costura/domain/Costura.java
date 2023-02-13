package br.com.costura.Cia.clientecostura.costura.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.costura.Cia.clientecostura.costura.application.api.CosturaAlteracaoRequest;
import br.com.costura.Cia.clientecostura.costura.application.api.CosturaRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Costura {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idCostura", updatable = false, unique = true, nullable = false)
	private UUID idCostura;
	@NotNull
	@Column(columnDefinition = "uuid", name = "idCliente", nullable = false)
	private UUID idCliente;
	@NotBlank
	private String nomeDonoDaPeca;
	@NotNull
	@Enumerated(EnumType.STRING)
	private TipoTecido tipoTecido;
	@NotNull
	@Enumerated(EnumType.STRING)
	private Tamanho tamanho;
	@NotNull
	@Enumerated(EnumType.STRING)
	private FormaPagamento formaPagamento;
	@NotNull
	private SexoCostura sexoCostura;
	private Boolean aceitaTermos;

	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraDaUltimaAlteracao;
	
	public Costura(UUID idCliente, @Valid CosturaRequest costuraRequest) {
		this.idCliente = idCliente;
		this.nomeDonoDaPeca = costuraRequest.getNomeDonoDaPeca();
		this.tipoTecido = costuraRequest.getTipoTecido();
		this.tamanho = costuraRequest.getTamanho();
		this.formaPagamento = costuraRequest.getFormaPagamento();
		this.sexoCostura = costuraRequest.getSexoCostura();
		this.aceitaTermos = costuraRequest.getAceitaTermos();
		this.dataHoraDoCadastro = LocalDateTime.now();
	}

	public void altera(CosturaAlteracaoRequest costuraRequest) {
		this.nomeDonoDaPeca = costuraRequest.getNomeDonoDaPeca();
		this.tipoTecido = costuraRequest.getTipoTecido();
		this.tamanho = costuraRequest.getTamanho();
		this.formaPagamento = costuraRequest.getFormaPagamento();
		this.sexoCostura = costuraRequest.getSexoCostura();
		this.aceitaTermos = costuraRequest.getAceitaTermos();
		this.dataHoraDaUltimaAlteracao = LocalDateTime.now();		
	}
}