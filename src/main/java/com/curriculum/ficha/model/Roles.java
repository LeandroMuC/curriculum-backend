package com.curriculum.ficha.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Roles {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idRoles;
	@Column(name="descripcion",nullable=false)
	private String descripcion;
	@Column(name="insert_time",nullable=false)
	private LocalDateTime insertTime;
	public Integer getIdRoles() {
		return idRoles;
	}
	public void setIdRoles(Integer idRoles) {
		this.idRoles = idRoles;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public LocalDateTime getInsertTime() {
		return insertTime;
	}
	public void setInsertTime(LocalDateTime insertTime) {
		this.insertTime = insertTime;
	}
	
}
