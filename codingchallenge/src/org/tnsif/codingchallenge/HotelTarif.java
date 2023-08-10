package org.tnsif.codingchallenge;
import java.util.*;
public class HotelTarif {

	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int month;
		int rent;
		int days;
		
		month = s.nextInt();
		rent = s.nextInt();
		days = s.nextInt();
		
		switch(month)
		{
		case 1:
		case 2:
		case 3:
		case 7:
		case 8:
		case 9:
		case 10:
			System.out.println(rent*days);
			break;
		case 4:
		case 5:
		case 6:
		case 11:
		case 12:
			System.out.println((rent+(rent*0.2f))*days);
			break;
		}
			

	}

}
