package com.curriculum.login.service;

import org.springframework.stereotype.Service;

import com.curriculum.account.model.Account;
@Service
public interface ILoginServiceImpl {
	Account verificaNombreUsuario(String usuario) throws Exception;
	int cambiarPassword(String pass, String usuario) throws Exception;
}
