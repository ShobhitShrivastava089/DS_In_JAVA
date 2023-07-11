package Array_Programs;

import java.util.Scanner;

public class Search {
	public static void main(String[] args) {
		int n,sum=0;
		int count=0;
		int a[]=new int[5];
		Scanner r= new Scanner(System.in);
		System.out.println("Enter elements");
		
		for (int i = 0; i < a.length; i++) {
			a[i]=r.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("\nEnter search element");
		n=r.nextInt();
		for (int i = 0; i < a.length; i++) {
			if (a[i]==n) {
				count++;
			}
		}
		if (count>0) {
			System.out.println("Item found "+count+" times");
		}
		else
			System.out.println("not found");
	}
}
