package com.curriculum.ficha.service;

import org.springframework.stereotype.Service;

import com.curriculum.ficha.model.Documento;
@Service
public interface IDocumentoService {
	Documento registrar(Documento d);
	Documento GetDocumentoByIdFicha(Integer idFicha);

}
