package com.curriculum.login.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curriculum.login.model.ResetToken;
import com.curriculum.login.repository.IResetRepository;
import com.curriculum.login.service.IResetTokenService;
@Service
public class ResetTokenServiceImpl implements IResetTokenService {
	@Autowired
	private IResetRepository repository;
    @Override
    public ResetToken findByToken(String token) {
        return repository.findByToken(token);
    }

    @Override
    public void guardar(ResetToken token) {
    	repository.save(token);

    }

    @Override
    public void eliminar(ResetToken token) {
    	repository.delete(token);
    }

}
