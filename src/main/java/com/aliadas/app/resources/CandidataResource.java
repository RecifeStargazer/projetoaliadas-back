package com.aliadas.app.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.aliadas.app.api.CandidatasApi;
import com.aliadas.app.api.model.PerfilAliada;
import com.aliadas.app.services.PerfilService;

@RestController
public class CandidataResource implements CandidatasApi{
	
	@Autowired
	PerfilService perfilService;
	
	@Override
	public ResponseEntity<List<PerfilAliada>> getSeguidoras(Integer id, Integer page, Integer perpage) {
		// TODO Auto-generated method stub
		return null;
	}

}
