package datastructure;

public class LinkedListDemo {
	
	Node head;
	
	static class Node{
		int data;
		
		Node next;
		
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	public void display() {
		Node n = head;
		while(n != null) {
			System.out.println(n.data + "\n");
			n=n.next;
		}
	}
	
	public static void main(String[] args) {
		LinkedListDemo linkedListDemo = new LinkedListDemo();
		linkedListDemo.head = new Node(101);
		Node second = new Node(201);
		Node third = new Node(301);
		linkedListDemo.head.next=second;
		second.next=third;
		linkedListDemo.display();
	}
}
