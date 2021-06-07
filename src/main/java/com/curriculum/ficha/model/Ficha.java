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

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(description = "ficha del postulante")
@Entity
@Table(name = "ficha")
public class Ficha {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer IdFicha;
	@ApiModelProperty(notes = "Nombre del postulante")
	@Column(name="nombre",nullable=false)
	private String nombre;
	@ApiModelProperty(notes = "apellido del postulante")
	@Column(name="apellido",nullable=false)
	private String apellido;
	@ApiModelProperty(notes = "rut del postulante")
	@Column(name="rut",nullable=false)
	private String rut;
	@ApiModelProperty(notes = "numero de serie del postulante")
	@Column(name="numero_serie",nullable=false)
	private String numeroSerie;
	@ApiModelProperty(notes = "fecha de nacimiento del  postulante")
	@Column(name="fecha_nacimiento",nullable=false)
	private LocalDateTime fechaNacimiento;
	@Column(name="insert_time",nullable=false)
	private LocalDateTime insertTime;
	@ApiModelProperty(notes = "Estado de vigencia de la postulaciones activo/inactivo")
	@Column(name="vigente",nullable=false)
	private Boolean vigente;
	@ApiModelProperty(notes = "role de la ficha")
	@ManyToOne
	@JoinColumn(name="id_roles",nullable=true)
	private Roles idRoles;
	
	public Integer getIdFicha() {
		return IdFicha;
	}
	public void setIdFicha(Integer idFicha) {
		IdFicha = idFicha;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getNumeroSerie() {
		return numeroSerie;
	}
	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}
	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public LocalDateTime getInsertTime() {
		return insertTime;
	}
	public void setInsertTime(LocalDateTime insertTime) {
		this.insertTime = insertTime;
	}
	public Boolean getVigente() {
		return vigente;
	}
	public void setVigente(Boolean vigente) {
		this.vigente = vigente;
	}
	public Roles getIdRoles() {
		return idRoles;
	}
	public void setIdRoles(Roles idRoles) {
		this.idRoles = idRoles;
	}
	

	
}
