<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap core CSS -->
<link href="node_modules/bootstrap/dist/css/bootstrap.min.css"
	rel="stylesheet">


<title>Insert title here</title>
</head>
<body class="bg-dark">

	<%
		String welcomeMessage = session.isNew() ? "Welcome to the board" : "Welcome back!";
	%>

	<div class="container-fluid">
		<div class="row">

			<div class="card mx-auto my-5 p-5">
				<h2 class="text-center"><%=welcomeMessage%></h2>
				<a class="btn  btn-success " href="sign-up.jsp">Sign up here</a><br />
				<a class="btn btn-danger " href="login.jsp">Log in here</a>


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