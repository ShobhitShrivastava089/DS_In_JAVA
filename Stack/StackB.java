package Stack;

import java.util.*;

public class StackB {
	
	//stack using java Collection framework
	//See in main method only single line change need to perform
	
	
	
	//Stack using :inked list
	
//	static class Node{
//		int data;
//		Node next;
//		Node (int data){
//			this.data=data;
//			this.next=null;
//			
//		}
//	}
//	
//	static class Stack{
//		static Node head = null;
//		
//		
//		public static boolean isEmpty()
//		{
//			return head == null;
//			
//		}
//		
//		//push
//		public static void push(int data)
//		{
//			
//			Node newNode = new Node(data);
//			if(isEmpty()) {
//				head=newNode;
//				return;
//			}
//			newNode.next = head;  //
//			head = newNode;
//		}
//		
//		//pop
//		public static int pop() {
//			if(isEmpty()) {
//				return -1;
//			}
//			int top = head.data;
//			head = head.next;
//			return top;
//		}
//		
//		//peek
//		public static int peek() {
//			if(isEmpty()) {
//				return -1;
//			}
//			return head.data;
//		}
//	}
	
	
	
	
	
	//Arraylist used to create stack
//	static class Stack{
//		static ArrayList<Integer> list = new ArrayList<>();
//		public static boolean isEmpty() {
//			return list.size()==0;
//		}
//		
//		//Push
//		public static void push(int data) {
//			list.add(data);
//			
//		}
//		
//		//pop
//		public static int pop() {
//			
//			if (isEmpty()) {
//				return -1;
//			}
//			
//			int top = list.get(list.size()-1);
//			list.remove(list.size()-1);
//			return top;
//			
//		}
//		
//		//peek
//		public static int peek() {
//			if (isEmpty()) {
//				return -1;
//			}
//			return list.get(list.size()-1);
//			
//		}
//		
//	}
	
	
public static void main(String[] args) {
	
	Stack<Integer> s = new Stack<>();
//	Stack s = new StackB();
	
	s.push(1);
	s.push(2); 
	s.push(3);
	
	while (!s.isEmpty()) {
		System.out.println(s.peek());
		
		s.pop();
		}
	
	
	}
}
