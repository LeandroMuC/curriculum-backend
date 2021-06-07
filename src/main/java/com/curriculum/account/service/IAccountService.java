package com.curriculum.account.service;

import org.springframework.stereotype.Service;

import com.curriculum.account.model.Account;

@Service
public interface IAccountService {
	Account registroAccount(Account ac);
}
