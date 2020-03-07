package com.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class DateServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(ServletRequest request, ServletResponse response) throws IOException {
		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();

		Date d = new Date();
		
		pw.println("<h3>Date & Time: "+d+"</h3>");
		
		pw.close();
		
	}

}
