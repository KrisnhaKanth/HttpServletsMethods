package com.app.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class EmployeeServelet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res)throws ServletException ,IOException {
		PrintWriter pw = res.getWriter();
		res.addHeader("Refresh", "12; http://www.google.com/");
		
		
	  pw.println(new java.util.Date());
	}

}
