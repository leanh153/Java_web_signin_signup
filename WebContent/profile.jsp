<%@page import="entity.User"%>
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
		User user = (User) session.getAttribute("logedInUser");
		String userName = "";
		String password = "";
		if (user != null) {
			userName = user.getUserName();
			password = user.getPassWord();
		}
	%>


	<jsp:include page="navibar.jsp"></jsp:include>
	<div class="container-fluid">
		<div class="row">
			<div class=" card mx-auto my-5 p-5">
				<h2 class="text-center">Profile</h2>
				<p>
					User name :
					<%=userName%></p>
				<br />
				<p>
					Password :
					<%=password%>
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