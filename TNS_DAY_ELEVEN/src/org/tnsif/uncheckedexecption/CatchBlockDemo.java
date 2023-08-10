package org.tnsif.uncheckedexecption;
// program to demonstrate on catch block with multiple exception class 
public class CatchBlockDemo {

	
	static void print(int arr[])
	{	
		try {
			System.out.println(arr[3]);
		}
		catch(ArithmeticException | NullPointerException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println("Exception handel:"+e);
		}
	}
	
	
	
	public static void main(String[] args) {
		int arr[]= {12,3,14};
		print(arr);

	}

}
