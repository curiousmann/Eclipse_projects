package com.training;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ss")
public class Second  extends HttpServlet{
	
	 @Override
	 public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 	 System.out.println("we are in doPost method");
	 }
}
