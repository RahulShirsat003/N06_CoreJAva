package org.tnsif.uncheckedexecption;

public class ThrowAndThrowsKeywordDeom {

	static void isEliglible(int age,int weight)
	{
		if(age>18 && weight>50)
		{
			System.out.println("Perosn is eligble");
		}
		else
			//throw keyword is used ti throw an exception explicitly
			throw new ArithmeticException("Critaria is  no satisfied");
	}
	
	
	public static void main(String[] args) {
		try {
			isEliglible(13,55);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
