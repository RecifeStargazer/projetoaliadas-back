package com.aliadas.app.services;

import com.aliadas.app.api.model.FirstTimeProfile;
import com.aliadas.app.api.model.Profile;

public interface PerfilService {
	
	Profile addProfile(FirstTimeProfile userProfile);
	
	Void deleteProFilePhoto(Long id, String apiKey);
	
	Profile editProfile(FirstTimeProfile userProfile);
	
	String getProfileImage(Integer id);
}
