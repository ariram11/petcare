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
import com.example.petcare.entity.ClientService;
import com.example.petcare.service.ClientServiceService;
import com.example.petcare.util.ResponseStructure;

@RestController
@RequestMapping("clientservice")
public class ClientServiceController {
	@Autowired
	ClientServiceService serv;

	@PostMapping
	public ResponseEntity<ResponseStructure<ClientService>>saveClientService(@RequestBody ClientService cs){
		return serv.saveClientService(cs);
	}
	
	@GetMapping
	public ResponseEntity<ResponseStructure<ClientService>> findClientService(@RequestParam int id){
		return serv.findClientService(id);
	}
	
	@PutMapping
	public ResponseEntity<ResponseStructure<ClientService>>saveVet(@RequestParam int id, @RequestBody ClientService cs){
		return serv.updateClientService(id, cs);
	}
	
	@DeleteMapping
	public ResponseEntity<ResponseStructure<ClientService>> deleteClientService(@RequestParam int id){
		return serv.deleteClientService(id);
	}
	
	
}
