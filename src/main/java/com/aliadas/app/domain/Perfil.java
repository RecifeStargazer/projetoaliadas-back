package com.aliadas.app.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.aliadas.app.domain.enums.TipoPerfil;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Perfil implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private Integer tipoUsuaria;

//	@Column(unique = true)
	private String email;

	private String nomeCompleto;

	private String nomeSocial;

	private Integer idFotoPerfil;

	private String descricaoPerfil;

	private Boolean flagCompromisso;

	@ManyToOne
	@JoinColumn(name = "cidade_id")
	private Cidade cidade;

	public Perfil() {

	}

	public Perfil(long id, TipoPerfil tipoUsuaria, String email, String nomeCompleto, String nomeSocial,
			Integer idFotoPerfil, String descricaoPerfil, Boolean flagCompromisso, Cidade cidade) {
		super();
		this.id = id;
		this.tipoUsuaria = tipoUsuaria.getCodigo();
		this.email = email;
		this.nomeCompleto = nomeCompleto;
		this.nomeSocial = nomeSocial;
		this.idFotoPerfil = idFotoPerfil;
		this.descricaoPerfil = descricaoPerfil;
		this.flagCompromisso = flagCompromisso;
		this.cidade = cidade;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public TipoPerfil getTipoUsuaria() {
		return TipoPerfil.toEnum(tipoUsuaria);
	}

	public void setTipoUsuaria(TipoPerfil tipoUsuaria) {
		this.tipoUsuaria = tipoUsuaria.getCodigo();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getNomeSocial() {
		return nomeSocial;
	}

	public void setNomeSocial(String nomeSocial) {
		this.nomeSocial = nomeSocial;
	}

	public Integer getIdFotoPerfil() {
		return idFotoPerfil;
	}

	public void setIdFotoPerfil(Integer idFotoPerfil) {
		this.idFotoPerfil = idFotoPerfil;
	}

	public String getDescricaoPerfil() {
		return descricaoPerfil;
	}

	public void setDescricaoPerfil(String descricaoPerfil) {
		this.descricaoPerfil = descricaoPerfil;
	}

	public Boolean getFlagCompromisso() {
		return flagCompromisso;
	}

	public void setFlagCompromisso(Boolean flagCompromisso) {
		this.flagCompromisso = flagCompromisso;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Perfil other = (Perfil) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Perfil [id=" + id + ", tipoUsuaria=" + tipoUsuaria + ", email=" + email + ", nomeCompleto="
				+ nomeCompleto + ", nomeSocial=" + nomeSocial + ", idFotoPerfil=" + idFotoPerfil + ", descricaoPerfil="
				+ descricaoPerfil + ", flagCompromisso=" + flagCompromisso + ", cidade=" + cidade + "]";
	}

}
