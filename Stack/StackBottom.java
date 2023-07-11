package Stack;
import java.util.*;
public class StackBottom {
	public static void pushAtBottom(Stack<Integer> s , int data) {
		if(s.isEmpty()) {
			s.push(data); // when s is empty ,directly push
			return; 
		}
		
		int top =s.pop();  //moving up , store top
		pushAtBottom(s, data);//call for next level
		s.push(top);// when returning push allelement
	}
	
	public static String reverString(String str) {
		 Stack<Character> s = new Stack<>();
		 int idx = 0;
		 while (idx < str.length()) {
			s.push(str.charAt(idx));
			idx++;
		}
		 
		 StringBuilder result = new StringBuilder("");
		 while (!s.isEmpty()) {
			char curr = s.pop();
			result.append(curr);
			
		}
		 return result.toString();
	}
	
	public static void main(String[] args) {
		String str = "Helloworld";
		String result = reverString(str);
		System.out.println(result);
	}
}
