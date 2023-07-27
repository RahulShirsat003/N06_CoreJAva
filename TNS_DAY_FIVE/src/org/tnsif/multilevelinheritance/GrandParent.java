package org.tnsif.multilevelinheritance;

public class GrandParent {
	private String surname;
	private long property;
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public long getProperty() {
		return property;
	}
	public void setProperty(long property) {
		this.property = property;
	}
	public GrandParent(String surname, long property) {
		super();
		this.surname = surname;
		this.property = property;
	}
	@Override
	public String toString() {
		return "GrandParent [surname=" + surname + ", property=" + property + "]";
	}
	
	
  
  
  
}
