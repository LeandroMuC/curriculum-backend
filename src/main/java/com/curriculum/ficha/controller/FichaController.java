package com.curriculum.ficha.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curriculum.ficha.dto.FichaConsultaDto;
import com.curriculum.ficha.dto.FichaDto;
import com.curriculum.ficha.dto.TagCasoDto;
import com.curriculum.ficha.model.Ficha;
import com.curriculum.ficha.service.IFichaService;

import io.swagger.annotations.ApiOperation;

@Service 
@RestController
@RequestMapping("/Ficha")
public class FichaController {
	@Autowired
	private IFichaService service;
	@ApiOperation(value = "Registrar la ficha de postulacíon",
			notes = "necesita como parametro de entrada la entidad ficha",
			response = List.class,
			responseContainer = "Ficha")
	@PostMapping(consumes= MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?>  registrar(@RequestBody FichaDto f) throws Exception {
		try {
			return service.registrarFichaDto(f);
		}catch(Exception e){
			throw new Exception(e.getMessage());
		}
	}
	@GetMapping(value="/{idFicha}")
	public ResponseEntity<FichaConsultaDto> ObtenerFicha(@PathVariable("idFicha") Integer idFicha){
		FichaConsultaDto ficha= service.getFichabyId(idFicha);
		return new ResponseEntity<FichaConsultaDto>(ficha, HttpStatus.OK);	
	}
	@GetMapping(value="/role/{idRole}")
	public ResponseEntity<FichaConsultaDto> ObtenerFichaByRole(@PathVariable("idRole") Integer idRole){
		FichaConsultaDto ficha= service.getFichaByIdRole(idRole);
		return new ResponseEntity<FichaConsultaDto>(ficha, HttpStatus.OK);	
	}
}
