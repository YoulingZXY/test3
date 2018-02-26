package com.zxy.test2.web;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zxy.test2.domain.Customer;
import com.zxy.test2.service.CustomerService;

@RestController
@RequestMapping
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping
	public String hello() {
		return "hello";
	}
	
	@RequestMapping(value="/add/{name}",method=RequestMethod.GET)
	public String add(@PathVariable("name") String name) {
		
		return customerService.addOrUpdate(new Customer(name)).toString();
	}
	
	@GetMapping("delete")
	public void delete(@RequestParam("id") Integer id) {
		
		customerService.delete(id);
	}
	
	@GetMapping("update/{id}/{name}")
	public String update(@PathVariable("id") Integer id,@PathVariable("name") String name) {
		
		return customerService.addOrUpdate(new Customer(id,name)).toString();
	}
	
	@GetMapping("findOne")
	public String findOne(@RequestParam("id") Integer id) {
		
		return customerService.findOne(id).toString();
	}
	
	@GetMapping("findAll")
	public String findAll() {
		String result = "";
		List<Customer> list = customerService.findAll();
		for (Customer customer : list) {
			result += customer.toString()+"~";
		}
		
		return result;
	}
}
