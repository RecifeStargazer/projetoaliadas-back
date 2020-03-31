package com.aliadas.app.resources;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.aliadas.app.api.AliadasApi;
import com.aliadas.app.api.model.MissoesDTO;
import com.aliadas.app.api.model.PerfilCandidataDTO;
import com.aliadas.app.services.PerfilService;

@RestController
public class AliadaResource implements AliadasApi {

	@Autowired
	PerfilService perfilService;
	
	@Override
	public ResponseEntity<List<PerfilCandidataDTO>> getCandidatasPorAfinidade(Integer id, Integer page, Integer perpage) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<List<PerfilCandidataDTO>> getSeguidas(Integer id, Integer page, Integer perpage) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<String> loginAliada(@NotNull String username, @NotNull String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Void> logoutAliada() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Void> deixarDeSeguirCandidata(Integer idCandidata) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Void> seguirCandidata(Integer idCandidata) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<List<MissoesDTO>> getMissoesCandidata(Integer id, Integer page, Integer perpage) {
		// TODO Auto-generated method stub
		return null;
	}

}
