package com.aliadas.app.resources;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aliadas.app.api.UtilidadesApi;
import com.aliadas.app.api.model.CausaSocial;
import com.aliadas.app.api.model.Cidade;
import com.aliadas.app.api.model.Estado;
import com.aliadas.app.api.model.MeioColaboracao;
import com.aliadas.app.services.UtilidadeService;

@RestController
public class UtilidadeResource implements UtilidadesApi {

	@Autowired
	UtilidadeService utilidadeService;

	@Override
	@RequestMapping(value = "/utilidades/addCausaSocial", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.POST)
	public ResponseEntity<CausaSocial> addCausaSocial(@Valid CausaSocial causaSocial) {
		CausaSocial causaSocialRetorno;
		causaSocial.setId(null);
		causaSocialRetorno = utilidadeService.addCausaSocial(causaSocial);
		return new ResponseEntity<CausaSocial>(causaSocialRetorno, HttpStatus.OK);
	}

	@Override
	@RequestMapping(value = "/utilidades/addMeioColaboracao", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.POST)
	public ResponseEntity<MeioColaboracao> addMeioColaboracao(@Valid MeioColaboracao meioColaboracao) {
		MeioColaboracao meioColaboracaoRetorno;
		meioColaboracao.setId(null);
		meioColaboracaoRetorno = utilidadeService.addMeioColaboracao(meioColaboracao);
		return new ResponseEntity<MeioColaboracao>(meioColaboracaoRetorno, HttpStatus.OK);
	}

	@Override
	@RequestMapping(value = "/utilidades/getCausasSociais", produces = { "application/json" }, method = RequestMethod.GET)
	public ResponseEntity<List<CausaSocial>> getCausasSociais() {
		List<CausaSocial> listaCausaSocialRetorno;
		listaCausaSocialRetorno = utilidadeService.getCausasSociais();
		return new ResponseEntity<List<CausaSocial>>(listaCausaSocialRetorno, HttpStatus.OK);
	}

	@Override
	@RequestMapping(value = "/utilidades/getMeiosColaboracao", produces = { "application/json" }, method = RequestMethod.GET)
	public ResponseEntity<List<MeioColaboracao>> getMeiosColaboracao() {
		List<MeioColaboracao> listaMeiosColaboracaoRetorno;
		listaMeiosColaboracaoRetorno = utilidadeService.getMeiosColaboracao();
		return new ResponseEntity<List<MeioColaboracao>>(listaMeiosColaboracaoRetorno, HttpStatus.OK);
	}

	@Override
	@RequestMapping(value = "/utilidades/getListaEstados", produces = { "application/json" },  method = RequestMethod.GET)
	public ResponseEntity<List<Estado>> getListaEstados() {
		List<Estado> listaEstadoRetorno;
		listaEstadoRetorno = utilidadeService.getListaEstados();
		return new ResponseEntity<List<Estado>>(listaEstadoRetorno, HttpStatus.OK);
	}

	@Override
	@RequestMapping(value = "/utilidades/{id_estado}/getListaCidadesPorEstado", produces = {
			"application/json" }, method = RequestMethod.GET)
	public ResponseEntity<List<Cidade>> getListaCidadesPorEstado(@PathVariable("id_estado") Integer idEstado,
			@RequestParam(value = "primeira_letra", required = false) String primeiraLetra) {
		List<Cidade> listaCidadeRetorno;
		listaCidadeRetorno = utilidadeService.getListaCidadesPorEstado(idEstado, primeiraLetra);
		return new ResponseEntity<List<Cidade>>(listaCidadeRetorno, HttpStatus.OK);
	}

}
