package com.sjz.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sjz.shop.mapper.productDao;
import com.sjz.shop.pojo.Category;
import com.sjz.shop.pojo.Product;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	productDao productdao;

	@Override
	public List<Product> findHotProductList() {
		return  productdao.findHotProductList();
	}

	@Override
	public List<Product> findNewProductList() {
		return  productdao.findNewProductList();
	}

	@Override
	public Product findProduct(Integer pid) {
		Product product = productdao.findProduct(pid);
		return product;
	}

	@Override
	public List<Category> findCategory() {
		List<Category> category = productdao.findCategory();
		return category;
	}

	@Override
	public List<Product> findProductByCid(String cid) {
		List<Product> productByCid = productdao.findProductByCid(cid);
		return productByCid;
	}
	
	
}
