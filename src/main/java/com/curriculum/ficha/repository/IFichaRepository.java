package com.curriculum.ficha.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.curriculum.ficha.model.Ficha;

public interface IFichaRepository extends JpaRepository<Ficha,Integer> {
	@Query(value="select * from vw_ficha where id_ficha=:desc_id_ficha",nativeQuery=true)
	List<Object[]> getFichaByIdFicha(@Param("desc_id_ficha") Integer desc_id_ficha );
	
	@Query(value="select * from vw_ficha where id_roles=:desc_id_roles",nativeQuery=true)
	List<Object[]> getFichaByIdRoles(@Param("desc_id_roles") Integer desc_id_roles );

}
