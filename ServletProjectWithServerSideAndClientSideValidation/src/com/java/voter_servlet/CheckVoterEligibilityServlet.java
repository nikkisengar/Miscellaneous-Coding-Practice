package com.java.voter_servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckVoterEligibilityServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4481430851737303646L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html;charset=UTF-8");

		PrintWriter pw = null;

		String pName = null, pAge = null;

		int age = 0;

		pw = resp.getWriter();

		pName = req.getParameter("pName");

		pAge = req.getParameter("pAge");

		// server side validations
		if (pName == null || pName.equals("") || pName.length() == 0) {

			pw.println("<h3 style='color:red'>Person Name is required...</h3>");
			return;
		}

		if (pAge == null || pAge.equals("") || pAge.length() == 0) {
			pw.println("<h3 style='color:red'>Person Age is required...</h3>");
			return;
		} else {
			try {
				age = Integer.parseInt(pAge);
			} catch (NumberFormatException e) {
				pw.println("<h3 style='color:red>Person Age must be numeric...</h3>'");
			}
		}

		if (age >= 18) {
			pw.println("<h1 style='color:green'>" + pName + " u r eligible to vote...</h1>");
		} else {
			pw.println("<h1 style='color:red'" + pName + " u r not eligible to vote...</h1>");
		}
		
		pw.println("<br><a href='index.html'>Home</a>");
		
		pw.close();
		
	}

}
