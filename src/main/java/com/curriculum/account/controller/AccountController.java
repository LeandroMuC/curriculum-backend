package com.curriculum.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curriculum.account.model.Account;
import com.curriculum.account.service.IAccountService;

@Service
@RestController
@RequestMapping("/Accounts")
public class AccountController {
	@Autowired
	private IAccountService service;
	@PostMapping(consumes= MediaType.APPLICATION_JSON_VALUE)
	public Account registrar(@RequestBody Account a ) {
		return service.registroAccount(a);
	}

}
