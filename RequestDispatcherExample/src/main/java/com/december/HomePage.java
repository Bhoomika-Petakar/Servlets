package com.december;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HomePage extends HttpServlet {
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name = req.getParameter("username");
	
//	HttpSession session=req.getSession();
//	String name=(String)session.getAttribute("username");
	
	Cookie[] cookies = req.getCookies();
	
	for (Cookie c : cookies) {
		
		System.out.println(c.getName()+":"+c.getValue());
		
	}
	
	
	PrintWriter out=resp.getWriter();
    out.print(name+", Welcome......!");
}
}
