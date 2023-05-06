package com.helmet.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.helmet.demo.model.LoginHelmetMod;

public interface LoginHelmetRepo extends JpaRepository<LoginHelmetMod ,Integer>{
		LoginHelmetMod  findByUsername(String username);


}
