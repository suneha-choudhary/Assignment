package finalproject;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class loginAndLogout {
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException{
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		out.println("<h2>Welcome to Login Page</h2>");
		String user_name = req.getParameter("user_name");
		String password= req.getParameter("user_password");
		
		RequestDispatcher rd = req.getRequestDispatcher("LoginUser.html");
		rd.include(req, resp);
	}
}

