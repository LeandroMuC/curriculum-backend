package com.curriculum.ficha.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.curriculum.ficha.model.Tag;
@Service
public interface ITagService {
	Tag registrar(Tag t);
	List<Tag> listarTag();
	void Eliminar(int idTag);
	Tag Actualizar(Tag tag);
	Tag getTagById(int idTag);

}
