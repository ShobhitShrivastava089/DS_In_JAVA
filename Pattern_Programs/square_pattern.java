package Pattern_Programs;

import java.util.Scanner;

public class square_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		int n;
		System.out.println("Enter n");
		Scanner r= new Scanner(System.in);
		n=r.nextInt();
		
		for ( i = 1; i <= n ; i++) {
			for(j=1;j<=n;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		/*
		for ( i = 1; i <= n ; i++) {
			for(j=1;j<=n;j++)
			{
				if (i==1 || i==n || j==1 || j==3) {
					System.out.print("*");
					
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.print("\n");
			
		}*/
	}

}
