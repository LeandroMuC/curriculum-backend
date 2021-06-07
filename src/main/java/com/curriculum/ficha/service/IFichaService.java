package com.curriculum.ficha.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.curriculum.ficha.dto.FichaConsultaDto;
import com.curriculum.ficha.dto.FichaDto;
import com.curriculum.ficha.model.Ficha;

@Service 
public interface IFichaService{
	Ficha registrar(Ficha r);
	ResponseEntity registrarFichaDto(FichaDto fd);
	Ficha Listar(Ficha r);
	FichaConsultaDto getFichabyId(Integer idFicha);
	FichaConsultaDto getFichaByIdRole(Integer idRole);
}
