package com.aliadas.app.servicesImpl;

import java.lang.reflect.Type;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aliadas.app.api.model.CausaSocial;
import com.aliadas.app.api.model.Cidade;
import com.aliadas.app.api.model.Estado;
import com.aliadas.app.api.model.MeioColaboracao;
import com.aliadas.app.repositories.CausaSocialRepository;
import com.aliadas.app.repositories.CidadeRepository;
import com.aliadas.app.repositories.EstadoRepository;
import com.aliadas.app.repositories.MeioColaboracaoRepository;
import com.aliadas.app.services.UtilidadeService;

@Service
public class UtilidadesServiceImpl implements UtilidadeService{

	@Autowired 
	CausaSocialRepository causaSocialRepository;
	
	@Autowired 
	MeioColaboracaoRepository meioColaboracaoRepository;
	
	@Autowired
	EstadoRepository estadoRepository;
	
	@Autowired
	CidadeRepository cidadeRepository;
	
	@Autowired
	ModelMapper mapper;

//	public UtilidadesServiceImpl() {
//		this.mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
//	}

	@Override
	public CausaSocial addCausaSocial(CausaSocial causaSocial) {
		com.aliadas.app.domain.CausaSocial causaSocialToSave = mapper.map(causaSocial, com.aliadas.app.domain.CausaSocial.class);
		com.aliadas.app.domain.CausaSocial causaSocialSalvo = causaSocialRepository.save(causaSocialToSave);
		return mapper.map(causaSocialSalvo, com.aliadas.app.api.model.CausaSocial.class);
	}

	@Override
	public MeioColaboracao addMeioColaboracao(MeioColaboracao meioColaboracao) {
		com.aliadas.app.domain.MeioColaboracao meioColaboracaoToSave = mapper.map(meioColaboracao, com.aliadas.app.domain.MeioColaboracao.class);
		com.aliadas.app.domain.MeioColaboracao meioColaboracaoSalvo = meioColaboracaoRepository.save(meioColaboracaoToSave);
		return mapper.map(meioColaboracaoSalvo, com.aliadas.app.api.model.MeioColaboracao.class);
	}

	@Override
	public List<CausaSocial> getCausasSociais() {
		List<com.aliadas.app.domain.CausaSocial> listaCausaSocial = causaSocialRepository.findAll();
		Type listType = new TypeToken<List<CausaSocial>>(){}.getType();
        List<CausaSocial> listaCausaSocialRetorno = mapper.map(listaCausaSocial, listType);
        return listaCausaSocialRetorno;
	}

	@Override
	public List<MeioColaboracao> getMeiosColaboracao() {
		List<com.aliadas.app.domain.MeioColaboracao> listaMeiosColaboracao = meioColaboracaoRepository.findAll();
		Type listType = new TypeToken<List<CausaSocial>>(){}.getType();
        List<MeioColaboracao> listaMeiosColaboracaoRetorno = mapper.map(listaMeiosColaboracao, listType);
        return listaMeiosColaboracaoRetorno;
	}

	@Override
	public List<Estado> getListaEstados() {
		List<com.aliadas.app.domain.Estado> listaEstado = estadoRepository.findAll();
		Type listType = new TypeToken<List<Estado>>(){}.getType();
        List<Estado> listaEstadoRetorno = mapper.map(listaEstado, listType);
        return listaEstadoRetorno;
	}

	@Override
	public List<Cidade> getListaCidadesPorEstado(Integer idEstado, String primeiraLetra) {
		Character pLetra =  null;
		if(!primeiraLetra.isEmpty()) {
			pLetra = primeiraLetra.charAt(0);
		}
		List<com.aliadas.app.domain.Cidade> listaCidade = cidadeRepository.findByNomeStartingWithAndEstadoId(pLetra, idEstado.longValue());
		Type listType = new TypeToken<List<Cidade>>(){}.getType();
        List<Cidade> listaCidadeRetorno = mapper.map(listaCidade, listType);
        return listaCidadeRetorno;
	}
}
