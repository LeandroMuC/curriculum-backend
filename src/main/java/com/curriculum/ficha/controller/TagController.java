package com.curriculum.ficha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curriculum.ficha.model.Tag;
import com.curriculum.ficha.service.ITagService;

@Service
@RestController
@RequestMapping("/Tag")
public class TagController {
	@Autowired
	private ITagService service;
	@PostMapping(consumes= MediaType.APPLICATION_JSON_VALUE)
	public Tag registrar(@RequestBody Tag t) {
		return service.registrar(t);
	}
	
	@GetMapping(value="/listarTag")
	public ResponseEntity<List<Tag>> ObtenerTag(){
		List<Tag> tag = service.listarTag();
		return new ResponseEntity<List<Tag>>(tag, HttpStatus.OK);	
	}
	@DeleteMapping("/{id}")
	public String deleteById(@PathVariable("id") Integer id) throws Exception {
	    service.Eliminar(id);
	    return "Tag eliminado correctamente";
	}
    @PutMapping
    public Tag update(@RequestBody Tag tag){
        return service.Actualizar(tag);
    }
}
