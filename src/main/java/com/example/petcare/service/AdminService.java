package com.example.petcare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.petcare.Exception.AdminNotFoundException;
import com.example.petcare.dao.AdminDao;
import com.example.petcare.entity.Admin;
import com.example.petcare.util.ResponseStructure;

@Service
public class AdminService {
	@Autowired
	AdminDao dao;
	
	
	public ResponseEntity<ResponseStructure<Admin>> saveAdmin(Admin admin){
		Admin ad=dao.saveAdmin(admin);
		ResponseStructure<Admin> res=new ResponseStructure<Admin>();
		res.setData(ad);
		res.setMessage("**Successfully save the Admin**");
		res.setStatus(HttpStatus.CREATED.value());
		
		return new ResponseEntity<ResponseStructure<Admin>>(res,HttpStatus.CREATED);
	}
	
	
	
	public ResponseEntity<ResponseStructure<Admin>> findAdmin(int id) {
		Admin admin=dao.findAdmin(id);
		if(admin!=null) {
			ResponseStructure<Admin> res=new ResponseStructure<Admin>();
			res.setData(admin);
			res.setStatus(HttpStatus.FOUND.value());
			res.setMessage("**Find Admin SuccessFull**");
			return new ResponseEntity<ResponseStructure<Admin>>(res,HttpStatus.FOUND);
		}
		
		throw new AdminNotFoundException("GIVE THE VALID ADMIN ID");
	}
	
	public ResponseEntity<ResponseStructure<Admin>> deleteAdmin(int id){
		
		Admin ad=dao.deleteAdmin(id);
		if(ad!=null) {
		ResponseStructure<Admin> res=new ResponseStructure<Admin>();
		res.setMessage("**The Admin Deletted**");
		res.setData(ad);
		res.setStatus(HttpStatus.OK.value());
		return new ResponseEntity<ResponseStructure<Admin>>(res,HttpStatus.OK);}
		
	
	throw new AdminNotFoundException("GIVE THE VALID ADMIN ID SO WE CAN'T BE DELETE ADMIN");
	}

	
	public ResponseEntity<ResponseStructure<Admin>> updateAdmin(int id,Admin ad){
		Admin admin =dao.updateAdmin(id,ad);
		if(admin!=null) {
			ResponseStructure<Admin> res=new ResponseStructure<Admin>();
			res.setData(admin);
			res.setMessage("**Update Admin Successfully**");
			res.setStatus(HttpStatus.OK.value());
			return new ResponseEntity<ResponseStructure<Admin>>(res,HttpStatus.OK);
		}
		throw new AdminNotFoundException("GIVE THE VALID ADMIN ID SO WE CAN'T BE DELETE ADMIN");
	}
	
	
	
}
