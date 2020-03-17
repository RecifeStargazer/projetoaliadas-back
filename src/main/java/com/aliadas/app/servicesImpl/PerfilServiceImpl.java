package com.aliadas.app.servicesImpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aliadas.app.api.model.FirstTimeProfile;
import com.aliadas.app.api.model.Profile;
import com.aliadas.app.domain.Perfil;
import com.aliadas.app.repositories.PerfilRepository;
import com.aliadas.app.services.PerfilService;

@Service
public class PerfilServiceImpl implements PerfilService{

	@Autowired 
	PerfilRepository perfilRepository;
	
	@Autowired
	ModelMapper mapper;
	
	@Override
	public Profile addProfile(FirstTimeProfile userProfile) {
		Perfil perfilToSave = mapper.map(userProfile.getProfile(), Perfil.class);
		Perfil perfilSalvo = perfilRepository.save(perfilToSave);
		return mapper.map(perfilSalvo, Profile.class);
	}

	@Override
	public Void deleteProFilePhoto(Long id, String apiKey) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Profile editProfile(FirstTimeProfile userProfile) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getProfileImage(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
