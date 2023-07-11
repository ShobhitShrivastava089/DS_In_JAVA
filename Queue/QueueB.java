package Queue;
import java.util.*;
public class QueueB {
	
	
//	static class Node{                   //using Linked List.
//		int data;
//		Node next;
//		
//		Node(int data){
//			this.data=data;
//			this.next= null;
//		}
//	}
//	
//	static class Queue{
//		
//		static Node head = null;
//		static Node tail = null;
//		
//		
		
		
//		static int arr[];
//		static int size;
//		static int rear;
//		
//		static int front; // for circular queue implementation
		
//		Queue(int n)
//		{
//			arr =new int[n];
//			size = n;
//			rear = -1;
//			front =-1;
//		}
		
//		public static boolean isEmpty()
//		{
////			return  rear == -1;   // for queue using array
//			return head == null && tail == null;
//		}
//		
//		public static boolean isFull() {
//			return (rear+1)%size == front;
//		}
//		
//		//Add
//		public static void add(int data)
//		{
//			//for Normal queue
//			/*if(rear == size-1) {
//				System.out.println("Queue is full");  
//				return;
//			}
//			rear = rear+1;
//			arr[rear]=data;*/
//			
			//for circular queue
//			if(isFull()) {
//				System.out.println("Queue is full");  
//				return;
//			}
//			if(front == -1)
//			{
//				front=0;
//			}
//			rear = (rear+1)% size;
//			arr[rear] = data;
			
//			//Using Linked list***************
//			Node newNode = new Node(data);
//			
//			if (head==null) {
//				head=tail=newNode;
//				return;
//			}
//			tail.next = newNode;
//			tail=newNode;
//		}
//		
//		
//		
//		//Remove
//		public static int remove() {
//			if(isEmpty()) {
//				System.out.println("Empyt queue");
//				return -1;
//			}
//			
//		/*	int front = arr[0];
//			
//			for (int i = 0; i < rear; i++) {
//				arr[i] =arr[i+1];
//			}
//			rear = rear-1;
//			return front;*/
//			
//			//for circular queue
//			
////			int result = arr[front];
////			if (rear == front) {
////				rear = front = -1;
////			}
////			else {
////				front = (front+1)%size;
////			}
////			return result;
//			
//			//using Linked list
//			int front = head.data;
//			//single elment
//			if (tail==head) {
//				tail=head=null;
//				
//			}
//			else {
//				head =head.next;
//			}
//			return front;
//		}
//		
//		
//		
		
		
		//peek
//		public static int peek() {
//			if(isEmpty()) {
//				System.out.println("Empyt queue");
//				return -1;
//			}	
//			return arr[0];
			//for circular queue
//			return arr[front];
			
//			//using linked list
//			return head.data;
//			
//		}
//	}
//	
//	
	
	
	
	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<>(); //ArrayDeque
//		Queue q = new Queue();
		q.add(1);
		q.add(2);
		q.add(3);
//		System.out.println(q.remove());
//		q.add(4);
//		System.out.println(q.remove());
//		q.add(5);
		
		
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}
		
	}
}
