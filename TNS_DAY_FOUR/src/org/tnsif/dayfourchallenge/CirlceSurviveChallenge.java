/* there are n people standing in a circle waiting to be executed 
 * the counting are being at some point to the circle and proceeds in a fixed direction
 * in each step a certain number of people are skipped and next person is executed.
 * the elimination proceeds around the circle(which is become smaller and smaller are the executed
 * people are remove ),until only the last person remains,how is given freedom.
 * given:
 * the total number of person n and a number k which indicate that k-1 person are skipped
 * and kth person killed in circle the task is choice the person in the initial circle that are survived*/



package org.tnsif.dayfourchallenge;
import java.util.*;
public class CirlceSurviveChallenge {
	
	static int survive(int n,int k)
	{
		if(n==1)
			return 1;
		else
			return(survive(n-1,k)+k-1)%n+1;
	}
	
	

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		System.out.println("Entet the valuue of n and k");
		int n =s.nextInt();
		int k = s.nextInt();
		
		System.out.println(survive(n,k));
	}

}
