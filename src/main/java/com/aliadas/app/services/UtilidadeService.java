package com.aliadas.app.services;

import java.util.List;

import com.aliadas.app.api.model.CausaSocial;
import com.aliadas.app.api.model.Cidade;
import com.aliadas.app.api.model.Estado;
import com.aliadas.app.api.model.MeioColaboracao;

public interface UtilidadeService {

	CausaSocial addCausaSocial(CausaSocial causaSocial);

	MeioColaboracao addMeioColaboracao(MeioColaboracao meioColaboracao);

	List<CausaSocial> getCausasSociais();

	List<MeioColaboracao> getMeiosColaboracao();

	List<Estado> getListaEstados();

	List<Cidade> getListaCidadesPorEstado(Integer idEstado, String primeiraLetra);
}
