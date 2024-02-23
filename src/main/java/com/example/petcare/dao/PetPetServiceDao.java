package com.example.petcare.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.petcare.entity.PetService;
import com.example.petcare.repo.PetServiceRepo;




@Repository
public class PetPetServiceDao {

	@Autowired
	PetServiceRepo repo;
	
	public PetService savePetService(PetService petService)
	{
		return repo.save(petService);
	}
	public PetService findPetService(int id) {
		Optional<PetService> optional=repo.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}
		
		return null;
	
	}
	
	public PetService deletePetService(int id ) {
		PetService PetService=findPetService(id);
		repo.delete(PetService);
		return PetService;
	}
	
	public PetService updatePetService(int id,PetService petService) {
		PetService exPetService=findPetService(id);
		if(exPetService!=null) {
			petService.setServiceId(id);
			return repo.save(petService);
		}
		return null;
	}
}
