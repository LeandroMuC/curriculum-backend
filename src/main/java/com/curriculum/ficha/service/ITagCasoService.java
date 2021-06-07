package com.curriculum.ficha.service;

import org.springframework.stereotype.Service;

import com.curriculum.ficha.dto.TagCasoDto;
import com.curriculum.ficha.model.Caso;
import com.curriculum.ficha.model.TagCaso;
@Service
public interface ITagCasoService {
	TagCaso registart(TagCaso c);
	TagCasoDto getCasoById(Integer idCaso);
}
