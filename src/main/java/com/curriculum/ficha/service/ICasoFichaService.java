package com.curriculum.ficha.service;

import org.springframework.stereotype.Service;

import com.curriculum.ficha.model.CasoFicha;
@Service
public interface ICasoFichaService {
	CasoFicha registrar(CasoFicha c);
	CasoFicha getCasoFichaById(Integer idCasoFicha);

}
