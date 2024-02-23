package com.example.petcare.entity;



import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
@Entity
public class Vet {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int docterID;
	private String docterName;
	private String docterMail;
	
	
}
