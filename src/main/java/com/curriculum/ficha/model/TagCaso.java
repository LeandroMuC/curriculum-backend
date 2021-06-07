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
@Table(name = "tag_caso")
public class TagCaso {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTagCaso;
	@Column(name="descripcion",nullable=false)
	private String descripcion;
	@Column(name="fecha",nullable=false)
	private LocalDateTime fecha;
	@Column(name="insert_time",nullable=false)
	private LocalDateTime insertTime;
	@ManyToOne
	@JoinColumn(name="id_tag",nullable=false)
	private Tag tag;
	@ManyToOne
	@JoinColumn(name="id_caso",nullable=false)
	private Caso caso;
	
	public Caso getCaso() {
		return caso;
	}
	public void setCaso(Caso caso) {
		this.caso = caso;
	}
	public Integer getIdTagCaso() {
		return idTagCaso;
	}
	public void setIdTagCaso(Integer idTagCaso) {
		this.idTagCaso = idTagCaso;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public LocalDateTime getInsertTime() {
		return insertTime;
	}
	public void setInsertTime(LocalDateTime insertTime) {
		this.insertTime = insertTime;
	}
	public Tag getTag() {
		return tag;
	}
	public void setTag(Tag tag) {
		this.tag = tag;
	}
	
}
