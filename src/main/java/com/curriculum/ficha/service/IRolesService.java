package com.curriculum.ficha.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.curriculum.ficha.model.Roles;
@Service
public interface IRolesService {
	Roles registrar(Roles r);
	List<Roles> listarRoles();
	void Eliminar(int idRoles);
	Roles Actualizar(Roles r);
}
