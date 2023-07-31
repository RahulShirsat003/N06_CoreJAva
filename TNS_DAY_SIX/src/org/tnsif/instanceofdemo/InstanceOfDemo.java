package org.tnsif.instanceofdemo;

class RBI
{
	protected String ifscCode;
	

}

class SBI extends RBI
{
	public SBI() {
		super.ifscCode = "RBIN000213"; 
		String ifscCode = "SBIN000216";
		System.out.println(ifscCode);
		System.out.println(super.ifscCode);
		/* if parent class and child class variable name are same
		 * in such case, use super. variablename to access that
		 * variable of parent class inside these child class*/
	}
}
public class InstanceOfDemo {

	public static void main(String[] args) {
	
		SBI s=new SBI();
		System.out.println(s instanceof SBI);
		System.out.println(s instanceof RBI);
		
	}

}
