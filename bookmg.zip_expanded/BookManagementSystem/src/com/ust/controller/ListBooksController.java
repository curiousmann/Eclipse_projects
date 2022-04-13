package com.ust.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ust.dao.BooksDao;
import com.ust.dao.BooksDaoImpl;
import com.ust.dto.Books;

@WebServlet("/Listbooks")
public class ListBooksController extends HttpServlet {

	BooksDao pdao= new BooksDaoImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	  resp.setContentType("text/html");
	  
	  PrintWriter out =resp.getWriter();
	  
	    //retrieve all the records from the book table
	     List<Books> li=pdao.listBooks();
	     
	     //store list object into requestScope
	     req.setAttribute("records",li);
	     
	    RequestDispatcher rd = req.getRequestDispatcher("ListBooks.jsp");
	     rd.forward(req, resp);
		out.close();
	     
	     
	}
	
}
