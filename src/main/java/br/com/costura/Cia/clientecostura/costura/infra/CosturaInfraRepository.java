package br.com.costura.Cia.clientecostura.costura.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import br.com.costura.Cia.clientecostura.costura.application.service.CosturaRepository;
import br.com.costura.Cia.clientecostura.costura.domain.Costura;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class CosturaInfraRepository implements CosturaRepository {
	private final CosturaSpringDataJPARepository costuraSpringDataJPARepository;

	@Override
	public Costura salvaCostura(Costura costura) {
		log.info("[inicia] CosturaInfraRepository - salvaCostura");
		costuraSpringDataJPARepository.save(costura);
		log.info("[finaliza] CosturaInfraRepository - salvaCostura");
		return costura;
	}

	@Override
	public List<Costura> buscaCosturasDoClienteComId(UUID idCliente) {
		log.info("[inicia] CosturaInfraRepository - buscaCosturasDoClienteComId");
		log.info("[fianaliza] CosturaInfraRepository - buscaCosturasDoClienteComId");
		return null;
	}

}
