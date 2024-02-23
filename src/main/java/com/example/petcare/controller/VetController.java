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
import com.example.petcare.entity.Vet;
import com.example.petcare.service.VetService;
import com.example.petcare.util.ResponseStructure;

@RestController
@RequestMapping("vet")
public class VetController {
	
	@Autowired
	VetService serv;
	
	
	@PostMapping
	public ResponseEntity<ResponseStructure<Vet>>saveVet(@RequestBody Vet vet){
		return serv.saveVet(vet);
	}
	
	
	@DeleteMapping
	public ResponseEntity<ResponseStructure<Vet>>deletVet(@RequestParam int id){
		return serv.deleteVet(id);
		
	}
	
	@PutMapping
	public ResponseEntity<ResponseStructure<Vet>>UpdatVet(@RequestParam int id,@RequestBody Vet vet){
		return serv.updateVet(id, vet);
	}
	
	@GetMapping
	public ResponseEntity<ResponseStructure<Vet>>findVet(@RequestParam int id){
		return serv.findVet(id);
	}
	
	
	
}
