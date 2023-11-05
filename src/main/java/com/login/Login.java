package com.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.DAO;
import com.DB.DBConnection;

import javax.servlet.*;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String uname = (String) request.getParameter("uname");
		String pass = (String) request.getParameter("pass");
		System.out.println(uname + "        " + pass);
		if (uname == null || pass == null) {
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");

			rd.forward(request, response);
		}

		DAO dao = new DAO(DBConnection.getConnection());

		if (dao.validateLogin(uname, pass)) {
			
			HttpSession session=request.getSession();
			session.setAttribute("uname", uname);
			
			
			RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
			rd.forward(request, response);
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");

			rd.forward(request, response);

		}

	}

}
