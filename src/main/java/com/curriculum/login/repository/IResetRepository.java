package com.curriculum.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curriculum.login.model.ResetToken;
@Repository
public interface IResetRepository extends JpaRepository<ResetToken, Integer> {
	ResetToken findByToken(String token);
}
