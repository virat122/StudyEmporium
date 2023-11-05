<%@page import="java.util.List"%>
<%@page import="com.entitys.Book"%>
<%@page import="com.DB.DBConnection"%>
<%@page import="com.DAO.DAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="homeCss.jsp"%>
<title>Insert title here</title>
</head>
<body>


	<div class="topnav">
		<a class="active" href="#home">Home</a> <a href="#about">About</a> <a
			href="#contact">Contact</a> <input type="text" placeholder="Search..">
	</div>
	<div id="filter">
		<input type="text" id="mySearch" onkeyup="myFunction()"
			placeholder="Search.." title="Type in a category">

		<ul id="myMenu">
			<li><a href="">bansal institute of engineering and
					technology Lucknow</a></li>
			<li><a href="#">Rameshwaram Institute of Technology &
					Management</a></li>
			<li><a href="#">babu banarasi das</a></li>
			<li><a href="#">ram sawroop</a></li>
			<li><a href="#">SR institute</a></li>
			<li><a href="#">RR institute</a></li>
			<li><a href="#">bncet</a></li>
			<li><a href="#">GCRG</a></li>
			<li><a href="#">IET lucknow</a></li>
		</ul>

	</div>

	<div id="right">

		<%
		DAO dao = new DAO(DBConnection.getConnection());
		System.out.println(dao);
		List<Book> lst = dao.getAllBooks();

		/* print list all book  */
		for (Book book : lst) {
		%>
		<!-- out.print("<h1>  this is book </h1>" + book.getName()); -->
		<div class="card">
			<img src="BOOK2.PNG" alt="Avatar" style="width: 80%">
			<div class="container">
				<h4>
					<b>BOOK NAME : <%=book.getName()%></b>
				</h4>

				<p>
					PRICE :
					<%=book.getPrize()%></p>
				<p>
					Auther :
					<%=book.getAuther()%></p>
				<p>
					publication :
					<%=book.getPublication()%></p>
			</div>
		</div>

		<%
		}
		%>



	</div>




	<a href="sellBook.jsp"><button>SELL</button></a>




	<a href="#"><button>
			<%=(String) session.getAttribute("uname")%></button></a>









</body>
</html>