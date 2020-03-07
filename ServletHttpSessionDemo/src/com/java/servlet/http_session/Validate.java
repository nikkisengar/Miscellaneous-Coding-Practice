package com.java.servlet.http_session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Validate extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8736656839237124881L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html;charset=UTF-8");

		String userName = req.getParameter("username");
		String password = req.getParameter("password");

		if (password.equals("1234")) {
			// Creating a session
			HttpSession session = req.getSession();
			session.setAttribute("username",userName);
			resp.sendRedirect("welcome");
		}
		else {
			resp.sendRedirect("index.html");
		}
	}

}
