package datastructure;



public class DoublyDemo {
	
	class Node{
		int data;
		Node previous;
		Node next;
		
		public Node(int data) {
			this.data=data;
		}
		
	}
	
	Node head,tail=null;
	public void addNode(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head=tail=newNode;
			head.previous=null;
			tail.next=null;
		}
		else {
			tail.next = newNode;
			newNode.previous = tail;
			tail=newNode;
			tail.next=null;
		}
	}
	
	public void display() {
		Node current = head;
		if(head == null) {
			System.out.println("list is empty");
			return;
		}
		System.out.println(current.data + " ");
		current = current.next;
	}
	
	public static void main(String[] args) {
		DoublyDemo dd=new DoublyDemo();
		dd.addNode(101);
		dd.addNode(201);
		dd.addNode(301);
		dd.addNode(401);
		dd.addNode(501);
		dd.display();
	}
	
}
