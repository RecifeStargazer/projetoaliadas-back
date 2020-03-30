package com.aliadas.app.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.aliadas.app.api.PerfilApi;
import com.aliadas.app.services.PerfilService;

@RestController
public class PerfilResource implements PerfilApi {

	@Autowired
	PerfilService perfilService;

	@Override
	public ResponseEntity<Void> deleteProFilePhoto(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Void> getProfileImage(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Void> uploadProFilePhoto(Long id, String additionalMetadata, MultipartFile file) {
		// TODO Auto-generated method stub
		return null;
	}
}
