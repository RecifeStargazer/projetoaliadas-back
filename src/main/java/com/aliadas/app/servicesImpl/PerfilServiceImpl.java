package com.aliadas.app.servicesImpl;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aliadas.app.api.model.CausaSocial;
import com.aliadas.app.api.model.MeioColaboracao;
import com.aliadas.app.api.model.PerfilUsuaria;
import com.aliadas.app.domain.Perfil;
import com.aliadas.app.domain.PerfilAliada;
import com.aliadas.app.repositories.PerfilRepository;
import com.aliadas.app.services.PerfilService;

@Service
public class PerfilServiceImpl implements PerfilService{

	@Autowired 
	PerfilRepository perfilRepository;
	
	@Autowired
	ModelMapper mapper;
	
	@Override
	public com.aliadas.app.api.model.PerfilAliada addPerfilAliada(com.aliadas.app.api.model.PerfilAliada userProfile) {
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		PerfilAliada perfilToSave = mapper.map(userProfile, PerfilAliada.class);
		PerfilAliada perfilSalvo = perfilRepository.save(perfilToSave);
		return mapper.map(perfilSalvo, com.aliadas.app.api.model.PerfilAliada.class);
	}

	@Override
	public Void deleteProFilePhoto(Long id, String apiKey) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getProfileImage(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PerfilUsuaria editProfile(PerfilUsuaria userProfile) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CausaSocial addCausaSocial(CausaSocial causaSocial) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MeioColaboracao addMeioColaboracao(MeioColaboracao meioColaboracao) {
		// TODO Auto-generated method stub
		return null;
	}
}
