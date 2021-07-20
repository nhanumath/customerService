package com.charter.customerService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.charter.customerService.domain.Customer;
import com.charter.customerService.repository.CustomerRepository;


@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	
	public Customer findByCustomerId(Long id) {
		return customerRepository.findByCutomerId(id);
	}
	
	
	public List<Customer> findAllCustomers() {
		return customerRepository.findAll();
	}
	
	public Customer saveCustomer(Customer customer) {
		return customerRepository.save(customer);
	}
}
