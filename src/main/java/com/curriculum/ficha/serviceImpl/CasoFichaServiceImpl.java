package com.curriculum.ficha.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curriculum.ficha.model.CasoFicha;
import com.curriculum.ficha.repository.ICasoFichaRepository;
import com.curriculum.ficha.service.ICasoFichaService;

@Service
public class CasoFichaServiceImpl implements ICasoFichaService {
	@Autowired
	private ICasoFichaRepository repository;
	@Override
	public CasoFicha getCasoFichaById(Integer idCasoFicha) {
		// TODO Auto-generated method stub
		return repository.getOne(idCasoFicha);
	}

	@Override
	public CasoFicha registrar(CasoFicha c) {
		// TODO Auto-generated method stub
		return repository.save(c);
	}

}
