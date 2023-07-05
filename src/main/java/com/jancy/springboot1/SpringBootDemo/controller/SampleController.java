package com.jancy.springboot1.SpringBootDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jancy.springboot1.SpringBootDemo.model.Customer;
import com.jancy.springboot1.SpringBootDemo.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class SampleController {
	
	@Autowired
	CustomerService customerService;
	
	
	@GetMapping("/getcustomer1")
	public String getCustomer1() {
		System.out.println("Get Customer1 Called");
		return "Jancy";
	}
	
	@GetMapping("/getcustomer")
	public Customer getCustomer() {
		System.out.println("Get Customer Called");
		return customerService.getCustomer();
		
	}
	
	@PostMapping("/addcustomer")
	public String addCustomer2(@RequestBody Customer c) {
		System.out.println("Post Customer Called");
		System.out.println("c: "+c);
		return "Success";
		
	}
	
	@GetMapping("/addcustomer")
	public void addCustomer() {
		//
		
	}

}
