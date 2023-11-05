package com.home;
import com.DAO.DAO;
import com.DB.DBConnection;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.ha.backend.Sender;

import com.entitys.Book;
import com.login.Login;

/**
 * Servlet implementation class SellBook
 */
@WebServlet("/SellBook")
public class SellBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SellBook() {
        super();
       
    }

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		 String name=(String)request.getParameter("name");
		 String author=(String)request.getParameter("author");
		 String publication=(String)request.getParameter("prize");
		 String prize=(String)request.getParameter("publication");
		 
		 Book book=new Book();
		 book.setName(name);
		 book.setAuther(author);
		 book.setPrize(prize);
		 book.setPublication(publication);
		 DAO dao=new DAO(DBConnection.getConnection());
		 if(dao.addBook(book)) {
			 response.sendRedirect("home.jsp");
		 }else {
			 response.sendRedirect("sellBook.jsp");
		 }
		 
		// System.out.println(book.toString());
		
		
	
	}

}
