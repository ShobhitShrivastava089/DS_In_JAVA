package Array_Programs;

import java.util.Scanner;

public class Sum_of_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		int sum=0;
		Scanner r= new Scanner(System.in);
		System.out.println("Enter elements");
		
		for (int i = 0; i < a.length; i++) {
			a[i]=r.nextInt();
		}
		System.out.println("Array Elements");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
			sum=a[i]+sum;
		}
		System.out.println("\nsum="+sum);
	}

}
