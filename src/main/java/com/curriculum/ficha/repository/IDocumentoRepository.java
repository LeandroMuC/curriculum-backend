package com.curriculum.ficha.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curriculum.ficha.model.Documento;

public interface IDocumentoRepository extends JpaRepository<Documento,Integer> {

}
