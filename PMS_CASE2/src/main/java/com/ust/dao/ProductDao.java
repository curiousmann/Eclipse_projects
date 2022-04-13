package com.ust.dao;

import java.util.List;

import com.ust.dto.Product;

public interface ProductDao {

	int addProduct(Product p);
	List<Product> listProduct();
	
	
}
