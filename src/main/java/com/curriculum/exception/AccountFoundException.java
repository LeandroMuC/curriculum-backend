package com.curriculum.exception;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;
@ResponseStatus(HttpStatus.NOT_FOUND)
public class AccountFoundException extends RuntimeException {
	
	public AccountFoundException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}

}