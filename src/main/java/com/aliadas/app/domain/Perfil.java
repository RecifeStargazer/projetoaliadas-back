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

	@Column(nullable=false)
	private Integer tipoUsuaria;

	@Column(unique = true)
	private String email;
	
	private String senha;

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

	public Perfil(long id, Integer tipoUsuaria, String email, String senha, String nomeCompleto, String nomeSocial,
			Integer idFotoPerfil, String descricaoPerfil, Boolean flagCompromisso, Cidade cidade) {
		super();
		this.id = id;
		this.tipoUsuaria = tipoUsuaria;
		this.email = email;
		this.senha = senha;
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

	public Integer getTipoUsuaria() {
		return tipoUsuaria;
	}

	public void setTipoUsuaria(Integer tipoUsuaria) {
		this.tipoUsuaria = tipoUsuaria;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
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
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + ((descricaoPerfil == null) ? 0 : descricaoPerfil.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((flagCompromisso == null) ? 0 : flagCompromisso.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((idFotoPerfil == null) ? 0 : idFotoPerfil.hashCode());
		result = prime * result + ((nomeCompleto == null) ? 0 : nomeCompleto.hashCode());
		result = prime * result + ((nomeSocial == null) ? 0 : nomeSocial.hashCode());
		result = prime * result + ((senha == null) ? 0 : senha.hashCode());
		result = prime * result + ((tipoUsuaria == null) ? 0 : tipoUsuaria.hashCode());
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
		if (cidade == null) {
			if (other.cidade != null)
				return false;
		} else if (!cidade.equals(other.cidade))
			return false;
		if (descricaoPerfil == null) {
			if (other.descricaoPerfil != null)
				return false;
		} else if (!descricaoPerfil.equals(other.descricaoPerfil))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (flagCompromisso == null) {
			if (other.flagCompromisso != null)
				return false;
		} else if (!flagCompromisso.equals(other.flagCompromisso))
			return false;
		if (id != other.id)
			return false;
		if (idFotoPerfil == null) {
			if (other.idFotoPerfil != null)
				return false;
		} else if (!idFotoPerfil.equals(other.idFotoPerfil))
			return false;
		if (nomeCompleto == null) {
			if (other.nomeCompleto != null)
				return false;
		} else if (!nomeCompleto.equals(other.nomeCompleto))
			return false;
		if (nomeSocial == null) {
			if (other.nomeSocial != null)
				return false;
		} else if (!nomeSocial.equals(other.nomeSocial))
			return false;
		if (senha == null) {
			if (other.senha != null)
				return false;
		} else if (!senha.equals(other.senha))
			return false;
		if (tipoUsuaria == null) {
			if (other.tipoUsuaria != null)
				return false;
		} else if (!tipoUsuaria.equals(other.tipoUsuaria))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Perfil [id=" + id + ", tipoUsuaria=" + tipoUsuaria + ", email=" + email + ", senha=" + senha
				+ ", nomeCompleto=" + nomeCompleto + ", nomeSocial=" + nomeSocial + ", idFotoPerfil=" + idFotoPerfil
				+ ", descricaoPerfil=" + descricaoPerfil + ", flagCompromisso=" + flagCompromisso + ", cidade=" + cidade
				+ "]";
	}

	
}
