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

import com.curriculum.ficha.model.Caso;
import com.curriculum.ficha.model.CasoFicha;
import com.curriculum.ficha.service.ICasoFichaService;

@Service
@RestController
@RequestMapping("/CasoFicha")
public class CasoFichaController {
	@Autowired
	private ICasoFichaService service;
	@PostMapping(consumes= MediaType.APPLICATION_JSON_VALUE)
	public CasoFicha registrar(@RequestBody CasoFicha c) {
		return service.registrar(c);
	}
	@GetMapping(value="/{idCaso}")
	public ResponseEntity<CasoFicha> ObtenerCasoFichaById(@PathVariable("idCasoFicha") Integer IdCasoFicha){
		CasoFicha casoFicha = service.getCasoFichaById(IdCasoFicha);
		 return new ResponseEntity<CasoFicha>(casoFicha, HttpStatus.OK);	
	}

}
