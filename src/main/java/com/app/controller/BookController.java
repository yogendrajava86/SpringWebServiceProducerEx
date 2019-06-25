package com.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/book")
public class BookController {
	
	@GetMapping("/show")
	public ResponseEntity<String> showBook(){
		ResponseEntity<String> resp=new ResponseEntity<String>("Welcome to Rest API",HttpStatus.OK);
		return resp;
	}

}
