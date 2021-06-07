package com.curriculum.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curriculum.account.model.Account;
@Repository
public interface IAccountRepository extends JpaRepository<Account,Integer> {
	Account findByusername(String username);
}
