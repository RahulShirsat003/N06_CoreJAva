// program to demonstrate custom Exception

package org.tnsifcustomexception;

import java.util.Scanner;

public class CustomExceptionExecutor {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		String userid = s.nextLine();
		String password = s.nextLine();
		try {
			if(userid.equals("Rahul")&& password.equals("pass@123"))
			{
				System.out.println("Credentials are matched");
			
			}
			else
			{
				throw new LoginCredentials("Invaild Credentials");
			}
		}
		catch(LoginCredentials e)
		{
			System.out.println("Exception Handel "+e);
		}
	}

}
