//program to demonstrate on cascaded if...else statement

package org.tnsif.decisionmaking;
import java.util.*;
public class CascadedIfElseExecutor {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Your Age");
		int age1=s.nextInt();
		int age2=s.nextInt();
		int age3=s.nextInt();
		
		if(age1>age2 && age1>3)
		{
			System.out.println("Age is Grater :"+age1);
		}
		else if(age2>age1 && age2>age3)
		{
			
			System.out.println("Age is Greater: "+age2);
			
		}
		else
		{
			System.out.println("Age is Greater :"+age3 );
		}
		
	}

}
