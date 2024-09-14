package com.nagarro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloController {
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to Docker Learning";
	}
	

}
