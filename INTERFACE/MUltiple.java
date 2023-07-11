package INTERFACE;

interface A
{
	void show();
}
interface B
{
	void show();
}



public class MUltiple implements A,B{
	
	public void show()
	{
		System.out.println("INterface A and B are work");
	}
	public static void main(String[] args) {
		MUltiple m=new MUltiple();
		m.show();
	}
}
