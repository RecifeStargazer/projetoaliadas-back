package com.aliadas.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aliadas.app.domain.Partido;

@Repository
public interface PartidoRepository extends JpaRepository<Partido, Long> {
	
}
