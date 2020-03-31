package com.aliadas.app.resources;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aliadas.app.api.PerfilAliadaApi;
import com.aliadas.app.api.model.PerfilAliadaDTO;
import com.aliadas.app.services.PerfilService;

@RestController
public class PerfilAliadaResource implements PerfilAliadaApi {

	@Autowired
	PerfilService perfilService;

	@Override
	@RequestMapping(value = "/perfilAliada", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.POST)
	public ResponseEntity<PerfilAliadaDTO> addPerfilAliada(@Valid PerfilAliadaDTO perfil) {
		PerfilAliadaDTO perfilRetorno;
		perfil.setId(null);
		perfilRetorno = perfilService.addPerfilAliada(perfil);
		return new ResponseEntity<PerfilAliadaDTO>(perfilRetorno, HttpStatus.OK);
	}

	@Override
	@RequestMapping(value = "/perfilAliada/{id}/editar", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.PUT)
	public ResponseEntity<PerfilAliadaDTO> editPerfilAliada(Long id, @Valid PerfilAliadaDTO perfil) {
		PerfilAliadaDTO perfilRetorno;
		perfilRetorno = perfilService.updatePerfilAliada(perfil);
		return new ResponseEntity<PerfilAliadaDTO>(perfilRetorno, HttpStatus.OK);
	}

	@Override
	@RequestMapping(value = "/perfilAliada/{id_aliada}", produces = { "application/json" }, method = RequestMethod.GET)
	public ResponseEntity<PerfilAliadaDTO> getPerfilAliada(Long idAliada) {
		PerfilAliadaDTO perfilRetorno;
		perfilRetorno = perfilService.getPerfilAliada(idAliada);
		return new ResponseEntity<PerfilAliadaDTO>(perfilRetorno, HttpStatus.OK);
	}

}
