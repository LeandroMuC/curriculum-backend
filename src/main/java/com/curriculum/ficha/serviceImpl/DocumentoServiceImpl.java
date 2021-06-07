package com.curriculum.ficha.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curriculum.ficha.model.Documento;
import com.curriculum.ficha.repository.IDocumentoRepository;
import com.curriculum.ficha.service.IDocumentoService;

@Service 
public class DocumentoServiceImpl implements IDocumentoService {
	@Autowired
	private IDocumentoRepository repository;
	@Override
	public Documento registrar(Documento d) {
		// TODO Auto-generated method stub
		return repository.save(d);
	}

	@Override
	public Documento GetDocumentoByIdFicha(Integer idFicha) {
		// TODO Auto-generated method stub
		return repository.getOne(idFicha);
	}

}
