package com.aliadas.app.services;

import com.aliadas.app.api.model.CausaSocial;
import com.aliadas.app.api.model.MeioColaboracao;
import com.aliadas.app.api.model.PerfilAliada;
import com.aliadas.app.api.model.PerfilUsuaria;

public interface PerfilService {
	
	PerfilAliada addPerfilAliada(PerfilAliada userProfile);
	
	Void deleteProFilePhoto(Long id, String apiKey);
	
	PerfilUsuaria editProfile(PerfilUsuaria userProfile);
	
	String getProfileImage(Integer id);

	CausaSocial addCausaSocial(CausaSocial causaSocial);

	MeioColaboracao addMeioColaboracao(MeioColaboracao meioColaboracao);
}
