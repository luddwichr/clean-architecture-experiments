package com.example.demo.application.port.out;

import com.example.demo.domain.Account;

import java.util.Optional;

public interface LoadAccountPort {
	Optional<Account> findById(Long accountId);
}
