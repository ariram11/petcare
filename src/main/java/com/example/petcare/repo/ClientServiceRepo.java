package com.example.petcare.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.petcare.entity.ClientService;

public interface ClientServiceRepo extends JpaRepository<ClientService, Integer>

{

}
