package Array_Programs;

import java.util.Scanner;

public class Sorting_IN_ascending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5]; 
		int temp;
		Scanner r= new Scanner(System.in);
		System.out.println("Enter elements");
		
		for (int i = 0; i < a.length; i++) {
			a[i]=r.nextInt();
		}
		
		System.out.println("\nPrinted array");
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
		/*for(int i = 0; i < a.length; i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if (a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
							
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print("\n"+a[i]+" ");
		}*/
		
		
	}

}
