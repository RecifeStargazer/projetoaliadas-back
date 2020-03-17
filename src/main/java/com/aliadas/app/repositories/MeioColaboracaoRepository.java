package com.aliadas.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aliadas.app.domain.MeioColaboracao;

@Repository
public interface MeioColaboracaoRepository extends JpaRepository<MeioColaboracao, Long> {
	
}
