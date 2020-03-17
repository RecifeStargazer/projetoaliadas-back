package com.aliadas.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aliadas.app.domain.CausaSocial;

@Repository
public interface CausaSocialRepository extends JpaRepository<CausaSocial, Long> {
	
}
