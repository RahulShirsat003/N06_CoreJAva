package org.tnsif.decisionmaking;
import java.util.*;

public class IfEsleExecutor {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age and weight");
		int age = s.nextInt();
		int weight = s.nextInt();
		
		if(age>18 && weight>50)
		{
			System.out.println("Eligible to donate blood");
		}
		else
		{
			System.out.println("you are not Eligible to donate blood");
		}
	}

}
