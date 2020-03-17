package com.aliadas.app.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class PerfilCandidata extends Perfil {

	private static final long serialVersionUID = 1L;

	private Boolean primeiraCandidatura;

	private Boolean primeiroMandato;

	private Integer numeroCandidata;

	private String apelidoCandidata;

	private String cargoCandidata;

	@ManyToOne
	@JoinColumn(name = "id_partido")
	private Partido partido;

	@OneToMany
	@JoinColumn(name = "id_causas_sociais")
	private List<CausaSocial> causasSociais = new ArrayList<>();

	@OneToMany
	@JoinColumn(name = "id_meios_colaboracao")
	private List<MeioColaboracao> meiosColaboracao = new ArrayList<>();

	@JsonBackReference
	@OneToMany(mappedBy = "candidatasApoiadas")
	private List<PerfilAliada> aliadas = new ArrayList<>();

	@ElementCollection
	@Embedded
	@CollectionTable(name = "missoes")
	private Set<Missao> missoes = new HashSet<>();

	@ElementCollection
	@Embedded
	@CollectionTable(name = "meios_contato")
	private Set<MeioContato> meiosContato = new HashSet<>();

}
