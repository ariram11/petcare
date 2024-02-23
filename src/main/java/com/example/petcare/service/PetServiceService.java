package com.example.petcare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.petcare.dao.PetPetServiceDao;
import com.example.petcare.entity.PetService;
import com.example.petcare.util.ResponseStructure;

@Service
public class PetServiceService {
	@Autowired
	PetPetServiceDao dao;
	
	public ResponseEntity<ResponseStructure<PetService>> savePetServe(PetService sevice){
		PetService s1=dao.savePetService(sevice);
		ResponseStructure<PetService> res=new ResponseStructure<PetService>();
		res.setData(s1);
		res.setMessage("** Save Service SuccessFull **");
		res.setStatus(HttpStatus.CREATED.value());
	return new ResponseEntity<ResponseStructure<PetService>>(res,HttpStatus.CREATED);
	
	}
	
	public ResponseEntity<ResponseStructure<PetService>> findPetService(int id){
		PetService service=dao.findPetService(id);
		ResponseStructure<PetService> res=new ResponseStructure<PetService>();
		res.setData(service);
		res.setMessage("** PetService are Successfully Find **");
		res.setStatus(HttpStatus.OK.value());
	return new ResponseEntity<ResponseStructure<PetService>>(res,HttpStatus.OK);
	
	}
	
	public ResponseEntity<ResponseStructure<PetService>> updatePetService(int id,PetService petser){
		PetService service=dao.updatePetService(id, petser);
		ResponseStructure<PetService> res=new ResponseStructure<PetService>();
		res.setData(service);
		res.setMessage("** PetService are Successfully Updated**");
		res.setStatus(HttpStatus.OK.value());
	return new ResponseEntity<ResponseStructure<PetService>>(res,HttpStatus.OK);
	
	}
	
	public ResponseEntity<ResponseStructure<PetService>> DeletePetService(int id){
		PetService service=dao.deletePetService(id);
		ResponseStructure<PetService> res=new ResponseStructure<PetService>();
		res.setData(service);
		res.setMessage("** PetService are Successfully Find **");
		res.setStatus(HttpStatus.OK.value());
	return new ResponseEntity<ResponseStructure<PetService>>(res,HttpStatus.OK);
	
	}
}
