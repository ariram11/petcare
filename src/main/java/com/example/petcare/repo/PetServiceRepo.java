package com.example.petcare.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.petcare.entity.PetService;


public interface PetServiceRepo  extends JpaRepository<PetService, Integer>
{
	

}
