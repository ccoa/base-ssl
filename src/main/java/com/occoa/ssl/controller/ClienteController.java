package com.occoa.ssl.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ResponseEntity<Object> saludar() {
		
		return new ResponseEntity<Object>("Hola", HttpStatus.OK);
	}
	
}
