package com.curriculum.ficha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curriculum.ficha.model.CasoFicha;
import com.curriculum.ficha.model.Documento;
import com.curriculum.ficha.service.ICasoFichaService;
import com.curriculum.ficha.service.IDocumentoService;

@Service 
@RestController
@RequestMapping("/Documento")
public class DocumentoController {
	@Autowired
	private IDocumentoService service;
	@PostMapping(consumes= MediaType.APPLICATION_JSON_VALUE)
	public Documento registrar(@RequestBody Documento d) {
		return service.registrar(d);
	}
	@GetMapping(value="/{idCaso}")
	public ResponseEntity<Documento> ObtenerDocuementoById(@PathVariable("idFicha") Integer idFicha){
		Documento doc = service.GetDocumentoByIdFicha(idFicha);
		 return new ResponseEntity<Documento>(doc, HttpStatus.OK);	
	}
}
