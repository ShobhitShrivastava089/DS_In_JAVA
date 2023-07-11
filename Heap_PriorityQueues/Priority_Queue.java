package Heap_PriorityQueues;
import java.util.*;
public class Priority_Queue {
	
	static class Student implements Comparable<Student>{
		String Name;
		int rank;
		
		public Student(String Name , int rank) {
			this.Name =Name;
			this.rank =rank;
			
		}
		
		@Override
		public int compareTo(Student s2) {
			return this.rank - s2.rank;
		}  
	}
	
	
	public static void main(String[] args) {
		PriorityQueue<Student> pq = new PriorityQueue<>();
		//comparator is used to reverse the logic or reverse the order
		pq.add(new Student("A",4));
		pq.add(new Student("B",5));
		pq.add(new Student("C",2));
		pq.add(new Student("D",12));
		
		
		while (!pq.isEmpty()) {
			System.out.println(pq.peek().Name+ " -> "+pq.peek().rank);
			pq.remove();
			
			//By default in ascending order elements get remove
		}
	}
}
