package com.aliadas.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.aliadas.app.domain.Perfil;

@Repository
public interface PerfilRepository extends JpaRepository<Perfil, Long> {
	
}
