package com.curriculum.ficha.serviceImpl;

import java.time.LocalDateTime;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.curriculum.ficha.dto.FichaConsultaDto;
import com.curriculum.ficha.dto.FichaDto;
import com.curriculum.ficha.model.Caso;
import com.curriculum.ficha.model.CasoFicha;
import com.curriculum.ficha.model.Documento;
import com.curriculum.ficha.model.Ficha;
import com.curriculum.ficha.model.Tag;
import com.curriculum.ficha.model.TagCaso;
import com.curriculum.ficha.repository.IFichaRepository;
import com.curriculum.ficha.service.ICasoFichaService;
import com.curriculum.ficha.service.ICasoService;
import com.curriculum.ficha.service.IDocumentoService;
import com.curriculum.ficha.service.IFichaService;
import com.curriculum.ficha.service.IRolesService;
import com.curriculum.ficha.service.ITagCasoService;
import com.curriculum.ficha.service.ITagService;
  
@Service
public class FichaServiceImpl implements IFichaService  {
	@Autowired
	IFichaRepository repository;
	@Autowired
	ICasoService serviceCaso;
	@Autowired
	ICasoFichaService serviceCasoFicha;
	@Autowired 
	ITagCasoService serviceTagCaso;
	@Autowired
	IRolesService serviceRoles;
	@Autowired
	IDocumentoService serviceDocumento;
	@Autowired
	ITagService serviceTag;
	@Override
	public Ficha registrar(Ficha r) {
		// TODO Auto-generated method stub
		return repository.save(r);
	}

	@Override
	public Ficha Listar(Ficha r) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public ResponseEntity registrarFichaDto(FichaDto fd) {
		// TODO Auto-generated method stub
		Ficha ficha = fd.getFicha();
		ficha=registrar(ficha);
		Caso caso = fd.getCaso();
		caso = serviceCaso.registrar(caso);
		CasoFicha casoFicha= new CasoFicha();
		casoFicha.setCaso(caso);
		casoFicha.setFicha(ficha);
		casoFicha.setInsertTime(LocalDateTime.now());
		casoFicha= serviceCasoFicha.registrar(casoFicha);
		Tag tag = fd.getTag();
		tag= serviceTag.getTagById(tag.getIdTag());
		TagCaso tagCaso = new TagCaso();
		tagCaso.setDescripcion(tag.getDescripcion());
		tagCaso.setFecha(LocalDateTime.now());
		tagCaso.setInsertTime(LocalDateTime.now());
		tagCaso.setTag(tag);
		tagCaso.setCaso(caso);
		tagCaso = serviceTagCaso.registart(tagCaso);
		Documento doc = fd.getDoc();
		doc.setFicha(ficha);
		doc=serviceDocumento.registrar(doc);
		
		return new ResponseEntity<>(ficha, HttpStatus.OK);
	}
	@Override
	public FichaConsultaDto getFichabyId(Integer idFicha) {
		// TODO Auto-generated method stub
		FichaConsultaDto ficha= new FichaConsultaDto();
		repository.getFichaByIdFicha(idFicha).forEach((x)->{
			ficha.setId_ficha(Double.parseDouble(String.valueOf(x[0])));
			ficha.setApellido(String.valueOf(x[1]));
			ficha.setNombre(String.valueOf(x[2]));
			ficha.setFecha_nacimiento(String.valueOf(x[3]));
			ficha.setNumero_serie(String.valueOf(x[4]));
			ficha.setRut(String.valueOf(x[5]));
			ficha.setInsert_time(String.valueOf(x[6]));
			ficha.setVigente(Boolean.parseBoolean(String.valueOf(x[7])));
			ficha.setId_caso(Double.parseDouble(String.valueOf(x[8])));
			ficha.setNum_caso(Double.parseDouble(String.valueOf(x[9])));
			ficha.setOpened(Boolean.parseBoolean(String.valueOf(x[10])));
			ficha.setId_tag(Double.parseDouble(String.valueOf(x[11])));
			ficha.setTag(String.valueOf(x[12]));
			ficha.setId_roles(Double.parseDouble(String.valueOf(x[13])));
			ficha.setDescripcion_rol(String.valueOf(x[14]));
			ficha.setId_documento(Double.parseDouble(String.valueOf(x[15])));
			ficha.setNombre_documento(String.valueOf(x[16]));
			ficha.setValue(String.valueOf(x[17]));
		});
		return ficha;
	}

	@Override
	public FichaConsultaDto getFichaByIdRole(Integer idRole) {
		// TODO Auto-generated method stub
		FichaConsultaDto ficha= new FichaConsultaDto();
		repository.getFichaByIdRoles(idRole).forEach((x)->{
			ficha.setId_ficha(Double.parseDouble(String.valueOf(x[0])));
			ficha.setApellido(String.valueOf(x[1]));
			ficha.setNombre(String.valueOf(x[2]));
			ficha.setFecha_nacimiento(String.valueOf(x[3]));
			ficha.setNumero_serie(String.valueOf(x[4]));
			ficha.setRut(String.valueOf(x[5]));
			ficha.setInsert_time(String.valueOf(x[6]));
			ficha.setVigente(Boolean.parseBoolean(String.valueOf(x[7])));
			ficha.setId_caso(Double.parseDouble(String.valueOf(x[8])));
			ficha.setNum_caso(Double.parseDouble(String.valueOf(x[9])));
			ficha.setOpened(Boolean.parseBoolean(String.valueOf(x[10])));
			ficha.setId_tag(Double.parseDouble(String.valueOf(x[11])));
			ficha.setTag(String.valueOf(x[12]));
			ficha.setId_roles(Double.parseDouble(String.valueOf(x[13])));
			ficha.setDescripcion_rol(String.valueOf(x[14]));
			ficha.setId_documento(Double.parseDouble(String.valueOf(x[15])));
			ficha.setNombre_documento(String.valueOf(x[16]));
			ficha.setValue(String.valueOf(x[17]));
		});
		return ficha;
	}

}
