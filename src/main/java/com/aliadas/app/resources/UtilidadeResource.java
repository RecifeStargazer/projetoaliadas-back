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
import com.aliadas.app.api.model.CausaSocialDTO;
import com.aliadas.app.api.model.CidadeDTO;
import com.aliadas.app.api.model.EstadoDTO;
import com.aliadas.app.api.model.MeioColaboracaoDTO;
import com.aliadas.app.api.model.PartidoDTO;
import com.aliadas.app.services.UtilidadeService;

@RestController
public class UtilidadeResource implements UtilidadesApi {

	@Autowired
	UtilidadeService utilidadeService;

	@Override
	@RequestMapping(value = "/utilidades/addCausaSocial", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.POST)
	public ResponseEntity<CausaSocialDTO> addCausaSocial(@Valid CausaSocialDTO causaSocial) {
		CausaSocialDTO causaSocialRetorno;
		causaSocial.setId(null);
		causaSocialRetorno = utilidadeService.addCausaSocial(causaSocial);
		return new ResponseEntity<CausaSocialDTO>(causaSocialRetorno, HttpStatus.OK);
	}

	@Override
	@RequestMapping(value = "/utilidades/addMeioColaboracao", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.POST)
	public ResponseEntity<MeioColaboracaoDTO> addMeioColaboracao(@Valid MeioColaboracaoDTO meioColaboracao) {
		MeioColaboracaoDTO meioColaboracaoRetorno;
		meioColaboracao.setId(null);
		meioColaboracaoRetorno = utilidadeService.addMeioColaboracao(meioColaboracao);
		return new ResponseEntity<MeioColaboracaoDTO>(meioColaboracaoRetorno, HttpStatus.OK);
	}

	@Override
	@RequestMapping(value = "/utilidades/getCausasSociais", produces = {
			"application/json" }, method = RequestMethod.GET)
	public ResponseEntity<List<CausaSocialDTO>> getCausasSociais() {
		List<CausaSocialDTO> listaCausaSocialRetorno;
		listaCausaSocialRetorno = utilidadeService.getCausasSociais();
		return new ResponseEntity<List<CausaSocialDTO>>(listaCausaSocialRetorno, HttpStatus.OK);
	}

	@Override
	@RequestMapping(value = "/utilidades/getMeiosColaboracao", produces = {
			"application/json" }, method = RequestMethod.GET)
	public ResponseEntity<List<MeioColaboracaoDTO>> getMeiosColaboracao() {
		List<MeioColaboracaoDTO> listaMeiosColaboracaoRetorno;
		listaMeiosColaboracaoRetorno = utilidadeService.getMeiosColaboracao();
		return new ResponseEntity<List<MeioColaboracaoDTO>>(listaMeiosColaboracaoRetorno, HttpStatus.OK);
	}

	@Override
	@RequestMapping(value = "/utilidades/getListaEstados", produces = {
			"application/json" }, method = RequestMethod.GET)
	public ResponseEntity<List<EstadoDTO>> getListaEstados() {
		List<EstadoDTO> listaEstadoRetorno;
		listaEstadoRetorno = utilidadeService.getListaEstados();
		return new ResponseEntity<List<EstadoDTO>>(listaEstadoRetorno, HttpStatus.OK);
	}

	@Override
	@RequestMapping(value = "/utilidades/{id_estado}/getListaCidadesPorEstado", produces = {
			"application/json" }, method = RequestMethod.GET)
	public ResponseEntity<List<CidadeDTO>> getListaCidadesPorEstado(@PathVariable("id_estado") Integer idEstado,
			@RequestParam(value = "primeira_letra", required = false) String primeiraLetra) {
		List<CidadeDTO> listaCidadeRetorno;
		listaCidadeRetorno = utilidadeService.getListaCidadesPorEstado(idEstado, primeiraLetra);
		return new ResponseEntity<List<CidadeDTO>>(listaCidadeRetorno, HttpStatus.OK);
	}

	@Override
	@RequestMapping(value = "/utilidades/getPartidos", produces = { "application/json" }, method = RequestMethod.GET)
	public ResponseEntity<List<PartidoDTO>> getPartidos() {
		List<PartidoDTO> listaPartidoRetorno;
		listaPartidoRetorno = utilidadeService.getListaPartidos();
		return new ResponseEntity<List<PartidoDTO>>(listaPartidoRetorno, HttpStatus.OK);
	}

}
