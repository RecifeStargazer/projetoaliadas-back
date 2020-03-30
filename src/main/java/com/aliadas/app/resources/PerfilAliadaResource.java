package com.aliadas.app.resources;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aliadas.app.api.PerfilAliadaApi;
import com.aliadas.app.api.model.PerfilAliada;
import com.aliadas.app.services.PerfilService;

@RestController
public class PerfilAliadaResource implements PerfilAliadaApi {

	@Autowired
	PerfilService perfilService;
	
	@Override
	@RequestMapping(value = "/perfilAliada", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.POST)
	public ResponseEntity<PerfilAliada> addPerfilAliada(@Valid PerfilAliada perfil) {
		PerfilAliada perfilRetorno;
		perfil.setId(null);
		perfilRetorno = perfilService.addPerfilAliada(perfil);
		return new ResponseEntity<PerfilAliada>(perfilRetorno, HttpStatus.OK);
	}

	@Override
	@RequestMapping(value = "/perfilAliada/{id}", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.PUT)
	public ResponseEntity<PerfilAliada> editPerfilAliada(Long id, @Valid PerfilAliada perfil) {
		return null;
	}

	@Override
	public ResponseEntity<PerfilAliada> getPerfilAliada(Long idAliada) {
		// TODO Auto-generated method stub
		return null;
	}

}
