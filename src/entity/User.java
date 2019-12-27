package entity;

import java.io.Serializable;

public class User implements Serializable{
	/**
	 *  for saving data to disk on server
	 */
	private static final long serialVersionUID = 1L;
	private String userName;
	private String passWord;
	
	public User() {
		super();
	}

	public User(String userName, String passWord) {
		super();
		this.userName = userName;
		this.passWord = passWord;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	
	
}
