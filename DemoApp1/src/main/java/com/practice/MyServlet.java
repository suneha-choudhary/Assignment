package com.practice;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class MyServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException , IOException {
		
		System.out.println("THis is get method......");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("<h1>This is get method of my http servlet </h1>");
		out.println(new Date().toString());
	}
}
