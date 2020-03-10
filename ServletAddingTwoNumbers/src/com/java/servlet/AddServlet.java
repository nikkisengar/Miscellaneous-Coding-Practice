package com.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7970891409847390055L;

	
	/*
	 * Usage of service(-,-) method will accept both the request (get, post) When we
	 * want to get/fetch some result/data from the server then we have to use 'get'
	 * request when we want to submit the data to the server then we have to use
	 * 'post' request. Best approach is that we have to use the processing logic inside the doGet(-,-) and
	 * keep the form request as 'post' which will call doPost(-,-) and inside doPost(-,-) we have to call
	 * doGet(-,-) such that both the request can be handled. 
	 * When we want to call a Servlet from another Servlet then we have to use the
	 * concept of RequestDispatcher
	 */
	 
	/*
	 * @Override protected void service(HttpServletRequest req, HttpServletResponse
	 * resp) throws ServletException, IOException {
	 * resp.setContentType("text/html;charset=UTF-8");
	 * 
	 * int firstNumber = Integer.parseInt(req.getParameter("first")); int
	 * secondNumber = Integer.parseInt(req.getParameter("second"));
	 * 
	 * int addResult = firstNumber + secondNumber;
	 * 
	 * PrintWriter out = resp.getWriter();
	 * out.println("<h1 style='color:red'>Result is: "+addResult+"</h1>"); }
	 */
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");

		int firstNumber = Integer.parseInt(req.getParameter("first")); int
		secondNumber = Integer.parseInt(req.getParameter("second"));

		int addResult = firstNumber + secondNumber;

		// Sending the data to other servlet is called session management
		// redirecting the addition result to SquareServlet using URL rewriting
		//URL Rewriting is one of the way of Session Management
		
		resp.sendRedirect("sq?addResult="+addResult);//URL Rewriting
		
		PrintWriter out = resp.getWriter();
		out.println("<h1 style='color:red'>Result is: "+addResult+"</h1>");
	}
	
}
