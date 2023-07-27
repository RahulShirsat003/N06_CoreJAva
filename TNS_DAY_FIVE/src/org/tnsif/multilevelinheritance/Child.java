package org.tnsif.multilevelinheritance;

public class Child extends Parent{
	private String cname;
	private long childPorperty;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public long getChildPorperty() {
		return childPorperty;
	}
	public void setChildPorperty(long childPorperty) {
		this.childPorperty = childPorperty;
	}
	public Child(String surname, long property, String pName, long parentProperty, String cname,long childProperty) {
		super(surname, property, pName, parentProperty);
		this.cname = cname;
		this.childPorperty = childProperty;
	}
	@Override
	public String toString() {
		return "Child [cname=" + cname + ", childPorperty=" + childPorperty + ", toString()=" + super.toString() + "]";
	}
	
	
	
}

