package com.training.dao;

import java.util.ArrayList;

import com.training.bean.Product;

public interface ProductDao {

	public int insertProduct(Product p);
	
	public ArrayList<Product> listProductDetails();
}
