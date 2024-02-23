package com.example.petcare.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.petcare.entity.ClientService;
import com.example.petcare.repo.ClientServiceRepo;

@Repository
public class ClientServiceDao {
	@Autowired
	ClientServiceRepo repo;
	
	public ClientService saveClientService(ClientService cs) {
		return repo.save(cs);
	}
	public ClientService findClientService(int id){
		Optional<ClientService> optional =repo.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}
	
	public ClientService deleteClientService(int id) {
		ClientService exClientService =findClientService(id);
		return exClientService;
	}
	
	public ClientService updateClientService(int id,ClientService clientService) {
		ClientService exClientService =findClientService(id);
		if(exClientService!=null) {
			clientService.setCsId(id);
			return repo.save(clientService);
		}
		return null;
	}
}
