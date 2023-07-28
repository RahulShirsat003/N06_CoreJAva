/* Darshan is so much interesting in gardening and hence he plants more tree in his garden
 * he plants trees in rectangular fashion with the order of row and columns and numbers the tree
 * in the row wise order. he planted the mango tree in the first row first columns and last column
 * so the given the tree number(t)and row and columns number (n)your task is find out whether a given
 * tree mango or not*/





package org.tnsif.codingchallenge;
import java.util.*;
public class MangoTreeExecutor {

	static void isMangoTree(int n , int t)
	{
		if(t%n==0 || t%n==1 || t<=n)
		{
			System.out.println("Mango Tree");
			
		}
		else
		{
			System.out.println("Not a Mango Tree");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of n and t");
		int n=s.nextInt();
		int t=s.nextInt();
		isMangoTree(n,t);
		
	}

}
