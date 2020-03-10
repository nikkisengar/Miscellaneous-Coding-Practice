package com.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8176763085614817582L;

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//taking the add result from the AddServlet
		int result = Integer.parseInt(req.getParameter("addResult"));

		result = result * result;
		
		PrintWriter out=resp.getWriter();
		
		out.println("Result is: "+result);
	}

}
