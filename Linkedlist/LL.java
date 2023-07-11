package Linkedlist;

import java.util.*;
//package Linkedlist;

 class LL {
	
	 //linked list code from collection framework 
//	 public static void main(String[] args) {
//		LinkedList<String> list = new LinkedList<String>();
//		list.addFirst("a");
//		list.addFirst("is");
//		list.addFirst("this");
//		list.addLast("List");
//		System.out.println(list);
//		list.size();
//		System.out.println(list.size());
//		
//		for (int i = 0; i <list.size(); i++) {
//			System.out.print(list.get(i)+" ");
//		}
//		
//		list.removeFirst();
//		System.out.println(list);
//		
//		list.removeLast();
//		System.out.println(list);
//		
//	}
	 
	 
	 
	 
	 
	 
	 
	 
//	 Linked List code From Scratch
	 
	Node head;
	private int size;
	
	LL(){
		this.size=0;
	}
	
	
	class Node{
		int data;
		Node next;
		
		Node(int  data){ //creating new node
			this.data=data;
			this.next=next;
			size++;
		}
	}
	
	//add first 
	public void addFirst(int data) {
		Node newNode = new Node(data);
		
		if (head==null) {
			head =  newNode;
			return;
			
		} 
		newNode.next =head;
		head = newNode;
	}
	
	//add in last
	public void addLast(int data) {
		Node newNode = new Node(data);
		if (head==null) {
			head =  newNode;
			return;
			
		} 
		 Node currrNode = head;
		 while (currrNode.next!=null) {
			currrNode = currrNode.next;
		}
		 currrNode.next = newNode;
		 
	}
	
	//print function 
	public void printlist() {
		if (head==null) {
			System.out.println("list is empty");
			return;
		}
		 Node currrNode = head;
		 while (currrNode!=null) {
			 System.out.print(currrNode.data+" ");
			currrNode = currrNode.next;
		}
		 System.out.println("null");
		 
	}
	
	//Delete first
	public void deleteFirst(){
		if (head==null) {
			System.out.println("list is empty");
			return;
		}
		size--;
		head = head.next; //this single line delete the first node
	}
	
	//Delete last
	
	public void deleteLast(){
		if (head==null) {
			System.out.println("list is empty");
			return;
		}
		size--;
		if (head.next == null) {     //case when LL has only one node
			head = null;
			return;
		}
		
		Node secondlast = head;
		Node lastNode = head.next;
		while (lastNode.next!=null) {
			lastNode = lastNode.next;
			secondlast = secondlast.next;
			
		}
		secondlast.next = null;
		
		
	}
	
	public int getsize() {
		return size;
	}
	
	public void reverseIterate() {
		if (head==null || head.next == null) {
			System.out.println("list is empty");
			return;
		}
		
		Node prevNode = head;
		Node currNode = head.next;
		while (currNode != null) {
			Node nextNode = currNode.next;
			currNode.next = prevNode;
			
			//update
			prevNode = currNode;
			currNode = nextNode;
		}
		head.next = null;
		head = prevNode;
	}
	
public static void main(String[] args) {
	LL list = new LL();
//	list.addFirst("a");
//	list.addFirst("is");
//	list.printlist();
//	list.addLast("list");
//	
//	list.addFirst("This");
//	list.printlist();
//	
//	list.deleteFirst();
//	list.printlist();
//	
//	list.deleteLast();
//	list.printlist();
//	
//	System.out.println(list.getsize());
	
	list.addLast(1);
	list.addLast(2);
	list.addLast(3);
	list.addLast(4);
	list.printlist();
	
	list.reverseIterate();
	list.printlist();
	
}
	 
	 
}
