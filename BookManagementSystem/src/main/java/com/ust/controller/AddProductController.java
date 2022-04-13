package com.ust.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ust.dao.BookDao;
import com.ust.dao.BookDaoImpl;
import com.ust.dto.Book;

@WebServlet("/addProduct")
public class AddProductController  extends HttpServlet{

	Book p;
	BookDao pdao= new BookDaoImpl();
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	     resp.setContentType("text/html");
		
		PrintWriter out =resp.getWriter();
		//get the product detatils from Addprpduct.jsp
			
		String ttl =req.getParameter("pi");
		String athr =req.getParameter("pn");
		String price= req.getParameter("pc");
		
		float ppc=Float.parseFloat(price);
		
         p=new Book(ttl,athr,ppc);
		
		 int count= pdao.addProduct(p);
			
		 if(count>0) {
			 out.println("<center><br><br><h2>Book Details Are Added Successfully</h2> <br>");
			 out.println("<a href='index.jsp'>Click Here To Go Home Page</a><center>");
			 
		 }else {
			 out.println("<center><br><br><h2>Book Details Are Not Added</h2><br>");
			 out.println("<a href='index.jsp'>Click Here To Go Home Page</a><center>");
		 }
		 
		
		 out.close();
	}
	
	

	
}
