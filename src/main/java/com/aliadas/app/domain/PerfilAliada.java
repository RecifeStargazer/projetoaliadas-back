package com.aliadas.app.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class PerfilAliada extends Perfil {

	private static final long serialVersionUID = 1L;

	private Boolean filiadaAPartido;

	private Boolean fezMilitancia;

	@ManyToOne
	@JoinColumn(name = "id_partido")
	private Partido partido;

	
	@OneToMany
	@JoinColumn(name = "id_causas_sociais")
	private List<CausaSocial> causasSociais = new ArrayList<>();

	@OneToMany
	@JoinColumn(name = "id_meios_colaboracao")
	private List<MeioColaboracao> meiosColaboracao = new ArrayList<>();

	@JsonManagedReference
	@ManyToMany
	@JoinTable(name = "aliada_candidata", joinColumns = @JoinColumn(name = "id_perfil_aliada"), inverseJoinColumns = @JoinColumn(name = "id_perfil_candidata"))
	private List<PerfilCandidata> candidatasApoiadas = new ArrayList<>();

}
