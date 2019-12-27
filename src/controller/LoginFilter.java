package controller;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class LoginFilter
 */
@WebFilter("/*")
public class LoginFilter implements Filter {
	private static final String[] loginRequireURLs = { "index.jsp", "userCounter.jsp", "profile.jsp" };

	/**
	 * Default constructor.
	 */
	public LoginFilter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;

		HttpSession session = request.getSession(false);

		boolean isLogedIn = session != null && session.getAttribute("logedInUser") != null;
		String requestURL = request.getRequestURI();

		if (!isLogedIn && loginRequire(requestURL)) {
			/// if users have not loged in yet, then send them to login page 
			request.getRequestDispatcher("login.jsp").forward(request, response);

		} else if (isLogedIn && (requestURL.endsWith("login.jsp") || requestURL.endsWith("sign-up.jsp"))) {
				// if users have already loged in and try to login and sign up pages then forward
				// them to index.jsp home page
			request.getRequestDispatcher("index.jsp").forward(request, response);
		} else {
			// else keep doing what they want
			chain.doFilter(req, res);

		}
	}

	private boolean loginRequire(String requestURL) {
		// TODO Auto-generated method stub
		for (String require : loginRequireURLs) {
			if (requestURL.endsWith(require)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
