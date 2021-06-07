package com.curriculum.ficha.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curriculum.ficha.model.Caso;

public interface ICasoRepository extends JpaRepository<Caso,Integer> {

}
