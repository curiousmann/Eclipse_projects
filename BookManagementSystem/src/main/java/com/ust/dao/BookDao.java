package com.ust.dao;

import java.util.List;

import com.ust.dto.Book;

public interface BookDao {

	int addProduct(Book p);
	List<Book> listProduct();
	int deleteBook(String id);
	
	
}
