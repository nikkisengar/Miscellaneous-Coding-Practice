package com.java.servlet.hidden_field;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Second extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8602123100751074326L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset-UTF-8");

		PrintWriter pw = resp.getWriter();

		// getting parameter from the hidden field
		String user = req.getParameter("user");

		pw.println("Welcome, " + user);
		
		pw.println("<br><a href='index.html'>Home</a>");
	}

}
