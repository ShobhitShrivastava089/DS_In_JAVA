package Inheritance;

class C{
	int x=0;
	int a=10;
	int b=20;
	void Addition()
	{
		x=a+b;
		System.out.println("a+b= "+x);
	}
}


class D extends C
{
	String s="Shobhit";
	void show()
	{
		System.out.println(s);
	}
	
}

class E extends D
{
	int l=50;
	int m=40;
	int n=0;
	void sub() {
		n=l-m;
		System.out.println("l=m= "+n);
	}
}

public class Multilevel_Inheritance {
	
	public static void main(String[] args) {
		E e= new E();
		e.show();
		e.sub();
		e.Addition();
	}

}
