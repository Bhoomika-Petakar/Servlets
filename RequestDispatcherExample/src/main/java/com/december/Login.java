package com.december;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


//@WebServlet(urlPatterns = "/login", initParams = @WebInitParam(name="password",value = "123"))//if we remove the webxml code...then this annotations will be used.
public class Login extends HttpServlet{
	static int count=5;
  @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name=req.getParameter("username");
	String password=req.getParameter("password");
	
	resp.setContentType("text/html");
	
//	HttpSession session=req.getSession();
//	session.setAttribute("username", name);
	
//	Cookie c1 = new Cookie("username", name);
//	Cookie c2 = new Cookie("password", password);
//	
//	resp.addCookie(c1);
//	resp.addCookie(c2);
	
	
	ServletConfig config = getServletConfig();	
	String actualPassword=config.getInitParameter("password");
	
//	ServletContext context=getServletContext();
//	String actualPassword=context.getInitParameter("password");
	
	
	
	
	if(password.equals(actualPassword)) {
		RequestDispatcher rd = req.getRequestDispatcher("homepage");
		rd.forward(req, resp);
		
	}
	else if(count>0){
		PrintWriter out=resp.getWriter();
		out.print(count-- + "attemps left..........");
		
		RequestDispatcher rd2 = req.getRequestDispatcher("/login.html");
		rd2.include(req,resp);
		
		
	}
	else {
		resp.sendRedirect("blocked.html");
	}
}

}
