package com.example.petcare.Exception;


import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.petcare.util.ResponseStructure;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;






@RestControllerAdvice
public class ExceptionHandler extends ResponseEntityExceptionHandler {
	
	@org.springframework.web.bind.annotation.ExceptionHandler
	public ResponseEntity<ResponseStructure<String>> adminNotFoundException(AdminNotFoundException ex){
		ResponseStructure<String> res=new ResponseStructure<String>();
		res.setData(ex.getMessage());
		res.setMessage("Admin Not Found so Give the Valid Admin Id");
		res.setStatus(HttpStatus.NOT_FOUND.value());
		return new ResponseEntity<ResponseStructure<String>>(res,HttpStatus.NOT_FOUND);
	}

	
	@org.springframework.web.bind.annotation.ExceptionHandler
	public ResponseEntity<ResponseStructure<String>> clientNotFoundException(ClientNotFoundException ex){
		ResponseStructure<String> res=new ResponseStructure<String>();
		res.setData(ex.getMessage());
		res.setMessage("Client Noot Found so Give the Valid Client Id");
		res.setStatus(HttpStatus.NOT_FOUND.value());
		return new ResponseEntity<ResponseStructure<String>>(res,HttpStatus.NOT_FOUND);
	}
	
	
	
	@org.springframework.web.bind.annotation.ExceptionHandler
	public ResponseEntity<ResponseStructure<Object>> handleContrainViolationException(ConstraintViolationException ex)
	{
		
		ResponseStructure<Object> res=new ResponseStructure<Object>();
		Map<String,String> map=new HashMap<String, String>();
		
		
		for(ConstraintViolation<?> violation: ex.getConstraintViolations())
		{
			String feild=violation.getPropertyPath().toString();
			String message=violation.getMessage();
			map.put(feild, message);
		}
		res.setMessage("add proper detail");
		res.setData(map);
		res.setStatus(HttpStatus.FORBIDDEN.value());
		
		
		return new ResponseEntity<ResponseStructure<Object>> (res,HttpStatus.FORBIDDEN);
	}

}
