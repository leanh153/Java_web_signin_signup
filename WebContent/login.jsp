<%@page import="entity.Message"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap core CSS -->
<link href="node_modules/bootstrap/dist/css/bootstrap.min.css"
	rel="stylesheet">


<title>Insert title here</title>
</head>
<body class="bg-dark">

	<%
		String errorMessage = request.getAttribute(Message.ERROR_LOGIN_PASSWORD_USER) != null
				? (String) request.getAttribute(Message.ERROR_LOGIN_PASSWORD_USER)
				: "";

		String userName = request.getAttribute(Message.INFO_LOGIN_USERNAME) != null
				? (String) request.getAttribute(Message.INFO_LOGIN_USERNAME)
				: "";

		String passWord = request.getAttribute(Message.INFO_LOGIN_PASSWORD) != null
				? (String) request.getAttribute(Message.INFO_LOGIN_PASSWORD)
				: "";
		String successSignUp = request.getAttribute(Message.INFO_SIGNUP_SUCCESS) != null
				? (String) request.getAttribute(Message.INFO_SIGNUP_SUCCESS)
				: "";
	%>
	<div class="container-fluid">
		<div class="row">
			<div class="card mx-auto mt-5">
				<div class="card-header">
					<h2 class="text-center">LOG IN</h2>
					<h5 class="text-center text-info"><%=successSignUp %></h5>
				</div>
				<div class="card-body">
					<form method="POST"
						action='<%=request.getContextPath() + "/LoginProcess?action=dologin"%>'>

						<div class="form-group">
							<label for="userName">User Name</label> <input type="text"
								name="userName" id="userName" class="form-control"
								placeholder="User name" value="<%=userName%>">

						</div>

						<div class="form-group">
							<label for="password">Password</label> <input type="password"
								name="password" id="password" class="form-control"
								placeholder="Password" value="<%=passWord%>">
						</div>
						<small class="form-text text-danger"><%=errorMessage%></small> <br />
						<button type="submit" class="btn   btn-success">Log in</button>

						<a class="link float-right" href="sign-up.jsp">Sign up here</a>
					</form>
				</div>



			</div>

		</div>



	</div>








	<!-- Bootstrap core JavaScript -->
	<script src="node_modules/jquery/dist/jquery.min.js"
		type="text/javascript"></script>
	<script src="node_modules/popper.js/dist/popper.min.js"
		type="text/javascript"></script>
	<script src="node_modules/bootstrap/dist/js/bootstrap.bundle.js"
		type="text/javascript"></script>

</body>
</html>