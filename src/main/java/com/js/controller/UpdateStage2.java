package com.js.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.js.dao.BookCRUD;
import com.js.dto.Book;
@WebServlet(value="/edit")

public class UpdateStage2 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(req.getParameter("bid"));
		String name = req.getParameter("bname");
		String author = req.getParameter("bauthor");
		int pages = Integer.parseInt(req.getParameter("bpage"));
		double price = Double.parseDouble(req.getParameter("bprice"));
		Book b = new Book();
		b.setId(id);
		b.setBook_name(name);
		b.setAuthor_name(author);
		b.setNo_of_pages(pages);
		b.setPrice(price);
		
		
		
		BookCRUD bc=new BookCRUD();
		int result=bc.updateBookById(id, b);
		if (result == 1) {
			RequestDispatcher rd=req.getRequestDispatcher("view");
			rd.forward(req, resp);

		} else {
			RequestDispatcher rd=req.getRequestDispatcher("result.jsp");
			req.setAttribute("msg", "no book available to update");
			rd.forward(req, resp);

		}
		
		
	}

}
