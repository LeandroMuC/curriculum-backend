package com.curriculum.ficha.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(description = "caso asociado a la ficha del postulante")
@Entity
@Table(name = "caso")
public class Caso {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCaso;
	@ApiModelProperty(notes = "Usuario que ingreso el caso")
	@Column(name="create_by",nullable=false)
	private String createBy;
	@ApiModelProperty(notes = "fecha de ingreso del caso")
	@Column(name="fecha",nullable=false)
	private LocalDateTime fecha;
	@ApiModelProperty(notes = "numero del caso")
	@Column(name="num_caso",nullable=false)
	private Double numCaso;
	@ApiModelProperty(notes = "fecha de registro del caso en bd")
	@Column(name="insert_time")
	private LocalDateTime insertTime;
	@ApiModelProperty(notes = "true o false, si el caso esta cerrado")
	@Column(name="closed",nullable=false)
	private Boolean closed;
	@ApiModelProperty(notes = "true o false, si el caso esta abierto")
	@Column(name="opened",nullable=false)
	private Boolean opened;
	public Integer getIdCaso() {
		return idCaso;
	}
	public void setIdCaso(Integer idCaso) {
		this.idCaso = idCaso;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public Double getNumCaso() {
		return numCaso;
	}
	public void setNumCaso(Double numCaso) {
		this.numCaso = numCaso;
	}
	public LocalDateTime getInsertTime() {
		return insertTime;
	}
	public void setInsertTime(LocalDateTime insertTime) {
		this.insertTime = insertTime;
	}
	public Boolean getClosed() {
		return closed;
	}
	public void setClosed(Boolean closed) {
		this.closed = closed;
	}
	public Boolean getOpened() {
		return opened;
	}
	public void setOpened(Boolean opened) {
		this.opened = opened;
	}
	

}
