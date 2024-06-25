package com.attr;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class S4 extends HttpServlet {
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		try (PrintWriter out = response.getWriter()){
			out.println("<!DOCTYPE html");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet servlet2</title>");
			out.println("</head>");
			out.println("<body>");
			
			Cookie [] cookies = request.getCookies();
			
			boolean f=false;
			String name = "";
			
			if(cookies == null)
			{
				out.println("<h1>You are new user go to home page and submit your name </h1>");
				return;
			}
			else {
				for(Cookie c:cookies) {
					String tname= c.getName();
					if(tname.equals("user_name")) {
						f= true;
						name = c.getValue();
					}
				}
			}
			if(f) {
				out.println("<h1>Hello "+name+", Welcome back to my website...</h1>");
				out.println("<h1>Thankyou</h1>");
				
			}else{
				out.println("<h1>You are new user go to home page and submit your name </h1>");

			}
			out.println("</body>");
			out.println("</html>");
			 
		}
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
	
	@Override
	public String getServletInfo() {
		return "Short description";
	}
}
