package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.PhysicalPerson;

@Repository
public interface PhysicalPersonRepository extends JpaRepository<PhysicalPerson, Long> {

}
