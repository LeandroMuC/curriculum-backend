package com.curriculum.account.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.curriculum.account.model.Account;
import com.curriculum.account.repository.IAccountRepository;
import com.curriculum.account.service.IAccountService;
import com.curriculum.exception.AccountFoundException;
@Service
public class AccountServiceImpl implements IAccountService {
	@Autowired
	private IAccountRepository repository;
	@Autowired
	private BCryptPasswordEncoder bcrpypt;
	@Override
	public Account registroAccount(Account ac) {
		// TODO Auto-generated method stub
		Account account=repository.findByusername(ac.getUsername());
		if(account!=null) {
			
			throw new AccountFoundException("El usuario existe con esa cuenta "+ac.getUsername());
		}
		ac.setPassword(bcrpypt.encode(ac.getPassword()));
		return repository.save(ac);
	}

}
