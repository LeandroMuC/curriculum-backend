package com.curriculum.ficha.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "documento")
public class Documento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idDocumento;
	@Column(name="nombre",nullable=false)
	private String nombre;
	@Column(name="insert_time",nullable=false)
	private LocalDateTime insertTime;
	@Column(name="value",nullable=false)
	private String ruta_documento;
	@ManyToOne
	@JoinColumn(name="id_ficha",nullable=false)
	private Ficha ficha;
	public Integer getIdDocumento() {
		return idDocumento;
	}
	public void setIdDocumento(Integer idDocumento) {
		this.idDocumento = idDocumento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDateTime getInsertTime() {
		return insertTime;
	}
	public void setInsertTime(LocalDateTime insertTime) {
		this.insertTime = insertTime;
	}
	public Ficha getFicha() {
		return ficha;
	}
	public void setFicha(Ficha ficha) {
		this.ficha = ficha;
	}
	public String getRuta_documento() {
		return ruta_documento;
	}
	public void setRuta_documento(String ruta_documento) {
		this.ruta_documento = ruta_documento;
	}

}
