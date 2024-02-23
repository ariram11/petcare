package com.example.petcare.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.petcare.entity.Admin;

public interface AdminRepo extends JpaRepository<Admin, Integer>
{

	
	
}
