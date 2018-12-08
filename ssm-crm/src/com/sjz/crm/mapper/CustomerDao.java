package com.sjz.crm.mapper;

import java.util.List;

import com.sjz.crm.pojo.Customer;

public interface CustomerDao {
	void addCustomer(Customer customer);

	List<Customer> listCustomer();
	
	void deleteCustomer(Integer cust_id);
}
