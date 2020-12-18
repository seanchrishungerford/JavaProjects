package mypack;

import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer, Employee> hm = new HashMap<Integer, Employee>();
		
		hm.put(2010, new Employee(101, "Bob", "New York"));
		hm.put(2010, new Employee(102, "Bob", "New York"));
		hm.put(2010, new Employee(103, "Bob", "New York"));
		
		System.out.println(hm);
		
	}
	
}
