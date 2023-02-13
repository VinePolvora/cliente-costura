package br.com.costura.Cia.clientecostura.costura.application.api;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.costura.Cia.clientecostura.costura.domain.FormaPagamento;
import br.com.costura.Cia.clientecostura.costura.domain.SexoCostura;
import br.com.costura.Cia.clientecostura.costura.domain.Tamanho;
import br.com.costura.Cia.clientecostura.costura.domain.TipoTecido;
import lombok.Value;

@Value
public class CosturaAlteracaoRequest {
	@NotBlank
	private String nomeDonoDaPeca;
	@NotNull
	private TipoTecido tipoTecido;
	@NotNull
	private Tamanho tamanho;
	@NotNull
	private FormaPagamento formaPagamento;
	@NotNull
	private SexoCostura sexoCostura;
	private Boolean aceitaTermos;
}