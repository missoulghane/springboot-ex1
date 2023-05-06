package com.example.demo.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Account;
import com.example.demo.repositories.AccountRepository;

@Service
public class AccountService {

	@Autowired
	private AccountRepository accountRepository;
	
	public Account create(Account account) {
		Account accountToCreate = new Account();
		accountToCreate.setNumber(account.getNumber());
		accountToCreate.setCreatedOn(new Date());
		return accountRepository.save(accountToCreate);
	}
	
	public Account update(Account account) {
		Account accountToUpdate = new Account();
		accountToUpdate.setId(account.getId());
		accountToUpdate.setNumber(account.getNumber());
		accountToUpdate.setModifiedOn(new Date());
		return accountRepository.save(accountToUpdate);
	}
	
	public List<Account> getAll(){
		return accountRepository.findAll();
	}
	
}
