package com.ust.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ust.dao.ProductDao;
import com.ust.dao.ProductDaoImpl;
import com.ust.dto.Product;

@WebServlet("/addProduct")
public class AddProductController  extends HttpServlet{

	Product p;
	ProductDao pdao= new ProductDaoImpl();
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	     resp.setContentType("text/html");
		
		PrintWriter out =resp.getWriter();
		//get the product detatils from Addprpduct.jsp
			
		String pid =req.getParameter("pid");
		String pname =req.getParameter("pn");
		String price= req.getParameter("pr");
		
		int id=Integer.parseInt(pid);
		float ppc=Float.parseFloat(price);
		
         p=new Product(id,pname,ppc);
		
		 int count= pdao.addProduct(p);
			
		 if(count>0) {
			 out.println("Product Details Are Added Successfully <br>");
			 out.println("<a href='index.jsp'>Click Here To Go Home Page</a>");
			 
		 }else {
			 out.println("Product Details Are Not Added");
			 out.println("<a href='index.jsp'>Click Here To Go Home Page</a>");
		 }
		 
		
		 out.close();
	}
	
	

	
}
