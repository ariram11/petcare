package com.example.petcare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.example.petcare.entity.Admin;
import com.example.petcare.service.AdminService;
import com.example.petcare.util.ResponseStructure;

import jakarta.validation.Valid;

@RestController
@RequestMapping("admin")
public class AdminController {
	
	@Autowired
	AdminService serv;
	
	@PostMapping
	public ResponseEntity<ResponseStructure<Admin>> saveAdmin(@Valid @RequestBody Admin admin,BindingResult bs){
		return serv.saveAdmin(admin);
	}
	
	
	@GetMapping
	public ResponseEntity<ResponseStructure<Admin>> findAdmin(@Valid @RequestParam int id,BindingResult bs){
		System.out.println(id+"*******************************>>>>>>>>>>>>>>>>>>>");
		return serv.findAdmin(id);
		
	}
	
	
	@PutMapping
	public ResponseEntity<ResponseStructure<Admin>> updateAdmin(@Valid @RequestParam int id,@Valid @RequestBody Admin admin,BindingResult bs){
		return serv.updateAdmin(id,admin);
	}
	
	@DeleteMapping
	public ResponseEntity<ResponseStructure<Admin>> deleteAdmin(@Valid @RequestParam int id,BindingResult bs){
		return serv.deleteAdmin(id);
	}
	
	
	

}
