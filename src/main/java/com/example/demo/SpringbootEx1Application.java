package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.Account;
import com.example.demo.repositories.AccountRepository;

@SpringBootApplication
public class SpringbootEx1Application implements CommandLineRunner {

	@Autowired
	AccountRepository accountRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootEx1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Adding test data
		accountRepo.save(new Account("FR760214000165744498213"));
		accountRepo.save(new Account("FR760214852005744411269"));
	}

}
