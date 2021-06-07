package com.curriculum.ficha.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curriculum.ficha.model.Roles;
import com.curriculum.ficha.repository.IRolesRepository;
import com.curriculum.ficha.service.IRolesService;

@Service
public class RolesServiceImpl implements IRolesService{
	@Autowired
	private IRolesRepository repository;
	@Override
	public Roles registrar(Roles r) {
		// TODO Auto-generated method stub
		return repository.save(r);
	}

	@Override
	public List<Roles> listarRoles() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public void Eliminar(int idRoles) {
		// TODO Auto-generated method stub
		repository.deleteById(idRoles);
	}

	@Override
	public Roles Actualizar(Roles r) {
		// TODO Auto-generated method stub
		return repository.save(r);
	}

}
