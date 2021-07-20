package com.charter.customerService;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.charter.customerService.domain.Customer;
import com.charter.customerService.repository.CustomerRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
class CustomerServiceApplicationTests {

	
	 @Autowired
	  private MockMvc mockMvc;

	  @Autowired
	  private ObjectMapper objectMapper;

	  @Autowired
	  private CustomerRepository customerRepository;
	  
	@Test
	void contextLoads() {
	}
	
	@Test
	public void test() {
		List<Customer> list = customerRepository.findAll();
		System.out.println(list);
	}

}
