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
@Table(name= "caso_ficha")
public class CasoFicha {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCasoFicha;
	@ManyToOne
	@JoinColumn(name="id_caso",nullable=false)
	private Caso caso;
	@ManyToOne
	@JoinColumn(name="id_ficha",nullable=false)
	private Ficha ficha;
	@Column(name="inser_time",nullable=false)
	private LocalDateTime insertTime;
	public Integer getIdCasoFicha() {
		return idCasoFicha;
	}
	public void setIdCasoFicha(Integer idCasoFicha) {
		this.idCasoFicha = idCasoFicha;
	}
	public Caso getCaso() {
		return caso;
	}
	public void setCaso(Caso caso) {
		this.caso = caso;
	}
	public Ficha getFicha() {
		return ficha;
	}
	public void setFicha(Ficha ficha) {
		this.ficha = ficha;
	}
	public LocalDateTime getInsertTime() {
		return insertTime;
	}
	public void setInsertTime(LocalDateTime insertTime) {
		this.insertTime = insertTime;
	}
	
}
