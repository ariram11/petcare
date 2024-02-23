package com.example.petcare.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.petcare.entity.Admin;
import com.example.petcare.repo.AdminRepo;

@Repository
public class AdminDao {
	@Autowired
	AdminRepo repo;
	
	
	
public Admin saveAdmin(Admin admin) {
	
	return repo.save(admin);
}

public Admin findAdmin(int id) {
	System.out.println("aaaaa");
	Optional<Admin> op=repo.findById(id);
	

	if(op.isPresent()) {
	
		return (Admin)op.get();
	}
	
	return null;
}

public Admin deleteAdmin(int id) {
	Admin admin=findAdmin(id);
	if(admin!=null) {
	repo.delete(admin);
	return admin;
	}
	return null;
}

public Admin updateAdmin(int id,Admin admin) {
	Admin exAdmin =findAdmin(id);
	if(exAdmin!=null) {
		admin.setAdminId(id);
		return repo.save(admin);
	}
	return 	null;
}




}
