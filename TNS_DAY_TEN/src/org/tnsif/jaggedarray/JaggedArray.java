//program to demonstarte on a jagged array

package org.tnsif.jaggedarray;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		//declartion of a jagged array
		int arr[][]=new int[3][];
		arr[0]=new int[2];
		arr[1]=new int[1];
		arr[2]=new int[3];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		System.out.println("Enter array element");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
		}
		System.out.println();
	}

}
