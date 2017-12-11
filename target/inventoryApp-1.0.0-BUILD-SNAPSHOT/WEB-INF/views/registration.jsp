<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
   
<!DOCTYPE html>
<html >
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="decorator" content="security" />
<title></title>
</head>
<body>
	<div class="row">
		<div class="col-sm-6 col-sm-offset-3 form-box">
			<div class="form-top">
				<div class="form-top-left">
					<h3>Registration Form</h3>
					<p>Add new user to access the system</p>
				</div>
				<div class="form-top-right">
					<i class="fa fa-lock"></i>
				</div>
			</div>
			<div class="form-bottom">
				<form role="form"  method="post" class="login-form">
					<div class="form-group">
						
						<input type="text" name="name" placeholder="Name" class="form-username form-control" /> 
					</div>
					<div class="form-group">
					
						<input type="text" name="lastName" placeholder="Last Name" class="form-username form-control" />
					</div>
					<div class="form-group">
					
						<input type="text" name="email" placeholder="Email" class="form-username form-control" />
					</div>					
					<div class="form-group">		
						<input type="password" name="password" placeholder="Password" class="form-username form-control" />
					</div>
					<button type="submit" class="btn">Registration</button><br/>
					<c:out value="${successMessage}"/>
				</form>
			</div>
		</div>
	</div>
</body>
</html>
