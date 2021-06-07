package com.curriculum.ficha.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curriculum.ficha.model.Tag;
import com.curriculum.ficha.repository.ITagRepository;
import com.curriculum.ficha.service.ITagService;

@Service
public class TagServiceImpl implements ITagService  {
	@Autowired
	private ITagRepository repository;

	@Override
	public Tag registrar(Tag t) {
		// TODO Auto-generated method stub
		return repository.save(t);
	}

	@Override
	public List<Tag> listarTag() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public void Eliminar(int idTag) {
		// TODO Auto-generated method stub
		repository.deleteById(idTag);
	}

	@Override
	public Tag Actualizar(Tag tag) {
		// TODO Auto-generated method stub
		return repository.save(tag);
	}

	@Override
	public Tag getTagById(int idTag) {
		// TODO Auto-generated method stub
		return repository.getOne(idTag);
	}

}
