package org.tnsif.thiskeyworddemo;
class Team
{
	int size;
	Team()
	{	
		this(7);
		System.out.println("Default Constructor");
	}
	Team(int size)
	{
		System.out.println("parmetrized Constructor "+size);
	}

}
public class ThisKeywordDemoThree {

	public static void main(String[] args) {
		Team t = new Team();
	

	}

}
