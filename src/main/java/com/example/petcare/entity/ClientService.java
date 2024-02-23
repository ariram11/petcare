package com.example.petcare.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;
@Component
@Entity
@Getter
@Setter
public class ClientService {
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int csId;
	
	@NotNull(message="don't enter thr value client as Sewrvice")
	@NotBlank(message="don't enter the Client service as Empty")
private String csName;	

}
