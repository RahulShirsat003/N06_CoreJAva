//program to demonstrate Switch case

package org.tnsif.decisionmaking;
import java.util.*;
public class SwitchExecutor {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter song no");
		int songno = s.nextInt();
		switch(songno)
		{
			case 1:
				System.out.println("waka waka");
				break;
			case 2:
				System.out.println("taki taki");
				break;
				
			case 3:
				System.out.println("Jay shree ram");
				break;
			default:
				System.out.println("wronh Input");
		}

	}

}
