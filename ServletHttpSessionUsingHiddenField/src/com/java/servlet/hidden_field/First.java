package com.java.servlet.hidden_field;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class First extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7250536156264930321L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html;charset-UTF-8");

		PrintWriter pw = resp.getWriter();

		String user = req.getParameter("user");
		String pass = req.getParameter("pass");

		if (pass.equals("1234")) {
			// creating a new hidden form field
			pw.println("<form action='second'>");
			pw.println("<input type='hidden' name='user' value='" + user + "'/>");
			pw.println("<input type='submit' value='submit'/>");
			pw.println("</form>");
		} else
			resp.sendRedirect("index.html");
	}

}
