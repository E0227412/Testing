<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html >
<head>
 	<!-- 
 	<meta name="decorator" content="default" />
 	 -->
	<!--	
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">  
	<link href="<c:url value="/assets/bootstrap/css/bootstrap.min.css" />" rel="stylesheet">	
	<link href="<c:url value="/assets/font-awesome/css/font-awesome.min.css" />" rel="stylesheet">
	<link href="<c:url value="/assets/css/form-elements.css" />" rel="stylesheet">
    <link rel="shortcut icon" href="<c:url value="assets/ico/favicon.png" />">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="<c:url value="assets/ico/apple-touch-icon-144-precomposed.png" />">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="<c:url value="assets/ico/apple-touch-icon-114-precomposed.png" />">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="<c:url value="assets/ico/apple-touch-icon-72-precomposed.png" />">
    <link rel="apple-touch-icon-precomposed" href="<c:url value="assets/ico/apple-touch-icon-57-precomposed.png" />">     
	<meta name="decorator" content="security" />
	-->
<title>User Registration Form</title>
</head>
<body>
	<div class="navbar navbar-inner block-header">
           <div class="muted pull-left">User Registration</div>
    </div>
	<div class="block-content collapse in">
        <div class="span12">
             <form class="form-horizontal" role="form"  method="post" action="${pageContext.request.contextPath}/admin/home/registration">
                 <fieldset>
				 <legend>Add new user to access the system</legend>
				 <div class="control-group">
                     <label class="control-label" for="focusedInput">Username</label>
                        <div class="controls">
                            <input class="input-xlarge focused" id="username" name="username" placeholder="Name"type="text" value="">
                        </div>					
					<label class="control-label" for="focusedInput">Lastname</label>
                        <div class="controls">
                            <input class="input-xlarge focused" id="lastName" name="lastName" placeholder="Lastname"type="text" value="">
                        </div>
					<label class="control-label" for="focusedInput">Email</label>
                        <div class="controls">
                            <input class="input-xlarge focused" id="email" name="email" placeholder="Email"type="text" value="">
                        </div>	
					<label class="control-label" for="focusedInput">Password</label>
                        <div class="controls">
                            <input class="input-xlarge focused" id="password" name="password" placeholder="Password"type="password" value="">
                        </div>		
					<div class="form-actions">
                         <button type="submit" class="btn btn-primary">Submit</button>
                    </div>		
						<c:out value="${successMessage}"/>
                 </div>
				 </fieldset>
			</form>
		</div>
	</div>	


<!-- Old one
	<div class="row"><a id="registation"></a>
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
				<form role="form"  method="post" class="login-form" action="${pageContext.request.contextPath}/admin/home/registration.jsp">
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
	 -->
	 <!-- Javascript         
        <script src="<c:url value="/assets/js/jquery-1.11.1.min.js" />"></script>
        <script src="<c:url value="/assets/bootstrap/js/bootstrap.min.js" />"></script>
        <script src="<c:url value="/assets/js/jquery.backstretch.min.js" />"></script>
        <script src="<c:url value="/assets/js/scripts.js" />"></script> 
      -->      
</body>
</html>
