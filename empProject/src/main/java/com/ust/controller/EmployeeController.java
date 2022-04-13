package com.ust.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/empDetails")
public class EmployeeController extends HttpServlet{
	
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
    	 resp.setContentType("text/html");
    	//get the employeeId,employeeName and Salary from emp.html
    	
    	
    	String empid  = req.getParameter("eid");
    	String ename  = req.getParameter("en");
    	String salary = req.getParameter("es");
//Display the data or send the respone back employee details.

PrintWriter out=resp.getWriter();

out.println("Employee Details are "+"<br>");
out.println("EmployeeID is : "+empid +"<br>");
out.println("EmployeeName is : "+ename +"<br>");
out.println("EmploySalary is : "+salary +"<br>");

out.println("<a href='index.html'>Click Here to Go Employee page</a>");

out.close();
}


}