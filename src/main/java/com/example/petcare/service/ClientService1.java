package com.example.petcare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.petcare.Exception.ClientNotFoundException;
import com.example.petcare.dao.ClientDao;
import com.example.petcare.entity.Client;
import com.example.petcare.util.ResponseStructure;

@Service
public class ClientService1{
	@Autowired
	ClientDao dao;
	
	public ResponseEntity<ResponseStructure<Client>> saveClient(Client cl){
		Client client =dao.saveClient(cl);
		ResponseStructure<Client> res=new ResponseStructure<Client>();
		res.setData(client);
		res.setMessage("** Successfully Client save ****");
		res.setStatus(HttpStatus.CREATED.value());
		return new ResponseEntity<ResponseStructure<Client>>(res,HttpStatus.CREATED);
	}

	
	public ResponseEntity<ResponseStructure<Client>> findClient(int id){
		Client client=dao.findClient(id);
		if(client!=null) {
		ResponseStructure<Client> res=new ResponseStructure<Client>();
		res.setData(client);
		res.setStatus(HttpStatus.FOUND.value());
		res.setMessage("**Client Successfully Find**");
		return new ResponseEntity<ResponseStructure<Client>>(res,HttpStatus.FOUND);
		}
		
		throw new ClientNotFoundException("invalid client id");
	}
	
	public ResponseEntity<ResponseStructure<Client>> deleteClient(int id){
		Client client=dao.deleteClient(id);
		if(client!=null) {
		ResponseStructure<Client> res=new ResponseStructure<Client>();
		res.setData(client);
		res.setStatus(HttpStatus.OK.value());
		res.setMessage("**Client Successfully Delete**");
		return new ResponseEntity<ResponseStructure<Client>>(res,HttpStatus.OK);
		}
		throw new ClientNotFoundException("invalid client is");
	}
	
	
	public ResponseEntity<ResponseStructure<Client>> updateClient(int id,Client cl){
		Client client=dao.updateClient(id, cl);
		
		if(client!=null) {
		ResponseStructure<Client> res=new ResponseStructure<Client>();
		res.setData(client);
		res.setStatus(HttpStatus.OK.value());
		res.setMessage("**Client Successfully Delete**");
		return new ResponseEntity<ResponseStructure<Client>>(res,HttpStatus.OK);
		}
		throw new ClientNotFoundException("invalid client id");
	
	}
	
	
}
