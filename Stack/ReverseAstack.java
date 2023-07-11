package Stack;

import java.util.Stack;

public class ReverseAstack {
	public static void pushAtBottom(Stack<Integer> s , int data) {
		if(s.isEmpty()) {
			s.push(data); // when s is empty ,directly push
			return; 
		}
		
		int top =s.pop();  //moving up , store top
		pushAtBottom(s, data);//call for next level
		s.push(top);// when returning push allelement
	}
	
	public static void reverseStack(Stack<Integer> s ) {
		if(s.isEmpty()) {
			return;
		}
		
		//using recursion
		int top = s.pop();
		reverseStack(s);//next call
		pushAtBottom(s, top); // push at bottom of stack
	}
	
	public static void printStack(Stack<Integer> s ) { 
		while (!s.isEmpty()) {
			System.out.println(s.pop());
		}
	}
	
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		
		//3,2,1
		reverseStack(s);
		printStack(s);
		//1,2,3
	}
}
