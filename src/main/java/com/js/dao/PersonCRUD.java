package com.js.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.js.dto.Person;

public class PersonCRUD {
	
	private final static String path = "com.mysql.cj.jdbc.Driver";
	private final static String url = "jdbc:mysql://localhost:3306/book_store";
	private final static String user = "root";
	private final static String password = "Suhas@2703";
	
	public static int insertPerson(Person p) {
		Connection c = null;
		String query = "insert into person values(?,?,?,?,?,?,?)";
		try {
			Class.forName(path);
			c = DriverManager.getConnection(url,user,password);
			PreparedStatement ps = c.prepareStatement(query);
			ps.setInt(1, p.getId());
			ps.setString(2, p.getName());
			ps.setString(3, p.getEmail());
			ps.setInt(4, p.getPassword());
			ps.setString(5, p.getAddress());
			ps.setInt(6, p.getPincode());
			ps.setLong(7, p.getPhone());
			 return ps.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				c.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0; 

	}

    public static boolean validatePerson(String email , int pwd) {
    	Connection c = null;
    	String query = "select * from person where email=? and password=?";
    	try {
			Class.forName(path);
			c = DriverManager.getConnection(url,user,password);
			PreparedStatement ps = c.prepareStatement(query);
			ps.setString(1, email);
			ps.setInt(2, pwd);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				return true;
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	finally {
			try {
				c.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
		
	}
}
