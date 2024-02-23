package com.example.petcare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.petcare.dao.ClientServiceDao;
import com.example.petcare.entity.ClientService;
import com.example.petcare.util.ResponseStructure;

@Service
public class ClientServiceService {
	@Autowired
	ClientServiceDao dao;
	
	public ResponseEntity<ResponseStructure<ClientService>> saveClientService(ClientService cs){
		 ClientService cs1=dao.saveClientService(cs);
		 ResponseStructure<ClientService> res=new ResponseStructure<ClientService>();
		 res.setData(cs1);
		 res.setMessage("** save ClientService Successfully **");
		 res.setStatus(HttpStatus.CREATED.value());
		
		return new ResponseEntity<ResponseStructure<ClientService>>(res,HttpStatus.CREATED);
	}
	
	
	public ResponseEntity<ResponseStructure<ClientService>> findClientService(int id){
		 ClientService cs1=dao.findClientService(id);
		 ResponseStructure<ClientService> res=new ResponseStructure<ClientService>();
		 res.setData(cs1);
		 res.setMessage("** save ClientService Successfully **");
		 res.setStatus(HttpStatus.FOUND.value());
		
		return new ResponseEntity<ResponseStructure<ClientService>>(res,HttpStatus.FOUND);
	}


	public ResponseEntity<ResponseStructure<ClientService>> deleteClientService(int id){
		 ClientService cs1=dao.deleteClientService(id);
		 ResponseStructure<ClientService> res=new ResponseStructure<ClientService>();
		 res.setData(cs1);
		 res.setMessage("** save ClientService Successfully **");
		 res.setStatus(HttpStatus.OK.value());
		
		return new ResponseEntity<ResponseStructure<ClientService>>(res,HttpStatus.OK);
	}
	
	public ResponseEntity<ResponseStructure<ClientService>> updateClientService(int id,ClientService cs){
		 ClientService cs1=dao.updateClientService(id, cs);
		 ResponseStructure<ClientService> res=new ResponseStructure<ClientService>();
		 res.setData(cs1);
		 res.setMessage("** save ClientService Successfully **");
		 res.setStatus(HttpStatus.OK.value());
		
		return new ResponseEntity<ResponseStructure<ClientService>>(res,HttpStatus.OK);
	}
}
