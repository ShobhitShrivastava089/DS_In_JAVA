package Stack;

import java.util.Scanner;

class stack{
	int top=-1;
	int n=10;
	int a[]=new int[n];
	 
	
	
	void push(Scanner r)
	{
		if(top==n-1)
		{
			System.out.println("overflow");
		}
		else
		{
			System.out.println("Enter the data:");
			
			int i= r.nextInt();
			top=top+1;
			a[top] = i;
			System.out.println("inserted the data:");
			
		}
	}
	
	void pop() {
		if(top==-1)
		{
			System.out.println("underflow");
		}
		else
		{
			top =top-1;
			System.out.println("Item deleted");
			
		}
	}
	
	void show()
	{
		System.out.println("Item are: ");
		for (int j = top; j>=0; j--) {
			System.out.println(a[j]);
		}
	}
}
public class StackUsingArray {
	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
		stack s = new stack();
		s.push(r);
		s.pop();
		s.show();
		
	}
}
