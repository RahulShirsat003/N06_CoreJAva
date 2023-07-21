package org.tnsif.opretors;
import java.util.*;
public class TernaryOperatorsDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num=s.nextInt();
		String result = (num%2==0)?"Even":"Odd";
		System.out.println("result is:"+result);
		s.close();
	}

}
