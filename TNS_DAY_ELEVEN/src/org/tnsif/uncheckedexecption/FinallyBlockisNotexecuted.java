package org.tnsif.uncheckedexecption;
//program to demonstrate on when finally block is not executed
public class FinallyBlockisNotexecuted {

	static void display(int arr[])
	{
		
		try {
			System.out.println(arr[2]);
			// if try and catch block contain System.exit(0);
			// after the execption code line then finally block does not execute
			//System.exit(0);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Execption handel"+e);
		}
		finally
		{
			/* when finally block contain an execption code,then
			 * finally block does not execute*/
			System.out.println(13/0);
			System.out.println("Finally Block is always execute");
		}
		System.out.println("ANy statement out of the block is always"+"executed");
		
		
	}
	public static void main(String[] args) {
		int arr[]= {12,6,67};
		display(arr);


	}

}
