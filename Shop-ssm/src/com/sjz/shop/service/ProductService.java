package com.sjz.shop.service;

import java.util.List;

import com.sjz.shop.pojo.Category;
import com.sjz.shop.pojo.Product;

public interface ProductService {
	List<Product> findHotProductList();
	List<Product> findNewProductList();
	Product findProduct(Integer pid);
	List<Category> findCategory();
	List<Product> findProductByCid(String cid);
}
