package com.example.demo.application.service;

// to be discussed: where does an exception go in a hexagonal architecture?
public class AccountNotFoundException extends RuntimeException {
	public AccountNotFoundException(Long accountId) {
		super("Account with id " + accountId + " does not exist");
	}
}
