package com.curriculum.ficha.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curriculum.ficha.model.Roles;

public interface IRolesRepository extends JpaRepository<Roles,Integer> {

}
