package mypack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Employee> al= new HashSet<Employee>();
		al.add(new Employee(101, "John", "Frisco"));
		al.add(new Employee(102, "Jake", "Dallas"));
		al.add(new Employee(103, "Bob", "Lake Charles"));
		al.add(new Employee(104, "Jacob", "Houston"));
		
		al.add(new Employee(105, "Johnny", "New York"));
		
		//Collections.sort(al, new NameComparator()); //Change comparator based on what you want to sort by
		//Collections.reverse(al);
		
		for(Object ob: al) {
			System.out.println(ob);
		}
		
	}
	
}
