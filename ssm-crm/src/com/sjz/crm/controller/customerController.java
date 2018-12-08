package com.sjz.crm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sjz.crm.pojo.Customer;
import com.sjz.crm.service.CustomerService;

@Controller
public class customerController {
	
	@Autowired
	CustomerService customerService;
	
	@RequestMapping("/addCustomer.action")
	public String AddCustomerAction(Customer customer){
		customerService.addCustomer(customer);
		return "/jsp/customer/add";
	}
}
