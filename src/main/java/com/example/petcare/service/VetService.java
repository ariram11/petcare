package com.example.petcare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.petcare.dao.VetDao;
import com.example.petcare.entity.Vet;
import com.example.petcare.util.ResponseStructure;

@Service
public class VetService {
	@Autowired
	VetDao dao;

	public ResponseEntity<ResponseStructure<Vet>> saveVet(Vet vet){
		Vet v=dao.saveVet(vet);
		ResponseStructure<Vet> res=new ResponseStructure<Vet>();
		res.setData(v);
		res.setMessage("**The Veterinary successfully saved**");
		res.setStatus(HttpStatus.CREATED.value());
		
		return new ResponseEntity<ResponseStructure<Vet>>(res,HttpStatus.CREATED);
	}
	
	public ResponseEntity<ResponseStructure<Vet>> deleteVet(int id){
		Vet v=dao.deleteVet(id);
		ResponseStructure<Vet> res=new ResponseStructure<Vet>();
		res.setData(v);
		res.setMessage("**The Veterinary successfully saved**");
		res.setStatus(HttpStatus.OK.value());
		
		return new ResponseEntity<ResponseStructure<Vet>>(res,HttpStatus.OK);
	}
	
	public ResponseEntity<ResponseStructure<Vet>> findVet(int id){
		Vet v=dao.findVet(id);
		ResponseStructure<Vet> res=new ResponseStructure<Vet>();
		res.setData(v);
		res.setMessage("**The Veterinary successfully saved**");
		res.setStatus(HttpStatus.FOUND.value());
		return new ResponseEntity<ResponseStructure<Vet>>(res,HttpStatus.FOUND);
	}
	
	public ResponseEntity<ResponseStructure<Vet>> updateVet(int id,Vet vet){
		Vet v=dao.updateVet(id, vet);
		ResponseStructure<Vet> res=new ResponseStructure<Vet>();
		res.setData(v);
		res.setMessage("**The Veterinary successfully saved**");
		res.setStatus(HttpStatus.CREATED.value());
		
		return new ResponseEntity<ResponseStructure<Vet>>(res,HttpStatus.CREATED);
	}
}
