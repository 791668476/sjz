package com.sjz.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sjz.crm.mapper.CustomerDao;
import com.sjz.crm.pojo.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerDao customerDao;
	
	@Override
	public void addCustomer(Customer customer) {
		customerDao.addCustomer(customer);
		
	}

	@Override
	public List<Customer> listCustomer() {
		List<Customer> listCustomer = customerDao.listCustomer();
		return listCustomer;
	}

	@Override
	public void deleteCustomer(Integer cust_id) {
		customerDao.deleteCustomer(cust_id);
		
	}

}
