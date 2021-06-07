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

import com.curriculum.ficha.model.Documento;
import com.curriculum.ficha.model.Ficha;
import com.curriculum.ficha.model.Roles;
import com.curriculum.ficha.model.Tag;
import com.curriculum.ficha.service.IFichaService;
import com.curriculum.ficha.service.IRolesService;

@Service 
@RestController
@RequestMapping("/Roles")
public class RolesController {
	@Autowired
	private IRolesService service;
	@PostMapping(consumes= MediaType.APPLICATION_JSON_VALUE)
	public Roles registrar(@RequestBody Roles r) {
		return service.registrar(r);
	}
	@GetMapping(value="/listarRoles")
	public ResponseEntity<List<Roles>> ObtenerRoles(){
		List<Roles> roles = service.listarRoles();
		 return new ResponseEntity<List<Roles>>(roles, HttpStatus.OK);	
	}
	@DeleteMapping("/{id}")
	public String deleteById(@PathVariable("id") Integer id) throws Exception {
	    service.Eliminar(id);
	    return "Tag eliminado correctamente";
	}
    @PutMapping
    public Roles update(@RequestBody Roles rol){
        return service.Actualizar(rol);
    }

}
