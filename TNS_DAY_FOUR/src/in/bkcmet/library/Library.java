//Program to demonstrate for access specifier

package in.bkcmet.library;

public class Library 
{
	//different access specifier 
	public String libraryName;
	private long userId;
	String booksName;
	
	//Public Method
	public void displayPublic()
	{
		System.out.println("Library name"+libraryName);
	}
	//Private Method
	private void displayPrivate()
	{
		System.out.println("User Id"+userId);
		
	}
	//Default Method
	void displayDefault()
	{
		System.out.println("Book Name"+booksName);
	}
}
