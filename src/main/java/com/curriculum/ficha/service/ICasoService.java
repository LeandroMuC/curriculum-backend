package com.curriculum.ficha.service;

import org.springframework.stereotype.Service;

import com.curriculum.ficha.model.Caso;
@Service
public interface ICasoService {
	Caso registrar(Caso c);
	Caso getCasoById(Integer idCaso);

}
