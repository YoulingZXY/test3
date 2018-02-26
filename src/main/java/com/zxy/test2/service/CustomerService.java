package com.zxy.test2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zxy.test2.domain.Customer;
import com.zxy.test2.domain.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	
	public Customer addOrUpdate(Customer customer) {
		
		return customerRepository.save(customer);
	}
	
	@Transactional
	public void delete(Integer id) {
		
		customerRepository.delete(id);
	}
	
	public Customer findOne(Integer id) {
		
		return customerRepository.findOne(id);
	}
	
	public List<Customer> findAll(){
		
		return customerRepository.findAll();
	}
}
