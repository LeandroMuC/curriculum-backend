package com.curriculum.ficha.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curriculum.ficha.dto.TagCasoDto;
import com.curriculum.ficha.model.Caso;
import com.curriculum.ficha.model.TagCaso;
import com.curriculum.ficha.repository.ITagCasoRepository;
import com.curriculum.ficha.service.ITagCasoService;

@Service
public class TagCasoServiceImpl implements ITagCasoService {
	@Autowired
	private ITagCasoRepository repository; 
	@Override
	public TagCaso registart(TagCaso c) {
		// TODO Auto-generated method stub
		return repository.save(c);
	}

	@Override
	public TagCasoDto getCasoById(Integer idCaso) {
		// TODO Auto-generated method stub
		TagCasoDto tagCasoDto = new TagCasoDto();
		repository.getTagCasoByIdCaso(idCaso).forEach((x)->{
			tagCasoDto.setId_tag_caso(Double.parseDouble(String.valueOf(x[0])));
			tagCasoDto.setDescripcion(String.valueOf(x[1]));
			tagCasoDto.setInsert_time(String.valueOf(x[2]));
			tagCasoDto.setFecha(String.valueOf(x[3]));
			tagCasoDto.setId_caso(Double.parseDouble(String.valueOf(x[4])));
			tagCasoDto.setClosed(Boolean.parseBoolean(String.valueOf(x[5])));
			tagCasoDto.setCreate_by(String.valueOf(x[6]));
			tagCasoDto.setNum_caso(Double.parseDouble(String.valueOf(x[7])));
			tagCasoDto.setOpened(Boolean.parseBoolean(String.valueOf(x[8])));
		});
		return tagCasoDto;
	}
 

}
