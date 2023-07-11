 package Inheritance;

/* 
 * 
 class R
 {
	 int a=10;
	 
 }
 
 class S extends R
 {
	 int a=20;
	 void show() 
	 {
		 System.out.println(a);
		 System.out.println(super.a);
	 }
 }
 */
 class R
 {
	 void show()
	 {
		 System.out.println("Hello learner");
	 }
	 
 }
 
 class S extends R
 {
	 void show()
	 {
		 super.show();
		 System.out.println("Hello coder");
	 }
	
 }
 
public class Super_KeyWord {
	public static void main(String[] args) {
		S r = new S();
		r.show();
	}

}
