package com.example.petcare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.petcare.entity.PetService;
import com.example.petcare.service.PetServiceService;
import com.example.petcare.util.ResponseStructure;

@RequestMapping
@RestController
public class PetServiceController {
	@Autowired
	PetServiceService serv;

	@PostMapping
	public ResponseEntity<ResponseStructure<PetService>> savePetService(@RequestBody PetService petserv){
		return serv.savePetServe(petserv);
	}
	
	@GetMapping
	public ResponseEntity<ResponseStructure<PetService>> findPetService(@RequestParam int id){
		return serv.findPetService(id);
	}
	
	@PutMapping
	public ResponseEntity<ResponseStructure<PetService>> updatePetService(@RequestParam int id ,@RequestBody PetService petserv){
		return serv.updatePetService(id, petserv);
	}
	
	
	@DeleteMapping
	public ResponseEntity<ResponseStructure<PetService>> deletePetService(@RequestParam int id){
		return serv.DeletePetService(id);
	}
	
	
	
	
	
}
