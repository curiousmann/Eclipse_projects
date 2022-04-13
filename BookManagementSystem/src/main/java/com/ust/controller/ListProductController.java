package com.ust.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ust.dao.BookDao;
import com.ust.dao.BookDaoImpl;
import com.ust.dto.Book;

@WebServlet("/listProduct")
public class ListProductController extends HttpServlet {

	BookDao pdao= new BookDaoImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	  resp.setContentType("text/html");
	  
	  PrintWriter out =resp.getWriter();
	  
	    //retrieve all the records from the prodcut table
	     List<Book> li=pdao.listProduct();
	     
	     //store list object into requestScope
	     req.setAttribute("records",li);
	     
	    RequestDispatcher rd = req.getRequestDispatcher("ListProduct.jsp");
	     rd.forward(req, resp);
		out.close();
	     
	     
	}
	
}
