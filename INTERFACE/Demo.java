package INTERFACE;
import java.util.Scanner;
public interface Demo {
	void input();//public+abstract by default
	void output();//public+abstract by default
}

class Shobhit implements Client
{
	String name;
	double sal;
	
	public void input()
	{
		Scanner r= new Scanner(System.in);
		System.out.println("Enter name: ");
		name=r.next();
		System.out.println("Enter salary: ");
		sal=r.nextInt();
		
	}
	public void output()
	{
		System.out.println(name+" "+sal);
	}
	
	public static void main(String[] args) {
		 Client c= new Shobhit();
		 c.input(); c.output();
	}
}
