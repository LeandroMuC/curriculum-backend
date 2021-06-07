package com.curriculum.login.model;


import java.util.Date;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.curriculum.account.model.Account;


@Entity
public class ResetToken {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable=false,unique=true)
	private String token;
	@Column(nullable=false)
	private Date expiracion;
	@OneToOne(targetEntity=Account.class,fetch=FetchType.EAGER)
	@JoinColumn(nullable=false,name="id_account")
	private Account account;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public Date getExpiracion() {
		return expiracion;
	}
	public void setExpiracion(Date expiracion) {
		this.expiracion = expiracion;
		
	}
	public void setExpiracion(int minutes) {
		Calendar now=Calendar.getInstance();
		now.add(Calendar.MINUTE, minutes);
		this.expiracion=now.getTime();
	}
	public boolean isExpirado() {
		return new Date().after(this.expiracion);
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	
}
	