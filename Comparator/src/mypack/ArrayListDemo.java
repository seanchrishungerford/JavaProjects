package mypack;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList<Employee> al= new ArrayList<Employee>();
		al.add(new Employee(101, "John", "Frisco"));
		al.add(new Employee(102, "Jake", "Dallas"));
		al.add(new Employee(103, "Bob", "Lake Charles"));
		al.add(new Employee(104, "Jacob", "Houston"));
		
		al.add(2, new Employee(105, "Johnny", "New York"));
		
		Collections.sort(al, new NameComparator()); //Change comparator based on what you want to sort by
		//Collections.reverse(al);
		
		for(Object ob: al) {
			System.out.println(ob);
		}
		
	} //end of main function
	
}
