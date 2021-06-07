package com.curriculum.ficha.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curriculum.ficha.model.CasoFicha;

public interface ICasoFichaRepository extends JpaRepository<CasoFicha,Integer> {

}
