package Inheritance;


					//Example 01
/*
class X{
	 int a,b,c=0;
	 void Add()
	 {
		 a=10;
		 b=20;
		 c=a+b;
		 System.out.println("a+b= "+c);
		 
	 }
}

class Y extends X
{
	int m=50;
	int n=30;
	int o=0;
	void mul()
	{
		o = m*n;
		System.out.println("mxn= "+o);
	}
}

class Z extends X
{
	int e=50;
	int f=30;
	double g=0;
	void Div()
	{
		g = e/f;
		System.out.println("mxn= "+g);
	}
}





*/

					//Example 02

class X
{
	void input()
	{
		System.out.println("Enter your name  ");
	}
}

class Y extends X
{
	void Show()
	{
		System.out.println("My name is shobhit");
	}
}

class Z extends X
{
	void disp()
	{
		System.out.println("My name is Dev");
	}
}


public class hierarchicl_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Y r=new Y();
		Z r2=new Z();
		
		r.input(); r.Show();
		r2.input(); r2.disp();
	}

}
