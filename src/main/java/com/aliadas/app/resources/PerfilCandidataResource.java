package com.aliadas.app.resources;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aliadas.app.api.PerfilCandidataApi;
import com.aliadas.app.api.model.PerfilCandidataDTO;
import com.aliadas.app.services.PerfilService;

@RestController
public class PerfilCandidataResource implements PerfilCandidataApi {

	@Autowired
	PerfilService perfilService;

	@Override
	@RequestMapping(value = "/perfilCandidata", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.POST)
	public ResponseEntity<PerfilCandidataDTO> addPerfilCandidata(@Valid PerfilCandidataDTO perfil) {
		PerfilCandidataDTO perfilRetorno;
		perfil.setId(null);
		perfilRetorno = perfilService.addPerfilCandidata(perfil);
		return new ResponseEntity<PerfilCandidataDTO>(perfilRetorno, HttpStatus.OK);
	}

	@Override
	@RequestMapping(value = "/perfilCandidata/{id}", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.PUT)
	public ResponseEntity<PerfilCandidataDTO> editPerfilCandidata(Long id, @Valid PerfilCandidataDTO perfil) {
		PerfilCandidataDTO perfilRetorno;
		perfilRetorno = perfilService.updatePerfilCandidata(perfil);
		return new ResponseEntity<PerfilCandidataDTO>(perfilRetorno, HttpStatus.OK);
	}

	@Override
	@RequestMapping(value = "/perfilCandidata/{id_candidata}", produces = {
			"application/json" }, method = RequestMethod.GET)
	public ResponseEntity<PerfilCandidataDTO> getPerfilCandidata(Long idCandidata) {
		PerfilCandidataDTO perfilRetorno;
		perfilRetorno = perfilService.getPerfilCandidata(idCandidata);
		return new ResponseEntity<PerfilCandidataDTO>(perfilRetorno, HttpStatus.OK);
	}

}
