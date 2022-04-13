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

@WebServlet("/delbooks")
public class DeleteController  extends HttpServlet{

	Books p;
	BooksDao pdao= new BooksDaoImpl();
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	     resp.setContentType("text/html");
		
		PrintWriter out =resp.getWriter();
		//get the product detatils from Addprpduct.jsp
		
		
		String pid= req.getParameter("pc");
		int id=Integer.parseInt(pid);
		
		
		 pdao.deletebookById(id);
		 out.println("<a href='index.jsp'>Click here to go to home</a>");
		 
		
		 out.close();
	}
	
	

	
}

