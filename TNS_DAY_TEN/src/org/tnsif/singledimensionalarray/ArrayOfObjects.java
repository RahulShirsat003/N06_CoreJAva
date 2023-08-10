package org.tnsif.singledimensionalarray;

public class ArrayOfObjects {

	public static void main(String[] args) {
		Emloyees arr[] = new Emloyees[3];
		arr[0] = new Emloyees(101,"Rahul",363363);
		arr[1] = new Emloyees(102,"sai",234332);
		arr[2] = new Emloyees(103,"Avinash",2323);
		for(int i =0;i<3;i++)
		{
			System.out.println(arr[i].getEmpId()+" "+arr[i].getName()+" "+arr[i].getSalart());
		}
	}

}
