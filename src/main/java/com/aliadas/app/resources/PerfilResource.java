package com.aliadas.app.resources;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.aliadas.app.api.PerfilApi;
import com.aliadas.app.api.model.FirstTimeProfile;
import com.aliadas.app.api.model.ModelApiResponse;
import com.aliadas.app.api.model.Profile;
import com.aliadas.app.services.PerfilService;

@RestController
public class PerfilResource implements PerfilApi {

	@Autowired
	PerfilService perfilService;

	@Override
	@RequestMapping(value ="/perfil", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.POST)
	public ResponseEntity<Profile> addProfile(@Valid FirstTimeProfile userProfile) {
		Profile profile;
		profile = perfilService.addProfile(userProfile);
		return new ResponseEntity<Profile>(profile, HttpStatus.OK);
	}

	@Override
	@RequestMapping(value = "/perfil/{Id}/deleteProFilePhoto", produces = { "application/xml",
			"application/json" }, method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteProFilePhoto(Long id, String apiKey) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping(value = "/perfil", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.PUT)
	public ResponseEntity<Profile> editProfile(@Valid FirstTimeProfile userProfile) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping(value = "/perfil/{Id}/getProfileImage", produces = { "image/png", "image/gif",
			"image/jpeg" }, method = RequestMethod.GET)
	public ResponseEntity<Void> getProfileImage(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping(value = "/perfil/{Id}/uploadProfileImage", produces = { "application/json" }, consumes = {
			"multipart/form-data" }, method = RequestMethod.POST)
	public ResponseEntity<ModelApiResponse> uploadProFilePhoto(Long id, String additionalMetadata, MultipartFile file) {
		// TODO Auto-generated method stub
		return null;
	}

}
