package Array_Programs;
import java.util.Arrays;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a[]= {10,20,30,40};     Declare type-01
		
		
		/*int a[] = new int [5];   	 Declare type-02
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=50;
		a[4]=40;
		
		for (int i = 0; i <5; i++) {
			System.out.println(a[i]);
		}*/
		
		/*
		int size,j;
		Scanner r=new Scanner(System.in);
		System.out.println("Enter sie of array");
		size =r.nextInt();
		int a[] = new int [size];
		
		for (int i = 0; i < size; i++) {
			a[i]=r.nextInt();
		}
		System.out.print("Printed array");
		for (int i = 0; i <size; i++) {
			System.out.println(a[i]);
		}
		*/
		
		/*
		String a[]= {"Learn","Keyoints","Education"};    Uses of toString()  and aslist() function
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.asList(a));
		*/
		
		/*Reverse the element of an array*/
		
		int a[]=new int[5];
		Scanner r= new Scanner(System.in);
		System.out.println("Enter elements");
		
		for (int i = 0; i < a.length; i++) {
			a[i]=r.nextInt();
		}
		
		System.out.println("\nPrinted array");
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println("\nReverse of an array");
		
		for (int i = a.length-1; i >= 0; i--) {
			System.out.print(a[i]+" ");
		}
		
		
	}

}
