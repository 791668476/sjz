package com.sjz.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sjz.shop.pojo.Product;
import com.sjz.shop.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@RequestMapping(value="/index")
	public String list(Model model){
		List<Product> hotProductList = productService.findHotProductList();
		List<Product> newProductList = productService.findNewProductList();
		model.addAttribute("hotProductList", hotProductList);
		model.addAttribute("newProductList",newProductList);
		return "index";
	}
}
