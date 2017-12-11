<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   
<!DOCTYPE html>
<html>
<head>
<meta name="decorator" content="security" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
	<div class="row">
		<div class="col-sm-8 col-sm-offset-2 text">
			<h1>
				<strong>N1Ne45</strong> Stockists Inventory Management System
			</h1>
			<div class="description">
				<p>We are a group of talents would like to provide the BEST
					services of the World</p>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="col-sm-6 col-sm-offset-3 form-box">
			<div class="form-top">
				<div class="form-top-left">
					<h3>Login to our site</h3>
					<p>Enter your username and password to log on:</p>
				</div>
				<div class="form-top-right">
					<i class="fa fa-lock"></i>
				</div>
			</div>
			<div class="form-bottom">
				<form role="form" action="" method="post" class="login-form">
					<div class="form-group">
						<label class="sr-only" for="form-username">Username</label> 
						<input type="text" id="name" name="nmae" placeholder="Name" class="form-username form-control"/>				 
					</div>
					<div class="form-group">
						<label class="sr-only" for="form-password">Password</label> 
						<input type="password" id="password" name="password"  placeholder="Password" class="form-password form-control" >
					</div>
					<button type="submit" class="btn">Sign in</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>
<!-- 
<input type="text" id="email" name="email"  th:placeholder="Email" /> <br/> 
			<input type="password"  th:placeholder="Password" id="password" name="password" class="form-control" /> <br /> 
			<div align="center" th:if="${param.error}">
				<p style="font-size: 20; color: #FF1C19;">Email or Password invalid, please verify</p>
			</div>
 -->