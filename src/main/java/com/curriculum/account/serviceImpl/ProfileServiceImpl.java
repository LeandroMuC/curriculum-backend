package com.curriculum.account.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curriculum.account.model.Profile;
import com.curriculum.account.repository.IProfileRepository;
import com.curriculum.account.service.IProfileService;

@Service
public class ProfileServiceImpl implements IProfileService {
	@Autowired
	private IProfileRepository repository;
	
	@Override
	public Profile registrar(Profile p) {
		// TODO Auto-generated method stub
		return repository.save(p);
	}

}
