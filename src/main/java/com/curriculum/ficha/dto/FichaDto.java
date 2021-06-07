package com.curriculum.ficha.dto;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.curriculum.ficha.model.Caso;
import com.curriculum.ficha.model.Documento;
import com.curriculum.ficha.model.Ficha;
import com.curriculum.ficha.model.Roles;
import com.curriculum.ficha.model.Tag;

public class FichaDto {
	private Ficha ficha;
	private Caso caso;
	private Tag tag;
	private Roles rol;
	private Documento doc;
	
	public Ficha getFicha() {
		return ficha;
	}
	public void setFicha(Ficha ficha) {
		this.ficha = ficha;
	}
	public Caso getCaso() {
		return caso;
	}
	public void setCaso(Caso caso) {
		this.caso = caso;
	}
	public Tag getTag() {
		return tag;
	}
	public void setTag(Tag tag) {
		this.tag = tag;
	}
	public Roles getRol() {
		return rol;
	}
	public void setRol(Roles rol) {
		this.rol = rol;
	}
	public Documento getDoc() {
		return doc;
	}
	public void setDoc(Documento doc) {
		this.doc = doc;
	}
}
