package com.curriculum.account.service;

import org.springframework.stereotype.Service;

import com.curriculum.account.model.Profile;
@Service
public interface IProfileService {
	Profile registrar(Profile p);

}
