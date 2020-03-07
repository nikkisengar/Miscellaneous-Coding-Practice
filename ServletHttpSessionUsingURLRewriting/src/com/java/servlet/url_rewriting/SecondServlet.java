package com.java.servlet.url_rewriting;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4742595895944226171L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset-UTF-8");

		PrintWriter pw = resp.getWriter();
		
		String user=req.getParameter("user");
		
		pw.println("Welcome, "+user);
	}
}
