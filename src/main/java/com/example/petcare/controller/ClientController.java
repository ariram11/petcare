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

import com.example.petcare.entity.Client;
import com.example.petcare.service.ClientService1;
import com.example.petcare.util.ResponseStructure;

@RestController
@RequestMapping("client")
public class ClientController {

	@Autowired
	ClientService1 serv;
	
	@PostMapping
	public ResponseEntity<ResponseStructure<Client>> saveClient(@RequestBody Client client){
		return serv.saveClient(client);
	}
	
	@DeleteMapping
	public ResponseEntity<ResponseStructure<Client>> deleteClient(@RequestParam int id){
		return serv.deleteClient(id);
	}
	
	@PutMapping
	public ResponseEntity<ResponseStructure<Client>> updateClient(@RequestParam int id,@RequestBody Client client){
		return serv.updateClient(id, client);
	}
	
	
	@GetMapping
	public ResponseEntity<ResponseStructure<Client>> findClient(@RequestParam int id){
		return serv.findClient(id);
	}
}
