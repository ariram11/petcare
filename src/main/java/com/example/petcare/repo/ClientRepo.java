package com.example.petcare.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.petcare.entity.Client;

public interface ClientRepo extends JpaRepository<Client, Integer>

{

	
}
