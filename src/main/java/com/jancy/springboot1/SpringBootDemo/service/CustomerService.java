package com.jancy.springboot1.SpringBootDemo.service;

import org.springframework.stereotype.Component;

import com.jancy.springboot1.SpringBootDemo.model.Customer;

@Component
public class CustomerService {
	public Customer getCustomer() {
	System.out.println("CustomerService::getCustomer called");
	
	Customer c = new Customer();
	c.setCustomerId(1);
	c.setCustomername("Jancy");
	c.setAddress("Coppell, TX");
	
	return c;
	}

}
