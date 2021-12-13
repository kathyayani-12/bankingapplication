package com.bankapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	

	@RequestMapping("/home")
	public String home() {
		return "Hello, Welcome to the Bank Of Baroda home page"; 
	}
	
	@RequestMapping("/contact")
	public String contact() {                             //end points-API CREATION
		return "Hello, Welcome to the Contact"; 
	}
	
	@RequestMapping("/about")
	public String about() {
		return "Hello, Welcome to the about page"; 
	}
	
	@RequestMapping("/balance")
	public String balance() {
		return "Hello, Welcome to the balance page"; 
	}
}
