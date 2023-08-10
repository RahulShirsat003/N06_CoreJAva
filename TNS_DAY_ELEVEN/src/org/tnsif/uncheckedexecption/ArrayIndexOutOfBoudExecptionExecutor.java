package org.tnsif.uncheckedexecption;

public class ArrayIndexOutOfBoudExecptionExecutor {

	static void display(int arr[])
	{
		
		try {
			System.out.println(arr[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Execption handel"+e);
		}
		finally
		{
			System.out.println("Finally Block is always execute");
		}
		System.out.println("ANy statement out of the block is always"+"executed");
		
		
	}
	
	public static void main(String[] args) {
		int arr[]= {12,6,67};
		display(arr);

	}

}
