package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.entitys.Book;
import com.entitys.RegestrationDetail;

public class DAO {
	private Connection con;

	public DAO(Connection con) {
		super();
		this.con = con;
	}

	public  boolean addBook(Book book) {
		boolean f = false;
		try {

			String query = "insert into Books (name, author ,publication , prize)values (?,?,?,?)";
			PreparedStatement psmt = con.prepareStatement(query);
			psmt.setString(1, book.getName());
			psmt.setString(2, book.getAuther());
			psmt.setString(3, book.getPublication());
			psmt.setString(4, book.getPrize());

			int i = psmt.executeUpdate();
			if (i > 0) {
				f = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;

	}

	public List<Book> getAllBooks() {
		List<Book> list = new ArrayList<>();
		Book book = null;

		try {
			String query = "select * from books";
			PreparedStatement psmt = con.prepareStatement(query);

			ResultSet rs = psmt.executeQuery();

			while (rs.next()) {
				book = new Book();
				book.setName(rs.getString(1));
				book.setAuther(rs.getString(2));
				book.setPublication(rs.getString(3));
				book.setPrize(rs.getString(4));
				list.add(book);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public  boolean registerUser(RegestrationDetail rd) {
		boolean f = false;
		try {
			
//			 String query = "insert into registrationDetails(name, email, password, college, city, mobNo) values (?,?,?,?,?,?)";
//		        PreparedStatement psmt = con.prepareStatement(query);
//
//		        psmt.setString(1, rd.getName());
//		        psmt.setString(2, rd.getEmail());
//		        psmt.setString(3, rd.getPassword());
//		        psmt.setString(4, rd.getCollege());
//		        psmt.setString(5, rd.getCity());
//		        psmt.setString(6, rd.getMobNo());
//
//		        int i = psmt.executeUpdate();

			String query = "insert into registrationDetails(name, email ,password, college, city,mobNo)values (?,?,?,?,?,?)";
			PreparedStatement psmt = con.prepareStatement(query);

			psmt.setString(1, rd.getName());
			psmt.setString(2, rd.getEmail());
			psmt.setString(3, rd.getPassword());
			psmt.setString(4, rd.getCollege());
			psmt.setString(5, rd.getCity());
			psmt.setString(6, rd.getMobNo());

			int i = psmt.executeUpdate();
			if (i > 0) {
				f = true;
			}

		} catch (Exception e) {
			// System.out.println("errorrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
			e.printStackTrace();
		}
		return f;

	}

	public boolean validateLogin(String email, String pass) {
		boolean isCorrect = false;
		try {
			String query = "select  name from registrationDetails where email=? and password=?";

			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, email);
			ps.setString(2, pass);
			//System.out.println(" query runningggggggggggggggggggggggggg");

			ResultSet rs = ps.executeQuery();
			isCorrect = rs.next();
		//	System.out.println(rs.next());

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//rs.close();
		}

		return isCorrect;

	}
	
	public  boolean isEmailExist(String email) {
		boolean f=false;
		
		try {
			
			String query = "SELECT email FROM registrationDetails WHERE email = ?";
			PreparedStatement psmt = con.prepareStatement(query);
			psmt.setString(1, email);
			ResultSet rs = psmt.executeQuery();
			
			

			if (rs.next()) {
				// data exist
			    f=true;
			} 
			
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}
		
		
		
		return f;
		
	}

}
