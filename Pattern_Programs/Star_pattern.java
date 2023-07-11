package Pattern_Programs;

import java.util.Scanner;

public class Star_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k;
		int n;
		System.out.println("Enter n");
		Scanner r= new Scanner(System.in);
		n=r.nextInt();
		
		for(i=1;i<=n;i++)//rows
		{ 
			for(j=1;j<i;j++)//space 			
			{									
				System.out.print(" ");			
			}		
			for(k=i;k<=n;k++)
			{
				System.out.print("*");
			}
			System.out.print("\n");	
		}
		
	}

}
