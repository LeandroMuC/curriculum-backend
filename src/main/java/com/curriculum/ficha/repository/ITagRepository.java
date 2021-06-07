package com.curriculum.ficha.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curriculum.ficha.model.Tag;

public interface ITagRepository extends JpaRepository<Tag,Integer> {

}
