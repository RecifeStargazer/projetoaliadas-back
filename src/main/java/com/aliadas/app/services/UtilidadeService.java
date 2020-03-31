package com.aliadas.app.services;

import java.util.List;

import com.aliadas.app.api.model.CausaSocialDTO;
import com.aliadas.app.api.model.CidadeDTO;
import com.aliadas.app.api.model.EstadoDTO;
import com.aliadas.app.api.model.MeioColaboracaoDTO;
import com.aliadas.app.api.model.PartidoDTO;

public interface UtilidadeService {

	CausaSocialDTO addCausaSocial(CausaSocialDTO causaSocial);

	MeioColaboracaoDTO addMeioColaboracao(MeioColaboracaoDTO meioColaboracao);

	List<CausaSocialDTO> getCausasSociais();

	List<MeioColaboracaoDTO> getMeiosColaboracao();

	List<EstadoDTO> getListaEstados();

	List<CidadeDTO> getListaCidadesPorEstado(Integer idEstado, String primeiraLetra);

	List<PartidoDTO> getListaPartidos();
}
