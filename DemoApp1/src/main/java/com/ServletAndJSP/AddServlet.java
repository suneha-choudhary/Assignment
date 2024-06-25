package com.ServletAndJSP;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AddServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;
		//System.out.println("The result is: "+k);	
		
		// Print the result in the response to be viewed in the browser
		PrintWriter out = res.getWriter();
		out.println("The result after adding two numbers is : " + k);
	}
}