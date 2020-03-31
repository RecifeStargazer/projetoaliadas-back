package com.aliadas.app.services;

import com.aliadas.app.api.model.PerfilAliadaDTO;
import com.aliadas.app.api.model.PerfilCandidataDTO;

public interface PerfilService {
	
	PerfilAliadaDTO addPerfilAliada(PerfilAliadaDTO perfil);
	
	PerfilAliadaDTO updatePerfilAliada(PerfilAliadaDTO perfil);

	PerfilAliadaDTO getPerfilAliada(Long id);
	
	PerfilCandidataDTO addPerfilCandidata(PerfilCandidataDTO perfil);
	
	PerfilCandidataDTO updatePerfilCandidata(PerfilCandidataDTO perfil);

	PerfilCandidataDTO getPerfilCandidata(Long id);
	
	Void deleteProFilePhoto(Long id, String apiKey);
	
	String getProfileImage(Integer id);
}
