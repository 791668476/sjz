package com.sjz.crm.service;

import java.util.List;

import com.sjz.crm.pojo.Customer;

public interface CustomerService {
	void addCustomer(Customer customer);
	List<Customer> listCustomer();
	void deleteCustomer(Integer cust_id);
}
