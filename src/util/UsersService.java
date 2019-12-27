package util;

import java.util.Map;

import javax.servlet.http.HttpSession;

import entity.User;

/**
 * @author leanh
 *
 */
public class UsersService {

	// store Loged in
	public static void storeLogedInUser(HttpSession session, User logedInUser) {
		session.setAttribute("logedInUser", logedInUser);
		session.setMaxInactiveInterval(60 * 60);
	}

	// get user info that saved in session
	public static User getlogedInUser(HttpSession session) {
		return (User) session.getAttribute("logedInUser");
	}

	public static User findUser(Map<String, User> users, String userName, String password) {
		User user = users.get(userName.toLowerCase());
		return (user != null && user.getUserName().equalsIgnoreCase(userName) && user.getPassWord().equals(password))
				? user
				: null;
	}

	public static boolean isExistUserName(Map<String, User> users, String userName) {
		// TODO Auto-generated method stub
		return users.get(userName.toLowerCase()) != null;
	}
}
