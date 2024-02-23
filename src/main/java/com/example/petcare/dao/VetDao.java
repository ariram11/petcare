package com.example.petcare.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.petcare.entity.Vet;
import com.example.petcare.repo.VetRepo;

@Repository
public class VetDao {
	@Autowired
	VetRepo repo;
	
	public Vet saveVet(Vet vet) {
		
		return repo.save(vet);
		
	}
	
	public Vet findVet(int id) {
		Optional<Vet> optional =repo.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}
	
	public Vet updateVet(int id,Vet vet) {
		Vet exVet=findVet(id);
		if(exVet!=null) {
			vet.setDocterID(id);
			return repo.save(vet);
		}
		return null;
	}
	
	public Vet deleteVet(int id) {
		Vet vet=findVet(id);
		repo.delete(vet);
		return vet;
	}
	
	
}
