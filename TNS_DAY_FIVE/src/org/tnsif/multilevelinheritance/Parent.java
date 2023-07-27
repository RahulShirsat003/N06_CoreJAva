package org.tnsif.multilevelinheritance;

public class Parent extends GrandParent {

	private String pName;
	private long parentProperty;
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public long getParentProperty() {
		return parentProperty;
	}
	public void setParentProperty(long parentProperty) {
		this.parentProperty = parentProperty;
	}
	public Parent(String surname, long property , String pName , long parentProperty) {
		super(surname, property);
		this.pName = pName;
		this.parentProperty = parentProperty;
		
		
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Parent [pName=" + pName + ", parentProperty=" + parentProperty + ", toString()=" + super.toString()
				+ "]";
	}
	
	}
	
	

