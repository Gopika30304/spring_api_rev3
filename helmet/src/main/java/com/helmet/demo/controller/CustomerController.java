package com.helmet.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.helmet.demo.model.Customer;
import com.helmet.demo.service.CustomerService;



@RestController
public class CustomerController {
	@Autowired
	CustomerService custSer;
	
	@GetMapping("/getAllCustomers")
	public List<Customer> fetchAllCustomers() {
		List<Customer> pList=custSer.fetchAllCustomer();
		return pList;
	}
	
	@PostMapping("/saveCustomers") 
	public Object saveCustomers(@RequestBody Customer p) {
		return custSer.saveCustomers(p);
	}

}