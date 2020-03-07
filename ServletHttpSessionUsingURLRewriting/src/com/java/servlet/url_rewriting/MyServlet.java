package com.java.servlet.url_rewriting;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7207339867895204322L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset-UTF-8");

		String name = req.getParameter("user");
		String pass = req.getParameter("pass");
		
		if(pass.equals("1234")) {
			
			resp.sendRedirect("second?user="+ name);
		}
		else {
			resp.sendRedirect("index.html");
		}
	}
}
