package com.example.petcare.entity;


import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
@Entity
public class PetService {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int serviceId;
//	private boolean bath;
//	private boolean haircut;
//	private boolean nailcut;
//	private boolean brush;
//	private boolean daycare;
	
	@NotEmpty(message="don't enter the Client Service as an Empty")
	@NotNull(message="don't Enter the Client service as an Null")
	private String  serviceName;
	@Min(value =20, message="this price not make profitable for your Service")
	private double  CostOfSertvice;
	
}
