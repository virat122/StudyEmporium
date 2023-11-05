package com.DB;

import java.sql.Connection;
import java.sql.*;
public class DBConnection {
	private static Connection con;
	public static Connection  getConnection() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studyemporium","root","Archaudhary@122");
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		return con;
	}
	
	
 
}
