package com.helmet.demo.controller;

//import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.helmet.demo.model.LoginHelmetMod;
//import com.helmet.demo.service.HelmetService;
import com.helmet.demo.service.LoginHelmetSer;

@RestController
public class LoginHelmetCon {
	@Autowired
	LoginHelmetSer log;
	
	@PostMapping("/checkLogin")
		public String validateUser(@RequestBody LoginHelmetMod u)
		{
		System.out.println(u.getUsername());
			return log.validateUser(u.getUsername(),u.getPassword());
		}
	@PostMapping("/addUser")
	public LoginHelmetMod  main(@RequestBody LoginHelmetMod u)
	{
	return log.saveUser(u);
	}

}
