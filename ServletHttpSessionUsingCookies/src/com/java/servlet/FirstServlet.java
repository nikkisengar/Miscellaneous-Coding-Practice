package com.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6037682968596285711L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset-UTF-8");

		PrintWriter pw = resp.getWriter();

		Cookie[] cookies = req.getCookies();
		
		pw.println("Welcome, "+cookies[0].getValue());
		
		pw.println("<br><a href='index.html'>Home</a>");
		
		pw.close();
	}

}
