package com.ust.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/rc")
public class RegistrationController extends HttpServlet {
	 @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		 //get the FirstName,LastName,MiddleName  from Register.html
		 
		   resp.setContentType("text/html");
		 
		   String fname =req.getParameter("fn");
		   String lname =req.getParameter("ln");
		   String mname =req.getParameter("mn");
		   PrintWriter out =resp.getWriter();  
		   
		   out.println("Registration Details are :  <br>" );
		   out.println("FirstName: "+fname+"<br>");
		   out.println("LastName: "+lname+"<br>");
		   out.println("MiddleName: "+mname+"<br>");
		   
		   
		   out.close();
		 
	}
	
	
}