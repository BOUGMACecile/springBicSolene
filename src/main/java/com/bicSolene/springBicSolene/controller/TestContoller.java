package com.bicSolene.springBicSolene.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestContoller {

	
	
	public TestContoller() {}	// TODO Auto-generated constructor stub
	
	//type methode http to use
	@GetMapping(value ="/helloBicSolene")
	
	//fonction to verify that service is OK

	public ResponseEntity<String> serviceisalive(){
		return new ResponseEntity<String>("service ok!" +HttpStatus.OK.name(), HttpStatus.OK);
	}
	

}
