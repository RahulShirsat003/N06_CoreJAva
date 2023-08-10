package org.tnsif.codingchallenge;
import java.util.*;

public class MovieTicket {

	public static void ticket(int age,float time) 
	{
		//adult 
		if(age>13)
		{
			if(time>=13.30 && time<=17.59)
				System.out.println("$5.00");
			else
				System.out.println("$8.00");
		}
		//childern
		else
		{
			if(time>=13.30 && time<=17.59)
				System.out.println("$2.00");
			else
				System.out.println("$4.00");
		}
			

	}

	public static void main(String[] args)
	{
		Scanner s  = new Scanner(System.in);
		int age =s.nextInt();
		float time = s.nextFloat();
		ticket(age,time);
		
	}
}
