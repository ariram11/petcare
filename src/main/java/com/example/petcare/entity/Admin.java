package com.example.petcare.entity;



import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
@Entity

public class Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int adminId;
	
	@NotBlank(message="please enter the valid Admin name")
	@NotNull(message = "Don't Enter the empty")
	private String adminName;
	@Min(value =6000000000l)
	@Max(value =9999999999l)
	@NotNull(message = "Don't Enter contact Number")
	private long adminContact;
	@Email(message = "Enter the valid email Address")
	private String adminEmail;
	@Size(min=8 ,message="The pass word must be contain the minimum 8 characters")
	 
    @Pattern(regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$",
            message = "Password must contain at least one uppercase letter, one lowercase letter, one digit, and one special character")
    private String adminPassword;
	
}
