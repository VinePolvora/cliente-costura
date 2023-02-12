package br.com.costura.Cia.clientecostura.costura.application.api;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.costura.Cia.clientecostura.costura.domain.Costura;
import br.com.costura.Cia.clientecostura.costura.domain.FormaPagamento;
import br.com.costura.Cia.clientecostura.costura.domain.SexoCostura;
import br.com.costura.Cia.clientecostura.costura.domain.Tamanho;
import br.com.costura.Cia.clientecostura.costura.domain.TipoTecido;
import lombok.Getter;

@Getter
public class CosturaClienteListResponse {
	private UUID idCostura;
	private String nomeDonoDaPeca;
	private TipoTecido tipoTecido;
	private Tamanho tamanho;
	private FormaPagamento formaPagamento;
	private SexoCostura sexoCostura;

	public static List<CosturaClienteListResponse> converte(List<Costura> costurasDoCliente) {
		return costurasDoCliente.stream()
				.map(CosturaClienteListResponse::new)
				.collect(Collectors.toList());
	}

	public CosturaClienteListResponse(Costura costura) {
		this.idCostura = costura.getIdCostura();
		this.nomeDonoDaPeca = costura.getNomeDonoDaPeca();
		this.tipoTecido = costura.getTipoTecido();
		this.tamanho = costura.getTamanho();
		this.formaPagamento = costura.getFormaPagamento();
		this.sexoCostura = costura.getSexoCostura();
	}
}