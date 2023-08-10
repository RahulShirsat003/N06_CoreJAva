package org.tnsif.singledimensionalarray;
//program to demonstrate on array of Onjects 
public class Emloyees {
	private int empId;
	private String Name;
	private double salart;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getSalart() {
		return salart;
	}
	public void setSalart(double salart) {
		this.salart = salart;
	}
	public Emloyees(int empId, String name, double salart) {
		super();
		this.empId = empId;
		Name = name;
		this.salart = salart;
	}
	
	

}
