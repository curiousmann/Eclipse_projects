package com.ust.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ust.dao.BooksDao;
import com.ust.dao.BooksDaoImpl;
import com.ust.dto.Books;

@WebServlet("/addbooks")
public class AddBooksController  extends HttpServlet{
    int id=1;
	Books p;
	BooksDao pdao= new BooksDaoImpl();
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	     resp.setContentType("text/html");
		
		PrintWriter out =resp.getWriter();
		//get the product detatils from Addprpduct.jsp
			
		String pid =req.getParameter("pi");
		String pname =req.getParameter("pn");
		String price= req.getParameter("pc");
		
		
		float ppc=Float.parseFloat(price);
		
         p=new Books(id++,pid,pname,ppc);
		
		 int count= pdao.addBook(p);
			
		 if(count>0) {
			 out.println("book Details Are Added Successfully <br>");
			 out.println("<a href='index.jsp'>Click Here To Go Home Page</a>");
			 
		 }else {
			 out.println("book Details Are Not Added <br>");
			 out.println("<a href='index.jsp'>Click Here To Go Home Page</a>");
		 }
		 
		
		 out.close();
	}
	
	

	
}
