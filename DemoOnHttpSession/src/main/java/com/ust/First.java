package com.ust;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/fs")
public class First  extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		
		PrintWriter out=resp.getWriter();
		
		String fname=req.getParameter("fn");
		String lname=req.getParameter("ln");
		
		
		//create the httpSession Object
		HttpSession session=req.getSession();
		
		System.out.println("First Class : "+session.getId());
		
		//store fname,lname into session scope
		
		session.setAttribute("fn",fname);
		session.setAttribute("ln",lname);
		
		
		resp.sendRedirect("ss");
		
		
	}
	
	
}
