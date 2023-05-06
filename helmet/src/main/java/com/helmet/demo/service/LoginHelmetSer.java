package com.helmet.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.helmet.demo.model.LoginHelmetMod;
import com.helmet.demo.repository.LoginHelmetRepo;

@Service
public class LoginHelmetSer {
	@Autowired
	LoginHelmetRepo userRepo;
public  LoginHelmetMod saveUser(LoginHelmetMod  u)
{
return userRepo.save(u); 
}
public String validateUser(String username,String password)
{
	String result="";
	LoginHelmetMod  u=userRepo.findByUsername(username);
	if(u==null)
	{
		result="Invalid user";
	}
		else
		{
			if(u.getPassword().equals(password))
			{
				result="Login success";
			}
			else
			{
				result="Login failed";
			}
		}
	

	return result;
	}
	
	

}
