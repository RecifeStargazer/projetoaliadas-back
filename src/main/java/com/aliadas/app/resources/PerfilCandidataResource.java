package com.aliadas.app.resources;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aliadas.app.api.PerfilCandidataApi;
import com.aliadas.app.api.model.PerfilCandidataDTO;

@RestController
public class PerfilCandidataResource implements PerfilCandidataApi {

	@Override
	@RequestMapping(value = "/perfilCandidata", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.POST)
	public ResponseEntity<PerfilCandidataDTO> addPerfilCandidata(@Valid PerfilCandidataDTO perfil) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping(value = "/perfilCandidata/{id}", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.PUT)
	public ResponseEntity<PerfilCandidataDTO> editPerfilCandidata(Long id, @Valid PerfilCandidataDTO perfil) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<PerfilCandidataDTO> getPerfilCandidata(Long idCandidata) {
		// TODO Auto-generated method stub
		return null;
	}

}
