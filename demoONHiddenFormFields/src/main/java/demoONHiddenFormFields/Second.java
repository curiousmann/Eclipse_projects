package demoONHiddenFormFields;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ss")
public class Second  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//get the fathername,motherName,firstname,lastname from hiddlen fields
		
		resp.setContentType("text/html");
		
		String ftname=req.getParameter("ftn");
		String mtname=req.getParameter("mtn");
		
		//hidden fields 
		String  fname=req.getParameter("hfn");
		String  lname=req.getParameter("hln");
PrintWriter out = resp.getWriter();
		
		out.println("Form Details are : <br>");
		out.println("FirstName is  : "+fname+"<br>");
		out.println("LastName is  : "+lname+"<br>");
		out.println("FatherName  is  : "+ftname+"<br>");
		out.println("MotherName is  : "+mtname+"<br>");
		
		out.close();
		
		
		
	}

}
