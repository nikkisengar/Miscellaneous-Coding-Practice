package com.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VoterServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8596709484556398267L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter pw = null;
		
		String pName=null, pAge=null;
		
		int age = 0;
		
		pw = response.getWriter();
		
		pName = request.getParameter("pName");
		
		pAge=request.getParameter("pAge");
		
		age = Integer.parseInt(pAge);
		
		if(age >= 18) {
			pw.println("<h1 style='color:green'>"+pName+" u r eligible to vote </h1>");
		}
		else {
			pw.println("<h1 style='color:red'>"+pName+" u r not eligible to vote </h1>");
		}
		
		pw.println("<a href='http://localhost:8081/Servlet_JSP_Project/index.html'> Home </a>");
		
		pw.close();
		
	}
}
