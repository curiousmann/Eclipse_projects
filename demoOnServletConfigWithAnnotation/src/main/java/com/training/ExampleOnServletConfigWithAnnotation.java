package com.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/esconfig"},
initParams = {
	@WebInitParam(name = "drv",value = "com.mysql.cj.jdbc.Driver"),
	@WebInitParam(name = "url",value = "jdbc:mysql://localhost:3306/ust"),
    @WebInitParam(name="userName",value = "root")		
})
public class ExampleOnServletConfigWithAnnotation  extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		
		//get the ServletConfig object
	ServletConfig config=getServletConfig();
		
		String driver=config.getInitParameter("drv");
		String ul=config.getInitParameter("url");
		String un=config.getInitParameter("userName");
		
		PrintWriter out = resp.getWriter();
		
		out.println("Addition Infromation from ServletConfig using Annotation <br>");
		out.println("driver Name is : "+driver+"<br>");
		out.println("Url is : "+ul+"<br>");
		out.println("UserName is  : "+un+"<br>");
		
		out.close();
		
	}
	

}