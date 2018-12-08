package com.sjz.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	@RequestMapping("/listCustomer.action")
	public String ListCustomerAction(Model model){
		List<Customer> list = customerService.listCustomer();
		model.addAttribute("list", list);
		return "/jsp/customer/list";
	}
	
	@RequestMapping("/deleteCustomer.action")
	public String deleteCustomerAction(Integer custId){
		
		customerService.deleteCustomer(custId);
		
		return "redirect:/listCustomer.action";
	}
}
