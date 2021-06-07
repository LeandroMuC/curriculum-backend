package com.curriculum.ficha.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curriculum.ficha.model.Caso;
import com.curriculum.ficha.repository.ICasoFichaRepository;
import com.curriculum.ficha.repository.ICasoRepository;
import com.curriculum.ficha.service.ICasoService;

@Service
public class CasoServiceImpl implements ICasoService {
	@Autowired
	private  ICasoRepository repository;
	@Override
	public Caso registrar(Caso c) {
		// TODO Auto-generated method stub
		return repository.save(c);
	}

	@Override
	public Caso getCasoById(Integer idCaso) {
		// TODO Auto-generated method stub
		return repository.getOne(idCaso);
	}

}
