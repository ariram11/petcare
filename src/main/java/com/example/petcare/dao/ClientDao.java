package com.example.petcare.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.petcare.entity.Client;
import com.example.petcare.repo.ClientRepo;

@Repository
public class ClientDao {
	@Autowired
	ClientRepo repo;
	
	public Client saveClient(Client client) {
		return repo.save(client);
	}
	
	public Client findClient(int id) {
		Optional<Client> optional=repo.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}
	
	
	public Client updateClient(int id,Client client) {
		Client exClient=findClient(id);
		if(exClient!=null) {
			client.setCID(id);
			repo.save(client);
		}
		return null;
	}
	
	public Client deleteClient(int id) {
		Client client =findClient(id);
		if(client!=null) {
		 repo.delete(client);
		return client;}
		return null;
	}
	
	
}
