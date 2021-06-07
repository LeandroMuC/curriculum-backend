package com.curriculum.account.model;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity
@Table(name="profile")
public class Profile {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idProfile;
	private String rol;	
	public void setIdProfile(Integer idProfile) {
		this.idProfile = idProfile;
	}
	
	public Integer getIdProfile() {
		return idProfile;
	}

	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	

}