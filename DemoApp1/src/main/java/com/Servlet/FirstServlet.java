package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class FirstServlet implements Servlet {

	ServletConfig conf;
	
	public void init(ServletConfig conf) {
		this.conf = conf;
		System.out.println("creating objects.........");
		
	}
	@Override
	public void destroy() {
		System.out.println("going to destroy elements");
	}

	@Override
	public ServletConfig getServletConfig() {
		return this.conf;
	}
 
	@Override
	public String getServletInfo() {
		return "this servlet is created by me";
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Servicing........");
		//set the content type of the response
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h1>This is my output from servlet method:</h1>");
		out.println("<h2>Today's date and time is " + new Date().toString() + "</h2>");
	}
}
