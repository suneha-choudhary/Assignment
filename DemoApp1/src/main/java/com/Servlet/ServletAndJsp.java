package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login" , name = "LoginServlet")
public class ServletAndJsp extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException{
		System.out.println("Login Servlet Works");
		PrintWriter writer = res.getWriter();
		writer.println("<h1> Hello there From Servlet </h1>");
		String name = "Testing";
		writer.println(name);
	}
}
