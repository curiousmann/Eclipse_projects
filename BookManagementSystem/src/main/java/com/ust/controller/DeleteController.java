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

@WebServlet("/delbook")
public class DeleteController  extends HttpServlet{

	Book p;
	BookDao pdao= new BookDaoImpl();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 doGet(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	     resp.setContentType("text/html");
		
		PrintWriter out =resp.getWriter();
		//get the product detatils from Addprpduct.jsp
		out.println("<br><br><a href='listProduct'>Go Back</a></center>");
		
		int count= pdao.deleteBook(req.getParameter("id"));
		 
		 if(count>0) {
			 out.println("<center><br><br><h2>Deleted Successfully </h2><br><br>");
			 out.println("<a href='index.jsp'>Click Here To Go Home Page</a></center>");
			 
		 }else {
			 out.println("<center><br><br><h2>Deletion was Unsuccessfull</h2><br><br>");
			 out.println("<a href='index.jsp'>Click Here To Go Home Page</a></center>");
		 }
		 
		 
		 
		 out.close();
	}
	
	

	
}

