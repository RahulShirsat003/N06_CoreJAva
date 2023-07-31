package org.tnsif.thiskeyworddemo;


class Director{
	String name;
	void print()
	{
		this.name="Sunil datt";
		display(name);
	}
	void display(String name)
	{
		System.out.println("Director name is "+name);
	}
}





public class ThisKeywordDeomFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Director d = new Director();
		d.print();
	}

}
