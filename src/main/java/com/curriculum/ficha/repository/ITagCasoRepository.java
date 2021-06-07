package com.curriculum.ficha.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.curriculum.ficha.model.TagCaso;

public interface ITagCasoRepository extends JpaRepository<TagCaso,Integer> {
	
	@Query(value="select * from vw_tag_caso where id_caso=:desc_id_caso",nativeQuery=true)
	List<Object[]> getTagCasoByIdCaso(@Param("desc_id_caso") Integer desc_id_caso );

}
