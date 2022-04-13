package com.ust;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ss")
public class Second  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		resp.setContentType("text/html");
		
		HttpSession session=req.getSession(false);
		
		System.out.println("Second Class : "+session.getId());
		
		//retrevie the firstname and lastname from the session object
		  
		Object o1=session.getAttribute("fn");
		Object o2=session.getAttribute("ln");
		
		String fname=(String)o1;
		String lname=(String)o2;
		
		PrintWriter out= resp.getWriter();
		out.println("Displaying the elements from the Session Object : <br>");
		out.println("FirstName is  : "+fname+"<br>");
		out.println("LastName is  : "+lname+"<br>");
	
		out.close();
	
		//destroyed  the session object
		session.invalidate();
		
	}
	
}
