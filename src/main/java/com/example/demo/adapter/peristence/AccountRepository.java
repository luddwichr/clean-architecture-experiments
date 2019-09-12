package com.example.demo.adapter.peristence;

import com.example.demo.domain.Account;
import org.springframework.data.repository.CrudRepository;

interface AccountRepository extends CrudRepository<Account, Long> {
}
