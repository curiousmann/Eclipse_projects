package com.ust.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lc")
public class LoginController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		
		PrintWriter out =resp.getWriter();
		
		//get the username and password from login.html
		 
		String uname=req.getParameter("un");
		String pwd = req.getParameter("pd");
//if username and password is equal to admin and admin
		
		if(uname.equals("admin") && pwd.equals("admin")) {
			
			//storing username into req scope
			req.setAttribute("un",uname);
			RequestDispatcher rd=req.getRequestDispatcher("success.jsp");
			rd.forward(req, resp);
		}else {
			
			out.println("<p style='color:red'>Sorry Login Failed ....!</p>");
			RequestDispatcher rd=req.getRequestDispatcher("login.jsp");
			rd.include(req,resp);
			
		}
		
		out.close();
	}
	
	
	
}
