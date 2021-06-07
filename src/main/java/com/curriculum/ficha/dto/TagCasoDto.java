package com.curriculum.ficha.dto;

import java.time.LocalDateTime;

public class TagCasoDto {
	private Double id_tag_caso;
	private String descripcion;
	private String insert_time;
	private String fecha;
	private Double id_caso;
	private Boolean closed;
	private String create_by;
	private Double num_caso;
	private Boolean opened;
	public Double getId_tag_caso() {
		return id_tag_caso;
	}
	public void setId_tag_caso(Double id_tag_caso) {
		this.id_tag_caso = id_tag_caso;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getInsert_time() {
		return insert_time;
	}
	public void setInsert_time(String insert_time) {
		this.insert_time = insert_time;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public Double getId_caso() {
		return id_caso;
	}
	public void setId_caso(Double id_caso) {
		this.id_caso = id_caso;
	}
	public Boolean getClosed() {
		return closed;
	}
	public void setClosed(Boolean closed) {
		this.closed = closed;
	}
	public String getCreate_by() {
		return create_by;
	}
	public void setCreate_by(String create_by) {
		this.create_by = create_by;
	}
	public Double getNum_caso() {
		return num_caso;
	}
	public void setNum_caso(Double num_caso) {
		this.num_caso = num_caso;
	}
	public Boolean getOpened() {
		return opened;
	}
	public void setOpened(Boolean opened) {
		this.opened = opened;
	}
	

}
