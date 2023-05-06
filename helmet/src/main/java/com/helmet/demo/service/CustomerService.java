package com.helmet.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.helmet.demo.model.Customer;
import com.helmet.demo.repository.CustomerRepository;



@Service
public class CustomerService {
	@Autowired
	CustomerRepository custRepo;
	
	public List<Customer> fetchAllCustomer(){
		List<Customer> c=custRepo.findAll();
		return c;
	}
	
	public Object saveCustomers(Customer p) {
		Object s=custRepo.save(p);
		return s;
	}

}