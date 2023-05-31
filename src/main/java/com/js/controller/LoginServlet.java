package com.js.controller;

import java.awt.print.Book;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.js.dao.PersonCRUD;
@WebServlet(value="/login")

public class LoginServlet extends HttpServlet {

	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		// TODO Auto-generated method stub
		String email=req.getParameter("email");
	 int password=Integer.parseInt(req.getParameter("pwd"));
	 
	 boolean b=PersonCRUD.validatePerson(email, password);
	 
	 
	if(b==true) {
		RequestDispatcher rd=req.getRequestDispatcher("home.jsp");
		rd.forward(req, resp);
	}
	else {
		PrintWriter pw=resp.getWriter();
		pw.write("<html><body><h3 style=\"color:red;\">Email or password wrong</h3></body></html>");
		RequestDispatcher rd=req.getRequestDispatcher("login.jsp");
		rd.include(req, resp);
	
		
	}

	}

}
