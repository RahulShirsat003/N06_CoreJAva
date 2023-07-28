package org.tnsif.encapsulation;

public class EncapsulationExecutor {

	public static void main(String[] args) {
		//setting a value to private data members
		Hdfc h = new Hdfc();
		h.setAccType("Saving Account");
		h.setAccountNo(12443445);
		h.setAtmCardNo(12343556);
		h.setPinNo(1221);
		
		//below line will call toString()
		System.out.println(h);
		
		//System.out.println("Account no is:"+h.getAccountNo());
	}

}
