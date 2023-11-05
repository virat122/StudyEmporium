<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Fill the  detail of book 
<form action="SellBook" method ="post">


  <div class="container">
    <h1>Please fill in this book Details</h1>
   
    <hr>
    
    <label for="name"><b> Book name</b></label>
    <input type="text" placeholder="Enter name" name="name" id="name" ><br/>
    
    <label for="Author"><b>Author</b></label>
    <input type="text" placeholder="Author Name" name="author" id="AuthorName" >
    <br/>
    
    <label for="Prize"><b>Prize</b></label>
    <input type="text" placeholder="Prize." name="prize" id="prize" required><br/>
    
    <label for="name"><b>Publication</b></label>
    <input type="text" placeholder="publication" name="publication" id="publication" ><br/>
    
    

    
    <hr>

    <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>
    <button type="submit" class="sellBook">Sell Book</button>
  </div>

  <div class="container signin">
    <p>Already have an account? <a href="login.jsp">Login</a>.</p>
  </div>
</form>




</body>
</html>