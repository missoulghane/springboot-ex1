package com.example.demo.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
@Entity
public class Account implements Serializable {
	
	private static final long serialVersionUID = 7571197499614028847L;
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String number;
	
	public Account(String number) {
		this.number = number;
	}
}
