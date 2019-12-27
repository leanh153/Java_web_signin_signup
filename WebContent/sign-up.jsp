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
		String userName = request.getAttribute(Message.INFO_SIGNUP_USERNAME) != null
				? (String) request.getAttribute(Message.INFO_SIGNUP_USERNAME)
				: "";
		String passWord = request.getAttribute(Message.INFO_SIGNUP_PASSWORD) != null
				? (String) request.getAttribute(Message.INFO_SIGNUP_PASSWORD)
				: "";

		String errorUserName = request.getAttribute(Message.ERROR_SIGNUP_USERNAME) != null
				? (String) request.getAttribute(Message.ERROR_SIGNUP_USERNAME)
				: "";
		String errorPassWord = request.getAttribute(Message.ERROR_SIGNUP_PASSWORD) != null
				? (String) request.getAttribute(Message.ERROR_SIGNUP_PASSWORD)
				: "";

		String errorExistUserName = request.getAttribute(Message.ERROR_SIGNUP_USER_NAME_EXISTED) != null
				? (String) request.getAttribute(Message.ERROR_SIGNUP_USER_NAME_EXISTED)
				: "";
	%>



	<div class="container-fluid">
		<div class="row">
			<div class="card mx-auto mt-5">
				<div class="card-header">
					<h2 class="text-center">SIGN UP</h2>
				</div>
				<div class="card-body">
					<form method="POST"
						action='<%=request.getContextPath() + "/LoginProcess?action=dosignup"%>'>

						<div class="form-group">
							<label for="userName">User Name</label> <input type="text"
								name="userName" id="userName" class="form-control"
								placeholder="User name" value="<%=userName%>">
								<small class="text-danger card-text"><%=errorUserName%></small>

						</div>

						<div class="form-group">
							<label for="password">Password</label> <input type="password"
								name="password" id="password" class="form-control"
								placeholder="Password" value="<%=passWord%>">
								<p class="text-break text-danger small"><%=errorPassWord%></p>
						</div>
						<div class="text-danger"><%=errorExistUserName%></div> <br />
						<button type="submit" class="btn   btn-success">Sign up</button>

						<a class="link float-right" href="login.jsp">Log in here</a>
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