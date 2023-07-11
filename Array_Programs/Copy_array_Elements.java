package Array_Programs;

import java.util.Scanner;
import java.util.Arrays;

public class Copy_array_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		int a2[]=new int[5];
		
		Scanner r= new Scanner(System.in);
		System.out.println("Enter elements");
		for (int i = 0; i < a.length; i++) {
			a[i]=r.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			a2[i]=r.nextInt();
		}
		
		boolean b=Arrays.equals(a, a2);
		System.out.println("Is arrays are equals"+" "+b);
		
		/*for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}*/
		/*System.out.println("\nSecond array elements");
		for (int i = 0; i < a.length; i++) {
			b[i]=a[i];
			System.out.print(b[i]+" ");
		}*/
		
		
	}

}
