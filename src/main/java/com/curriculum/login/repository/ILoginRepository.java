package com.curriculum.login.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.curriculum.account.model.Account;

@Repository
public interface ILoginRepository {	
	@Transactional
	@Modifying
	@Query("Update account ac set ac.password=:clave Where ac.username=:nombre")
	void cambiarClave(@Param("clave") String clave, @Param("nombre") String nombre) throws Exception;
}

