package br.com.costura.Cia.clientecostura.costura.application.api;

import java.util.UUID;

import br.com.costura.Cia.clientecostura.costura.domain.Costura;
import br.com.costura.Cia.clientecostura.costura.domain.FormaPagamento;
import br.com.costura.Cia.clientecostura.costura.domain.SexoCostura;
import br.com.costura.Cia.clientecostura.costura.domain.Tamanho;
import br.com.costura.Cia.clientecostura.costura.domain.TipoTecido;
import lombok.Value;

@Value
public class CosturaClienteDetalhadoResponse {
	
	private UUID idCostura;
	private UUID idCliente;
	private String nomeDonoDaPeca;
	private TipoTecido tipoTecido;
	private Tamanho tamanho;
	private FormaPagamento formaPagamento;
	private SexoCostura sexoCostura;

	public CosturaClienteDetalhadoResponse(Costura costura) {
		this.idCostura = costura.getIdCostura();
		this.idCliente = costura.getIdCliente();
		this.nomeDonoDaPeca = costura.getNomeDonoDaPeca();
		this.tipoTecido = costura.getTipoTecido();
		this.tamanho = costura.getTamanho();
		this.formaPagamento = costura.getFormaPagamento();
		this.sexoCostura = costura.getSexoCostura();
	}
}