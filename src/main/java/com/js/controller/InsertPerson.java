package com.js.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.js.dao.PersonCRUD;
import com.js.dto.Person;

@WebServlet(value = "/save")
public class InsertPerson extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		int password = Integer.parseInt(req.getParameter("pwd"));
		String address = req.getParameter("add");
		int pincode = Integer.parseInt(req.getParameter("pin"));
		long phone = Long.parseLong(req.getParameter("phone"));
		
		Person p = new Person();
		p.setId(id);
		p.setName(name);
		p.setEmail(email);
		p.setPassword(password);
		p.setAddress(address);
		p.setPincode(pincode);
		p.setPhone(phone);
		
		int result = PersonCRUD.insertPerson(p);
		RequestDispatcher rd = req.getRequestDispatcher("Result.jsp");
		if (result==1) {
			req.setAttribute("msg", "Registered Successfully");
			rd.forward(req, resp);
		} else {
			 req.setAttribute("msg", "Registeration Failed, Try Again");
			 rd.forward(req, resp);
		}
		
	}

}
