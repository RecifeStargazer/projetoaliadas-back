package com.aliadas.app.resources;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aliadas.app.api.AliadasApi;
import com.aliadas.app.api.model.Profile;

@Controller
public class AliadaResource implements AliadasApi {

	@Override
	@RequestMapping(value = "/v1/aliadas/{Id}/afins", produces = { "application/json" }, method = RequestMethod.GET)
	public ResponseEntity<List<Profile>> getCandidatasPorAfinidade(Integer id, Integer page, Integer perpage) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping(value = "/aliadas/{Id}/seguidoras", produces = { "application/json" }, method = RequestMethod.GET)
	public ResponseEntity<List<Profile>> getFollowers(Integer id, Integer page, Integer perpage) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping(value = "/aliadas/{Id}/missoes", produces = { "application/json" }, method = RequestMethod.GET)
	public ResponseEntity<List<Profile>> getMissoesCandidata(Integer id, Integer page, Integer perpage) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping(value = "/aliadas/{Id}/seguidas", produces = { "application/json" }, method = RequestMethod.GET)
	public ResponseEntity<List<Profile>> getSeguidas(Integer id, Integer page, Integer perpage) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping(value = "/aliadas/login", produces = { "application/xml",
			"application/json" }, method = RequestMethod.GET)
	public ResponseEntity<String> loginAliada(@NotNull String username, @NotNull String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping(value = "/aliadas/logout", produces = { "application/json" }, method = RequestMethod.GET)
	public ResponseEntity<Void> logoutAliada() {
		// TODO Auto-generated method stub
		return null;
	}
}
