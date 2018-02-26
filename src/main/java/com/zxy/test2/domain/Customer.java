package com.zxy.test2.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	@GeneratedValue
	private Integer id;
	
	private String name;

	public Customer(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	

	public Customer(String name) {
		super();
		this.name = name;
	}



	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}