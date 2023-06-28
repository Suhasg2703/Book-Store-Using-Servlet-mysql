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

@WebServlet(value = "/edit")
public class UpdateStage2 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String bookname = req.getParameter("bookname");
		String authorname = req.getParameter("authorname");
		int noofpages = Integer.parseInt(req.getParameter("noofpages"));
		double price = Integer.parseInt(req.getParameter("price"));
		
		Book b = new Book();
		b.setId(id);
		b.setBook_name(bookname);
		b.setAuthor_name(authorname);
		b.setNo_of_pages(noofpages);
		b.setPrice(price);
		
		BookCRUD bc= new BookCRUD();
		int result = bc.updateBookById(id, b);
		
		if (result==1) {
			RequestDispatcher rd = req.getRequestDispatcher("view");
			rd.forward(req, resp);
		} else {
			RequestDispatcher rd = req.getRequestDispatcher("Resultbook.jsp");
			rd.forward(req, resp);
			req.setAttribute("msg", "No Book Available To Update");
		}
	}
}