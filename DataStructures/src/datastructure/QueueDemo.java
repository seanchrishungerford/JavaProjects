package datastructure;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {
	public static void main(String[] args) {
		
		PriorityQueue<Student> pq = new PriorityQueue<Student>();
		
		pq.add(new Student(101, "Bob", "Lake Charles", "Math"));
		pq.add(new Student(102, "John", "Lake Charles", "Math"));
		pq.add(new Student(103, "Mark", "Lake Charles", "Math"));
		pq.add(new Student(104, "David", "Lake Charles", "Math"));
		
		System.out.println(pq.element());
		System.out.println(pq.peek());
		
		Iterator<Student> itr = pq.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		pq.remove();
		pq.poll();
		
		Iterator<Student> itr2 = pq.iterator();
		
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
	}
}
