package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class proj3 {
	@GetMapping("/")
	public String color() {
		String color="White";
		return "My favorite color is " +color;
		
	}

}
