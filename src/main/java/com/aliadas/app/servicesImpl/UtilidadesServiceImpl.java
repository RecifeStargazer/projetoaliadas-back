package com.aliadas.app.servicesImpl;

import java.lang.reflect.Type;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aliadas.app.api.model.CausaSocialDTO;
import com.aliadas.app.api.model.CidadeDTO;
import com.aliadas.app.api.model.EstadoDTO;
import com.aliadas.app.api.model.MeioColaboracaoDTO;
import com.aliadas.app.api.model.PartidoDTO;
import com.aliadas.app.domain.CausaSocial;
import com.aliadas.app.domain.Cidade;
import com.aliadas.app.domain.Estado;
import com.aliadas.app.domain.MeioColaboracao;
import com.aliadas.app.domain.Partido;
import com.aliadas.app.repositories.CausaSocialRepository;
import com.aliadas.app.repositories.CidadeRepository;
import com.aliadas.app.repositories.EstadoRepository;
import com.aliadas.app.repositories.MeioColaboracaoRepository;
import com.aliadas.app.repositories.PartidoRepository;
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
	PartidoRepository partidoRepository;
	
	@Autowired
	ModelMapper mapper;

//	public UtilidadesServiceImpl() {
//		this.mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
//	}

	@Override
	public CausaSocialDTO addCausaSocial(CausaSocialDTO causaSocial) {
		CausaSocial causaSocialToSave = mapper.map(causaSocial, CausaSocial.class);
		CausaSocial causaSocialSalvo = causaSocialRepository.save(causaSocialToSave);
		return mapper.map(causaSocialSalvo, CausaSocialDTO.class);
	}

	@Override
	public MeioColaboracaoDTO addMeioColaboracao(MeioColaboracaoDTO meioColaboracao) {
		MeioColaboracao meioColaboracaoToSave = mapper.map(meioColaboracao, MeioColaboracao.class);
		MeioColaboracao meioColaboracaoSalvo = meioColaboracaoRepository.save(meioColaboracaoToSave);
		return mapper.map(meioColaboracaoSalvo, MeioColaboracaoDTO.class);
	}

	@Override
	public List<CausaSocialDTO> getCausasSociais() {
		List<CausaSocial> listaCausaSocial = causaSocialRepository.findAll();
		Type listType = new TypeToken<List<CausaSocialDTO>>(){}.getType();
        List<CausaSocialDTO> listaCausaSocialRetorno = mapper.map(listaCausaSocial, listType);
        return listaCausaSocialRetorno;
	}

	@Override
	public List<MeioColaboracaoDTO> getMeiosColaboracao() {
		List<MeioColaboracao> listaMeiosColaboracao = meioColaboracaoRepository.findAll();
		Type listType = new TypeToken<List<MeioColaboracaoDTO>>(){}.getType();
        List<MeioColaboracaoDTO> listaMeiosColaboracaoRetorno = mapper.map(listaMeiosColaboracao, listType);
        return listaMeiosColaboracaoRetorno;
	}

	@Override
	public List<EstadoDTO> getListaEstados() {
		List<Estado> listaEstado = estadoRepository.findAll();
		Type listType = new TypeToken<List<EstadoDTO>>(){}.getType();
        List<EstadoDTO> listaEstadoRetorno = mapper.map(listaEstado, listType);
        return listaEstadoRetorno;
	}

	@Override
	public List<CidadeDTO> getListaCidadesPorEstado(Integer idEstado, String primeiraLetra) {
		Character pLetra =  null;
		if(primeiraLetra==null) {
			pLetra = 0;
		}
		else if(primeiraLetra!=null && !primeiraLetra.isEmpty()) {
			pLetra = primeiraLetra.charAt(0);
		}
		List<Cidade> listaCidade = cidadeRepository.findByNomeStartingWithAndEstadoId(pLetra, idEstado.longValue());
		Type listType = new TypeToken<List<CidadeDTO>>(){}.getType();
        List<CidadeDTO> listaCidadeRetorno = mapper.map(listaCidade, listType);
        return listaCidadeRetorno;
	}

	@Override
	public List<PartidoDTO> getListaPartidos() {
		List<Partido> listaPartido = partidoRepository.findAll();
		Type listType = new TypeToken<List<PartidoDTO>>(){}.getType();
        List<PartidoDTO> listaEstadoRetorno = mapper.map(listaPartido, listType);
        return listaEstadoRetorno;
	}
}
