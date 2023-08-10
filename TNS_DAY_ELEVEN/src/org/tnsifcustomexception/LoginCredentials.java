package org.tnsifcustomexception;

public class LoginCredentials extends Exception {
//program to demonstrate on custom exeception
// to use custon execption extends
	private String str;

	public LoginCredentials(String str) {
		super();
		this.str = str;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	

	

}
