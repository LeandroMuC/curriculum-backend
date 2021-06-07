package com.curriculum.ficha.controller;

import java.util.List;

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

import com.curriculum.ficha.dto.TagCasoDto;
import com.curriculum.ficha.model.Caso;
import com.curriculum.ficha.model.Tag;
import com.curriculum.ficha.model.TagCaso;
import com.curriculum.ficha.service.ITagCasoService;
import com.curriculum.ficha.service.ITagService;

@Service
@RestController
@RequestMapping("/TagCaso")
public class TagCasoController {
	@Autowired
	private ITagCasoService service;
	@PostMapping(consumes= MediaType.APPLICATION_JSON_VALUE)
	public TagCaso registrar(@RequestBody TagCaso t) {
		return service.registart(t);
	}
	@GetMapping(value="/id}")
	public ResponseEntity<TagCasoDto> ObtenerTagCasoByIdCaso(@PathVariable("idCaso") Integer idCaso){
		TagCasoDto tc= service.getCasoById(idCaso);
		return new ResponseEntity<TagCasoDto>(tc, HttpStatus.OK);	
	}
}
