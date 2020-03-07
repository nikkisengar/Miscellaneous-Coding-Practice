package com.java.servlet.http_session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Welcome extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2067154385545684437L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html;charset=UTF-8");

		PrintWriter pw = resp.getWriter();

		HttpSession session = req.getSession();
		
		System.out.println(session.getId()+"---"+session.getCreationTime()+"---"+session.getLastAccessedTime()+"---");
		
		String userName=(String) session.getAttribute("username");
		
		pw.println("Welcome, "+userName);
		
		pw.println("<a href='index.html'>Home</a>");
		
		pw.close();
	}
}
