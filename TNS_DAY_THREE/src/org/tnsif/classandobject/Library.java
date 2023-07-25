//program to demonstrate on default and parameterized constructor

package org.tnsif.classandobject;

public class Library {
	public long noOfBooks;
	public String authorname;
	public String bookName;
	//Default
	public Library() {
		super();
		System.out.println("Deafult Constructor");
	}
	//Parameterized
	public Library(long noOfBooks, String authorname, String bookName) {
		super();
		this.noOfBooks = noOfBooks;
		this.authorname = authorname;
		this.bookName = bookName;
		System.out.println("Parametrized Constructor");
	}
	@Override
	public String toString() {
		return "Library [noOfBooks=" + noOfBooks + ", authorname=" + authorname + ", bookName=" + bookName + "]";
	}
	
	
}
