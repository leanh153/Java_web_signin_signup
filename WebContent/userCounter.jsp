<%@page import="entity.Message"%>
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
	int usersSignedinNumber=0;
	if(getServletContext()!= null){
		
	usersSignedinNumber =(int) getServletContext().getAttribute("userCounter");
	}
	
	%>
	<jsp:include page="navibar.jsp"></jsp:include>
	<div class="container-fluid">

		<div class="card mx-auto col-md-5 ">
			<div class="card-header">
				<h2 class="text-center">USER COUNTER</h2>
				<h4>Number of user signed in: <%=usersSignedinNumber %></h4>
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