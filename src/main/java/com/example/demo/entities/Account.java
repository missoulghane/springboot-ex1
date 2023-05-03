package com.example.demo.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
public class Account implements Serializable {
	
	private static final long serialVersionUID = 7571197499614028847L;
	
	private Long id;
	private String number;
}
