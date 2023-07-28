/* ask user for there birth year encoded as 2 digit (like 2003 = "03") and for current year
 * also encoded as 2 digits(2023 = "23") Write a program to find user current age in years  */



package org.tnsif.codingchallenge;

import java.util.*;

public class AgeCalculatorExecutor {

	static void ageCalculator(int by,int cy)
	{
		if(cy>by)
		{
			System.out.println(cy-by);
		}
		else
		{
			System.out.println((100-by)+cy);
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Birth and Current Year: ");
		int by=s.nextInt();
		int cy =s.nextInt();
		ageCalculator(by,cy);
		
	}

}
