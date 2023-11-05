package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.DAO;
import com.DB.DBConnection;
import com.entitys.RegestrationDetail;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = (String) request.getParameter("name");
		String email = (String) request.getParameter("email");
		String pass = (String) request.getParameter("pass");
		String city = (String) request.getParameter("city");
		String college = (String) request.getParameter("college");
		String mob = (String) request.getParameter("mob");

		DAO dao = new DAO(DBConnection.getConnection());
		// System.out.println(dao);

		if (!dao.isEmailExist(email)) {

			RegestrationDetail user = new RegestrationDetail();
			user.setName(name);
			user.setEmail(email);
			user.setCity(city);
			user.setPassword(pass);
			user.setCity(city);
			user.setMobNo(mob);
			user.setCollege(college);

			boolean isRegisterd = dao.registerUser(user);

			if (isRegisterd) {
				response.sendRedirect("login.jsp");
			} else {
				response.sendRedirect("Register.jsp");
			}

		} else {
			System.out.println("email.is allready exist");

			RequestDispatcher dd = request.getRequestDispatcher("forgetPassword.jsp");
			dd.forward(request, response);

		}

		// registerUser is method for resistation

		PrintWriter out = response.getWriter();

		out.println("<h1>This is user details page:</h1>");
		// out.println("Hello ");
//		RequestDispatcher rd=request.getRequestDispatcher("Register.jsp");  
//		rd.forward(request, response);

	}

}
