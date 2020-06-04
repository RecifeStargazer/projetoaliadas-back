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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.aliadas.app.domain.enums.TipoPerfil;

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

	@ManyToMany
	@JoinTable(name = "causas_apoiadas_candidata", joinColumns = @JoinColumn(name = "id_perfil_candidata"), inverseJoinColumns = @JoinColumn(name = "id_causas_apoiadas_candidata"))
	private List<CausaSocial> causasSociais = new ArrayList<>();

	@ManyToMany
	@JoinTable(name = "meio_colaboracao_candidata", joinColumns = @JoinColumn(name = "id_perfil_candidata"), inverseJoinColumns = @JoinColumn(name = "id_meio_colaboracao_candidata"))
	private List<MeioColaboracao> meiosColaboracao = new ArrayList<>();

	@ManyToMany
	@JoinTable(name = "aliadas_da_candidata", joinColumns = @JoinColumn(name = "id_perfil_candidata"), inverseJoinColumns = @JoinColumn(name = "id_perfil_aliada"))
	private List<PerfilAliada> aliadas = new ArrayList<>();

	@ElementCollection
	@Embedded
	@CollectionTable(name = "missoes_candidata")
	private Set<MissaoCandidata> missoes = new HashSet<>();

	@ElementCollection
	@Embedded
	@CollectionTable(name = "meios_contato")
	private Set<MeioContato> meiosContato = new HashSet<>();

	public PerfilCandidata() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public PerfilCandidata(long id, Integer tipoUsuaria, String email, String senha, String nomeCompleto,
			String nomeSocial, Integer idFotoPerfil, String descricaoPerfil, Boolean flagCompromisso, Cidade cidade) {
		super(id, tipoUsuaria, email, senha, nomeCompleto, nomeSocial, idFotoPerfil, descricaoPerfil, flagCompromisso, cidade);
		// TODO Auto-generated constructor stub
	}



	public Boolean getPrimeiraCandidatura() {
		return primeiraCandidatura;
	}

	public void setPrimeiraCandidatura(Boolean primeiraCandidatura) {
		this.primeiraCandidatura = primeiraCandidatura;
	}

	public Boolean getPrimeiroMandato() {
		return primeiroMandato;
	}

	public void setPrimeiroMandato(Boolean primeiroMandato) {
		this.primeiroMandato = primeiroMandato;
	}

	public Integer getNumeroCandidata() {
		return numeroCandidata;
	}

	public void setNumeroCandidata(Integer numeroCandidata) {
		this.numeroCandidata = numeroCandidata;
	}

	public String getApelidoCandidata() {
		return apelidoCandidata;
	}

	public void setApelidoCandidata(String apelidoCandidata) {
		this.apelidoCandidata = apelidoCandidata;
	}

	public String getCargoCandidata() {
		return cargoCandidata;
	}

	public void setCargoCandidata(String cargoCandidata) {
		this.cargoCandidata = cargoCandidata;
	}

	public Partido getPartido() {
		return partido;
	}

	public void setPartido(Partido partido) {
		this.partido = partido;
	}

	public List<CausaSocial> getCausasSociais() {
		return causasSociais;
	}

	public void setCausasSociais(List<CausaSocial> causasSociais) {
		this.causasSociais = causasSociais;
	}

	public List<MeioColaboracao> getMeiosColaboracao() {
		return meiosColaboracao;
	}

	public void setMeiosColaboracao(List<MeioColaboracao> meiosColaboracao) {
		this.meiosColaboracao = meiosColaboracao;
	}

	public List<PerfilAliada> getAliadas() {
		return aliadas;
	}

	public void setAliadas(List<PerfilAliada> aliadas) {
		this.aliadas = aliadas;
	}

	public Set<MissaoCandidata> getMissoes() {
		return missoes;
	}

	public void setMissoes(Set<MissaoCandidata> missoes) {
		this.missoes = missoes;
	}

	public Set<MeioContato> getMeiosContato() {
		return meiosContato;
	}

	public void setMeiosContato(Set<MeioContato> meiosContato) {
		this.meiosContato = meiosContato;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((aliadas == null) ? 0 : aliadas.hashCode());
		result = prime * result + ((apelidoCandidata == null) ? 0 : apelidoCandidata.hashCode());
		result = prime * result + ((cargoCandidata == null) ? 0 : cargoCandidata.hashCode());
		result = prime * result + ((causasSociais == null) ? 0 : causasSociais.hashCode());
		result = prime * result + ((meiosColaboracao == null) ? 0 : meiosColaboracao.hashCode());
		result = prime * result + ((meiosContato == null) ? 0 : meiosContato.hashCode());
		result = prime * result + ((missoes == null) ? 0 : missoes.hashCode());
		result = prime * result + ((numeroCandidata == null) ? 0 : numeroCandidata.hashCode());
		result = prime * result + ((partido == null) ? 0 : partido.hashCode());
		result = prime * result + ((primeiraCandidatura == null) ? 0 : primeiraCandidatura.hashCode());
		result = prime * result + ((primeiroMandato == null) ? 0 : primeiroMandato.hashCode());
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
		PerfilCandidata other = (PerfilCandidata) obj;
		if (aliadas == null) {
			if (other.aliadas != null)
				return false;
		} else if (!aliadas.equals(other.aliadas))
			return false;
		if (apelidoCandidata == null) {
			if (other.apelidoCandidata != null)
				return false;
		} else if (!apelidoCandidata.equals(other.apelidoCandidata))
			return false;
		if (cargoCandidata == null) {
			if (other.cargoCandidata != null)
				return false;
		} else if (!cargoCandidata.equals(other.cargoCandidata))
			return false;
		if (causasSociais == null) {
			if (other.causasSociais != null)
				return false;
		} else if (!causasSociais.equals(other.causasSociais))
			return false;
		if (meiosColaboracao == null) {
			if (other.meiosColaboracao != null)
				return false;
		} else if (!meiosColaboracao.equals(other.meiosColaboracao))
			return false;
		if (meiosContato == null) {
			if (other.meiosContato != null)
				return false;
		} else if (!meiosContato.equals(other.meiosContato))
			return false;
		if (missoes == null) {
			if (other.missoes != null)
				return false;
		} else if (!missoes.equals(other.missoes))
			return false;
		if (numeroCandidata == null) {
			if (other.numeroCandidata != null)
				return false;
		} else if (!numeroCandidata.equals(other.numeroCandidata))
			return false;
		if (partido == null) {
			if (other.partido != null)
				return false;
		} else if (!partido.equals(other.partido))
			return false;
		if (primeiraCandidatura == null) {
			if (other.primeiraCandidatura != null)
				return false;
		} else if (!primeiraCandidatura.equals(other.primeiraCandidatura))
			return false;
		if (primeiroMandato == null) {
			if (other.primeiroMandato != null)
				return false;
		} else if (!primeiroMandato.equals(other.primeiroMandato))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PerfilCandidata [primeiraCandidatura=" + primeiraCandidatura + ", primeiroMandato=" + primeiroMandato
				+ ", numeroCandidata=" + numeroCandidata + ", apelidoCandidata=" + apelidoCandidata
				+ ", cargoCandidata=" + cargoCandidata + ", partido=" + partido + ", causasSociais=" + causasSociais
				+ ", meiosColaboracao=" + meiosColaboracao + ", aliadas=" + aliadas + ", missoes=" + missoes
				+ ", meiosContato=" + meiosContato + "]";
	}
	
		

}
