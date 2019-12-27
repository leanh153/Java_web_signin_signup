package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Message;
import entity.User;
import util.UsersService;

/**
 * Servlet implementation class LoginProcess
 */
@WebServlet("/LoginProcess")
public class LoginProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Map<String, User> users;
	int userCounter = 0;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginProcess() {
		super();
		// TODO Auto-generated constructor stub

	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	@SuppressWarnings("unchecked")
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		ObjectInputStream os = null;
		try {
			os = new ObjectInputStream(new FileInputStream("users.ser"));
			users = (Map<String, User>) os.readObject();
		} catch (Exception e) {
			// TODO: handle exception

		} finally {
			try {
				if (os != null) {
					os.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (users == null) {
			users = new HashMap<>();
		}
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		ObjectOutputStream os = null;
		try {

			File file = new File("users.ser");
			os = new ObjectOutputStream(new FileOutputStream(file));
			file.setWritable(true);
			file.setReadable(true);
			os.writeObject(users);
		} catch (IOException e) {
			// TODO Auto-generated catch block
		} finally {
			try {
				if (os != null) {
					os.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("action");
		if (request.getServletContext().getAttribute("userCounter") != null) {
			userCounter = (int) request.getServletContext().getAttribute("userCounter");
		}

		try {
			switch (action) {
			case "dologin":
				processLogin(request, response);
				break;
			case "dosignup":
				processSignUp(request, response);
				break;
			case "dologout":
				doLogout(request, response);
				break;
			default:
				break;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

		}

	}

	private void processSignUp(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");

		if (validateSignUP(request, userName, password)) {
			boolean existed = UsersService.isExistUserName(users, userName);
			if (existed) {
				request.setAttribute(Message.ERROR_SIGNUP_USER_NAME_EXISTED, "User name đã tồn tại!");
				request.getRequestDispatcher("/sign-up.jsp").forward(request, response);
			} else {
				// set map key by user name to lower case, then get User by userName and key is
				// unique
				users.put(userName.toLowerCase(), new User(userName, password));
				request.setAttribute(Message.INFO_SIGNUP_USERNAME, "");
				request.setAttribute(Message.INFO_SIGNUP_PASSWORD, "");
				request.setAttribute(Message.INFO_SIGNUP_SUCCESS, "Successing sign up");
				request.getRequestDispatcher("/login.jsp").forward(request, response);
			}
		} else {
			request.getRequestDispatcher("/sign-up.jsp").forward(request, response);
		}

	}

	private boolean validateSignUP(HttpServletRequest request, String userName, String password) {
		// TODO Auto-generated method stub
		boolean valid = true;
		if (!Pattern.matches("([.*[^$#@%^&*]]){6,}", userName)) {
			// test the length first
			valid = false;
			request.setAttribute(Message.ERROR_SIGNUP_USERNAME,
					"Tên người dùng phải có độ dài hơn 6 ký tự và không chứa các ký tự $#@%^&*");
		} else {
			request.setAttribute(Message.ERROR_SIGNUP_USERNAME, "");

		}

		if (!Pattern.matches("((?=.*[A-Z])(?=.*[!@#$%^&*])(?=.*[a-z])(?=.*\\d)).{8,}", password)) {
			valid = false;
			request.setAttribute(Message.ERROR_SIGNUP_PASSWORD, "Mật khẩu phải dài hơn 8 ký tự và có ít nhất"
					+ "1 số, 1 chữ hoa, 1 chữ thường và 1 ký tự đặc biệt như !@#$%^&*");
		} else {
			request.setAttribute(Message.ERROR_SIGNUP_PASSWORD, "");
		}
		request.setAttribute(Message.INFO_SIGNUP_USERNAME, userName);
		request.setAttribute(Message.INFO_SIGNUP_PASSWORD, password);

		return valid;
	}

	private void processLogin(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");

		User user = UsersService.findUser(users, userName, password);

		if (user != null) {
			request.setAttribute(Message.INFO_LOGIN_USERNAME, "");
			request.setAttribute(Message.INFO_LOGIN_PASSWORD, "");
			request.setAttribute(Message.ERROR_LOGIN_PASSWORD_USER, "");
			// signed in user using session to store info
			UsersService.storeLogedInUser(request.getSession(), user);
			// set user signed in number available to application, application scope
			request.getServletContext().setAttribute("userCounter", ++userCounter);
			request.getRequestDispatcher("/index.jsp").forward(request, response);

		} else {
			request.setAttribute(Message.INFO_LOGIN_USERNAME, userName);
			request.setAttribute(Message.INFO_LOGIN_PASSWORD, password);
			request.setAttribute(Message.ERROR_LOGIN_PASSWORD_USER, "Sai tên người dùng/mật khẩu");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}
	}

	private void doLogout(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		if (request.getSession(false) != null && UsersService.getlogedInUser(request.getSession()) != null) {
			request.getSession(false).invalidate();
			request.getServletContext().setAttribute("userCounter", --userCounter);
			response.sendRedirect(request.getContextPath() + "/login.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
