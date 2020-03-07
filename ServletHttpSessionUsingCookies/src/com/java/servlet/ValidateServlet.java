package com.java.servlet;


/*
 * Cookies are small pieces of information that are sent in response from the 
 * web server to the client. Cookies are the simplest technique used for storing client state.
 * Cookies are stored on client's computer. 
 * They have a lifespan and are destroyed by the 
 * client browser at the end of that lifespan.
 * 
 * If the client has disabled cookies in the browser 
 * then session management using cookie wont work.
 * In that case URL Rewriting can be used as a backup. 
 * URL rewriting will always work.
 * 
 */

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ValidateServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4242141629911269618L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset-UTF-8");

		String name = req.getParameter("user");
		String pass = req.getParameter("pass");

		if (pass.equals("1234")) {

			// creating a cookie
			Cookie cookie = new Cookie("user", name);
			resp.addCookie(cookie);
			resp.sendRedirect("first");
		}
		else {
			resp.sendRedirect("index.html");
		}
	}
}
