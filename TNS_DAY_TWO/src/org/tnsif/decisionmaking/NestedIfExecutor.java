//program to demonstrate on bunjee jumping using nested if

package org.tnsif.decisionmaking;
import java.util.*;

public class NestedIfExecutor {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int age = s.nextInt();
		int weight = s.nextInt();
		
		if(age>=12)
		{
			if(weight>=40)
			{
				System.out.println("Eligible for bunjee jumping");
				if(weight>100)
				{
					System.out.println("extre ropes will added");
				}
			}
			else
			{
				System.out.println("Not eligble");
			}
		}
		
		else 
		{
			System.out.println("Not eligble");
		}
	}
	

}
