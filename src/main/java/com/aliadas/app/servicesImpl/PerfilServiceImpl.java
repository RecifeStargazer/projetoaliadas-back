package com.aliadas.app.servicesImpl;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aliadas.app.api.model.PerfilAliadaDTO;
import com.aliadas.app.api.model.PerfilCandidataDTO;
import com.aliadas.app.domain.Perfil;
import com.aliadas.app.domain.PerfilAliada;
import com.aliadas.app.domain.PerfilCandidata;
import com.aliadas.app.domain.enums.TipoPerfil;
import com.aliadas.app.repositories.PerfilRepository;
import com.aliadas.app.services.PerfilService;

@Service
public class PerfilServiceImpl implements PerfilService {

	@Autowired
	PerfilRepository perfilRepository;

	@Autowired
	ModelMapper mapper;

	@Override
	public PerfilAliadaDTO addPerfilAliada(PerfilAliadaDTO perfil) {
		PerfilAliada perfilToSave = mapper.map(perfil, PerfilAliada.class);
		perfilToSave.setTipoUsuaria(TipoPerfil.toEnum(1)); // 1 é tipo usuária = aliada
		PerfilAliada perfilSalvo = perfilRepository.save(perfilToSave);
		return mapper.map(perfilSalvo, PerfilAliadaDTO.class);
	}

	@Override
	public PerfilAliadaDTO updatePerfilAliada(PerfilAliadaDTO perfil) {
		PerfilAliada perfilToSave = mapper.map(perfil, PerfilAliada.class);
		perfilToSave.setTipoUsuaria(TipoPerfil.toEnum(1)); // 1 é tipo usuária = aliada
		PerfilAliada perfilSalvo = perfilRepository.save(perfilToSave);
		return mapper.map(perfilSalvo, PerfilAliadaDTO.class);
	}

	@Override
	public PerfilAliadaDTO getPerfilAliada(Long idAliada) {
		Optional<Perfil> perfilRecuperado = perfilRepository.findById(idAliada);
		com.aliadas.app.api.model.PerfilAliadaDTO ret = mapper.map(perfilRecuperado.get(),PerfilAliadaDTO.class);
		return ret;
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
	public PerfilCandidataDTO addPerfilCandidata(PerfilCandidataDTO perfil) {
		PerfilCandidata perfilToSave = mapper.map(perfil, PerfilCandidata.class);
		perfilToSave.setTipoUsuaria(TipoPerfil.toEnum(2)); // 2 é tipo usuária = candidata
		PerfilCandidata perfilSalvo = perfilRepository.save(perfilToSave);
		return mapper.map(perfilSalvo, PerfilCandidataDTO.class);
	}

	@Override
	public PerfilCandidataDTO updatePerfilCandidata(PerfilCandidataDTO perfil) {
		PerfilCandidata perfilToSave = mapper.map(perfil, PerfilCandidata.class);
		perfilToSave.setTipoUsuaria(TipoPerfil.toEnum(2)); // 1 é tipo usuária = aliada
		PerfilCandidata perfilSalvo = perfilRepository.save(perfilToSave);
		return mapper.map(perfilSalvo, PerfilCandidataDTO.class);
	}

	@Override
	public PerfilCandidataDTO getPerfilCandidata(Long id) {
		Optional<Perfil> perfilRecuperado = perfilRepository.findById(id);
		PerfilCandidataDTO ret = mapper.map(perfilRecuperado.get(),PerfilCandidataDTO.class);
		return ret;
	}

}
