package org.tnsif.looping;
import java.util.*;

public class WhileLoopExecutor {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		while(num>=1	)
		{
			System.out.print(num+" ");
			num--;
		}

	}

}
