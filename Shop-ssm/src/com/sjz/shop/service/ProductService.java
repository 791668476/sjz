package com.sjz.shop.service;

import java.util.List;

import com.sjz.shop.pojo.Product;

public interface ProductService {
	List<Product> findHotProductList();
	List<Product> findNewProductList();
}
