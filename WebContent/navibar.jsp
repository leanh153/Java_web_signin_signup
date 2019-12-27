<%
	boolean isLogedin = session != null && session.getAttribute("logedInUser") != null;
	String outInServlet = isLogedin ? (request.getContextPath() + "/LoginProcess?action=dologout")
			: (request.getContextPath() + "/login.jsp");
	String outInDisplayText = isLogedin ? "Log out" : "Log in";
%>
<nav
	class="navbar navbar-expand-md navbar-dark navbar-custom sticky-top">
	<div class="container">
		<a class="navbar-brand" href="#">Se00534x</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarResponsive" aria-controls="navbarResponsive"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarResponsive">
			<ul class="navbar-nav ml-auto">
				<li class="nav-item"><a class="nav-link" href="profile.jsp ">Profile</a></li>
				<li class="nav-item"><a class="nav-link" href="userCounter.jsp">userCounter</a></li>
				<li class="nav-item"><a class="nav-link"
					href="<%=outInServlet%>"><%=outInDisplayText%></a></li>

			</ul>
		</div>
	</div>
</nav>
