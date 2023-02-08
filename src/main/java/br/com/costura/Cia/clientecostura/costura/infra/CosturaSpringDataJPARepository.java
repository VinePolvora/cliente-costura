package br.com.costura.Cia.clientecostura.costura.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.costura.Cia.clientecostura.costura.domain.Costura;

public interface CosturaSpringDataJPARepository extends JpaRepository<Costura, UUID>{
}