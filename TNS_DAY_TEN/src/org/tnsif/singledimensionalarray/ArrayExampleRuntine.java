/* program to demonstrate on array using run time input value and
 * to find largest element in an array*/
package org.tnsif.singledimensionalarray;
import java.util.*;
public class ArrayExampleRuntine {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter thr total no of element");
		int n = s.nextInt();
		int arr[]=new int[n];
		for(int i = 0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("Array element are:");
		for(int i = 0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int max=arr[0];
		for(int i=0;i<n;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Largest number are:"+max);
		Arrays.sort(arr);
		System.out.println("Sorted elements are: ");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}
	

}
