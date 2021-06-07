package com.curriculum.login.service;

import org.springframework.stereotype.Service;

import com.curriculum.login.model.ResetToken;
@Service
public interface IResetTokenService {

    ResetToken findByToken(String token);
    void guardar(ResetToken token);
    void eliminar(ResetToken token);
}
