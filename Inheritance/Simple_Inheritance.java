package Inheritance;

class A{
	int x=0;
	int a=10;
	int b=20;
	String c="Shobhit";
	void add() {
		x=a+b;
		System.out.println("a+b ="+x);
	}
	
}

class B extends A{
	String z= "Shrivastava";
	int i=20;
	int k=30;
	int l=0;
	void sub()
	{
		l=i-k;
		System.out.println("i-k= "+l);
	}
}


public class Simple_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B r=new B();
		System.out.println(r.a+" "+r.b+" "+r.c+" "+r.z);
		r.add();
		r.sub();
	}

}
