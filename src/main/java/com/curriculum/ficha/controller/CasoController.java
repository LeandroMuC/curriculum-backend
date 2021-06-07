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
import com.curriculum.ficha.model.Ficha;
import com.curriculum.ficha.repository.ICasoRepository;
import com.curriculum.ficha.service.ICasoService;
import com.curriculum.ficha.service.IFichaService;

@Service 
@RestController
@RequestMapping("/Caso")
public class CasoController {
	@Autowired
	private ICasoService service;
	@PostMapping(consumes= MediaType.APPLICATION_JSON_VALUE)
	public Caso registrar(@RequestBody Caso c) {
		return service.registrar(c);
	}
	@GetMapping(value="/{idCaso}")
	public ResponseEntity<Caso> ObtenerCasoById(@PathVariable("idCaso") Integer IdCaso){
		Caso caso = service.getCasoById(IdCaso);
		 return new ResponseEntity<Caso>(caso, HttpStatus.OK);	
	}

}
