<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
  <%@include file="All_css_js.jsp"%>
<title>Insert title here</title>
</head>
<body>

	here is registrr page

 <form action="Register" method="post" class="sign-up-form">
            <h2 class="title">Sign up</h2>
            <div class="input-field">
              <i class="fas fa-user"></i>
              <input type="text" placeholder="Username" />
            </div>
            <div class="input-field">
              <i class="fas fa-envelope"></i>
              <input type="email" placeholder="Email" />
            </div>
             <div class="input-field">
              <i class="fas fa-envelope"></i>
              <input type="number" placeholder="contact" />
            </div>
            <div class="input-field">
              <i class="fas fa-lock"></i>
              <input type="password" placeholder="Password" />
            </div>
            <input type="submit" class="btn" value="Sign up" />
            <p class="social-text">Or Sign up with social platforms</p>
           <!--  <div class="social-media"> -->
              <a href="#" class="social-icon">
                <i class="fab fa-facebook-f"></i>
              </a>
              <a href="#" class="social-icon">
                <i class="fab fa-twitter"></i>
              </a>
              <a href="#" class="social-icon">
                <i class="fab fa-google"></i>
              </a>
              <a href="#" class="social-icon">
                <i class="fab fa-linkedin-in"></i>
              </a>
            </div>
          </form> 
          
<!-- my code  -->
	<!-- <form action="Register" method="post">   


		<div class="container">
			<h1>Register</h1>
			<p>Please fill in this form to create an account.</p>
			<hr>

			<label for="name"><b>name</b></label> <input type="text"
				placeholder="Enter name" name="name" id="name"><br /> <label
				for="collageName"><b>College name</b></label> <input type="text"
				placeholder="Enter collageName" name="college" id="collageName">
			<br /> <label for="Mob"><b>Mob</b></label> <input type="text"
				placeholder="Mob No." name="mob" id="mob" required><br /> <label
				for="name"><b>City</b></label> <input type="text"
				placeholder="Enter location" name="city" id="location"><br />



			<label for="email"><b>Email</b></label> <input type="text"
				placeholder="Enter Email" name="email" id="email"> <br /> <label
				for="psw"><b>Password</b></label> <input type="password"
				placeholder="Enter Password" name="pass" id="pass"> <br />

			<label for="psw-repeat"><b>Repeat Password</b></label> <input
				type="password" placeholder="Repeat Password" name="pass-repeat"
				id="psw-repeat"> <br />
			<hr>

			<p>
				By creating an account you agree to our <a href="#">Terms &
					Privacy</a>.
			</p>
			<button type="submit" class="registerbtn">Register</button>
		</div>

		<div class="container signin">
			<p>
				Already have an account? <a href="login.jsp">Login</a>.
			</p>
		</div>
	</form> -->

</body>
</html>