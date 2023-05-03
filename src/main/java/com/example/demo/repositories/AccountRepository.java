package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import com.example.demo.entities.Account;

@RepositoryRestController
public interface AccountRepository extends  JpaRepository<Account, Long> {

}
