package demoONHiddenFormFields;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/fs")
public class First  extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		
		PrintWriter out=resp.getWriter();
		
		String fname=req.getParameter("fn");
		String lname=req.getParameter("ln");
		out.println("<form action='ss'>");
		out.println("FatherName <input type='text' name='ftn'> <br>");
		out.println("MotherName <input  type='text' name='mtn'> <br>");
		out.println("<input type='hidden' name='hfn' value='"+fname+"'>");
		out.println("<input type='hidden' name='hln' value='"+lname+"'>");
		out.println("<input type='submit' value='finish'>");
		out.println("</form>");
		
		
	}
	
	
}
