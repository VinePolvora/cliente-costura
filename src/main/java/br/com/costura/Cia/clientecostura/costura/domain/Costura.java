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
import javax.validation.constraints.NotBlank;

import br.com.costura.Cia.clientecostura.cliente.domain.Sexo;
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
	@NotBlank
	private String nomeDonoDaPeça;
	@Enumerated(EnumType.STRING)
	private TipoTecido tipoTecido;
	@Enumerated(EnumType.STRING)
	private Tamanho tamanho;
	@Enumerated(EnumType.STRING)
	private Pagamento pagamento;
	@NotBlank
	private Sexo sexo;
	private Boolean aceitaTermos;

	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraDaUltimaAlteracao;
}