package com.aduech.springdemo.service;

import java.util.List;

import com.aduech.springdemo.entity.Customer;

public interface CustomerService {
	public List<Customer>  getCustomers();

	public void saveCustomer(Customer customer);

	public Customer getCustomers(int id);

	public void deleteCustomer(int id);

}
