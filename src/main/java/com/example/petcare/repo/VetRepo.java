package com.example.petcare.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.petcare.entity.Vet;

public interface VetRepo extends JpaRepository<Vet, Integer>
{

}

