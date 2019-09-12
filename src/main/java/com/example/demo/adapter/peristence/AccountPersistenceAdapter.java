package com.example.demo.adapter.peristence;

import com.example.demo.application.port.out.LoadAccountPort;
import com.example.demo.common.PersistenceAdapter;
import com.example.demo.domain.Account;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@PersistenceAdapter
@RequiredArgsConstructor
class AccountPersistenceAdapter implements LoadAccountPort {

	private final AccountRepository accountRepository;

	@Override
	public Optional<Account> findById(Long accountId) {
		return accountRepository.findById(accountId);
	}

}
