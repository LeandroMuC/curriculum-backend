package com.curriculum.login.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curriculum.account.model.Account;
import com.curriculum.account.repository.IAccountRepository;
import com.curriculum.login.repository.ILoginRepository;
import com.curriculum.login.service.ILoginServiceImpl;
@Service
public class LoginServiceImpl implements ILoginServiceImpl{
	@Autowired 
	private IAccountRepository repository;
	private ILoginRepository LoRepository;
	@Override
	public Account verificaNombreUsuario(String usuario) throws Exception {
		// TODO Auto-generated method stub
		Account ac=null;
		try {
			ac=repository.findByusername(usuario);
			ac=	 ac!=null?ac:new Account();
		}catch(Exception e){
			ac=new Account();
			
		}
		return ac;
	}

	@Override
	public int cambiarPassword(String pass, String usuario) throws Exception {
		// TODO Auto-generated method stub
		int rpta=0;
		try {
			LoRepository.cambiarClave(pass, usuario);
			rpta=1;
			
		}
		catch(Exception e) {
			rpta=0;
			
		}
		return rpta;
	}

}
