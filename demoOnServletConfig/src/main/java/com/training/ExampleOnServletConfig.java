package com.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ExampleOnServletConfig extends HttpServlet {

	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		 resp.setContentType("text/html");
		//get the ServletConfig Object
		   ServletConfig config=getServletConfig();
		 //get the init-parameter values based on key from ServletConfig	
			String ul = config.getInitParameter("url" );
			String driver= config.getInitParameter("drv");
			String uname = config.getInitParameter("userName");
			
			PrintWriter out=resp.getWriter();
			
			out.println("Additional Jdbc Information from web.xml <br>");
			out.println("Url is : "+ul+"<br>");
			out.println("driver className is :"+driver+"<br>");
			out.println("username is "+uname);
			
			out.close();
		
		
		
		
	}
	
	
	
}