package com.aliadas.app.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.aliadas.app.domain.enums.TipoPerfil;

@Entity
public class PerfilAliada extends Perfil {

	private static final long serialVersionUID = 1L;

	private Boolean filiadaAPartido;

	private Boolean fezMilitancia;

	@ManyToOne
	@JoinColumn(name = "id_partido")
	private Partido partido;

	@ManyToMany
	@JoinTable(name = "causas_apoiadas_aliada", joinColumns = @JoinColumn(name = "id_perfil_aliada"), inverseJoinColumns = @JoinColumn(name = "id_causas_apoiadas_aliada"))
	private List<CausaSocial> causasApoiadas = new ArrayList<>();

	@ManyToMany
	@JoinTable(name = "meios_colaboracao_aliada", joinColumns = @JoinColumn(name = "id_perfil_aliada"), inverseJoinColumns = @JoinColumn(name = "id_meio_colaboracao_aliada"))
	private List<MeioColaboracao> meiosColaboracao = new ArrayList<>();

	@ManyToMany
	@JoinTable(name = "candidatas_apoiadas", joinColumns = @JoinColumn(name = "id_perfil_aliada"), inverseJoinColumns = @JoinColumn(name = "id_perfil_candidata"))
	private List<PerfilCandidata> candidatasApoiadas = new ArrayList<>();

	public PerfilAliada() {

	}

	public PerfilAliada(long id, TipoPerfil tipoUsuaria, String email, String nomeCompleto, String nomeSocial,
			Integer idFotoPerfil, String descricaoPerfil, Boolean flagCompromisso, Cidade cidade) {
		super(id, tipoUsuaria, email, nomeCompleto, nomeSocial, idFotoPerfil, descricaoPerfil, flagCompromisso, cidade);
	}

	public Boolean getFiliadaAPartido() {
		return filiadaAPartido;
	}

	public void setFiliadaAPartido(Boolean filiadaAPartido) {
		this.filiadaAPartido = filiadaAPartido;
	}

	public Boolean getFezMilitancia() {
		return fezMilitancia;
	}

	public void setFezMilitancia(Boolean fezMilitancia) {
		this.fezMilitancia = fezMilitancia;
	}

	public Partido getPartido() {
		return partido;
	}

	public void setPartido(Partido partido) {
		this.partido = partido;
	}

	public List<CausaSocial> getCausasApoiadas() {
		return causasApoiadas;
	}

	public void setCausasApoiadas(List<CausaSocial> causasApoiadas) {
		this.causasApoiadas = causasApoiadas;
	}

	public List<MeioColaboracao> getMeiosColaboracao() {
		return meiosColaboracao;
	}

	public void setMeiosColaboracao(List<MeioColaboracao> meiosColaboracao) {
		this.meiosColaboracao = meiosColaboracao;
	}

	public List<PerfilCandidata> getCandidatasApoiadas() {
		return candidatasApoiadas;
	}

	public void setCandidatasApoiadas(List<PerfilCandidata> candidatasApoiadas) {
		this.candidatasApoiadas = candidatasApoiadas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((candidatasApoiadas == null) ? 0 : candidatasApoiadas.hashCode());
		result = prime * result + ((causasApoiadas == null) ? 0 : causasApoiadas.hashCode());
		result = prime * result + ((fezMilitancia == null) ? 0 : fezMilitancia.hashCode());
		result = prime * result + ((filiadaAPartido == null) ? 0 : filiadaAPartido.hashCode());
		result = prime * result + ((meiosColaboracao == null) ? 0 : meiosColaboracao.hashCode());
		result = prime * result + ((partido == null) ? 0 : partido.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PerfilAliada other = (PerfilAliada) obj;
		if (candidatasApoiadas == null) {
			if (other.candidatasApoiadas != null)
				return false;
		} else if (!candidatasApoiadas.equals(other.candidatasApoiadas))
			return false;
		if (causasApoiadas == null) {
			if (other.causasApoiadas != null)
				return false;
		} else if (!causasApoiadas.equals(other.causasApoiadas))
			return false;
		if (fezMilitancia == null) {
			if (other.fezMilitancia != null)
				return false;
		} else if (!fezMilitancia.equals(other.fezMilitancia))
			return false;
		if (filiadaAPartido == null) {
			if (other.filiadaAPartido != null)
				return false;
		} else if (!filiadaAPartido.equals(other.filiadaAPartido))
			return false;
		if (meiosColaboracao == null) {
			if (other.meiosColaboracao != null)
				return false;
		} else if (!meiosColaboracao.equals(other.meiosColaboracao))
			return false;
		if (partido == null) {
			if (other.partido != null)
				return false;
		} else if (!partido.equals(other.partido))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PerfilAliada [filiadaAPartido=" + filiadaAPartido + ", fezMilitancia=" + fezMilitancia + ", partido="
				+ partido + ", causasApoiadas=" + causasApoiadas + ", meiosColaboracao=" + meiosColaboracao
				+ ", candidatasApoiadas=" + candidatasApoiadas + "]";
	}

}
