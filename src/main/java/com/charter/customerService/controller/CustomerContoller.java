package com.charter.customerService.controller;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.charter.customerService.domain.Customer;
import com.charter.customerService.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerContoller {

	private static final Logger log = org.slf4j.LoggerFactory.getLogger(CustomerContoller.class);
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/findCustomerById/{id}")
	public Customer findCustomerById(@PathVariable Long id) {
		log.info("Entering into findCustomerById");
				
		return customerService.findByCustomerId(id);
	}
	

	@GetMapping("/findAllCustomers")
	public List<Customer> findAllCustomers(){
		log.info("Entering into findAllCustomers");
		return customerService.findAllCustomers();
	}
	
	@PostMapping("/saveCustomer")
	public Customer saveCustomer(@RequestBody Customer customer) {
		log.info("Entering into saveCustomer");
		return customerService.saveCustomer(customer);
	}
	
	
}
