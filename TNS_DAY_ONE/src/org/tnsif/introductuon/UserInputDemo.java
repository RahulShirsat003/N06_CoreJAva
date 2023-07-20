package org.tnsif.introductuon;
import java.util.*;

public class UserInputDemo {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		// For user input Integer
		System.out.println(" Integer is : ");
		int num = s.nextInt();
		System.out.println("The number is "+num);
		
		System.out.println("------------------------------------------------------------------------------");
		
		// For user String input for all sentence
		
		System.out.println("Enter name: ");
		String Name = s.nextLine();
		System.out.println("Name is : "+Name);
		
		System.out.println("----------------------------------------------------------------------------------");
		
		//for user string input for single word
		
		System.out.println("Enter String: ");
		String str = s.next();
		System.out.println("Name is : "+str);
		

	}

}
