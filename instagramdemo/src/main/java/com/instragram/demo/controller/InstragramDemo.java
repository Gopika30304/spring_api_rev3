package com.instragram.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InstragramDemo {
	@GetMapping("/login/{userId}")
	public String login(@PathVariable("userId") String userId) 
	{
		return "login sucessfully"+userId;
	}

}
