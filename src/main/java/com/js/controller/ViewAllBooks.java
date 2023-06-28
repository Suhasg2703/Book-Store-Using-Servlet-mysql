package com.js.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.js.dao.BookCRUD;
import com.js.dto.Book;
@WebServlet(value = "/view")
public class ViewAllBooks extends HttpServlet{
	 @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ArrayList<Book> books = BookCRUD.getAllBooks();
		
		if (books.size()>0) {
			RequestDispatcher rd = req.getRequestDispatcher("ViewAllBooks.jsp");
			req.setAttribute("data",books);
			rd.forward(req, resp);
		} else {
            RequestDispatcher rd = req.getRequestDispatcher("Resultbook.jsp");
            req.setAttribute("msg", "No Books Available");
            rd.forward(req, resp);
		}
	}

}
