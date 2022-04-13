package com.ust.dao;
import java.util.List;

import com.ust.dto.Books;
public interface BooksDao {

	int addBook(Books p);
	List<Books> listBooks();
	void deletebookById(int id);
	int editBook(int id);
	
}
