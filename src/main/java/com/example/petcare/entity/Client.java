package com.example.petcare.entity;



import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
@Entity
public class Client {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cID;
@NotBlank(message="don't enter client name as empty value")
@NotNull(message="dont enter client name as null value")
	private String cName;
@Max(value=9999999999l)
@Min(value=6000000000l)
	private String cContact;
@NotBlank(message="don't enter client Address empty value")
@NotNull(message="dont enter client Address  null value")
	private String cAddress;
	
}
