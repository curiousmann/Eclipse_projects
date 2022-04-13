package com.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns={"/fs"},loadOnStartup=1) //creating obect in startup ,   @WebServlet("/fs")    will call on url call
public class First extends HttpServlet {
	
   public First() {
	   System.out.println("we are in default constructor of First class");
   }
	
	
  @Override
   public void init() throws ServletException {
	  System.out.println("we are in init method");
   }@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 resp.setContentType("text/html");
       
		 PrintWriter out =resp.getWriter();
		 out.println("welcome to servlet lifecycle methods");
		 
		 out.close();
		 
		 System.out.println("we are in service method");
	}

 @Override
	public void destroy() {
		System.out.println("we are in destroy method");
	}
 @Override
 public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
 	 System.out.println("we are in doPost method");
 }
}
