package org.imparnt;

public class This {
	
	  int a =10;
	
	static int b= 5;
	
	private void add() {
		System.out.println(a);
		this.a=6;
		
		
		
		this.a=7;
//<<<<<<< HEAD
//		
//=======
//		
//>>>>>>> 72b2ce2492ac4b87199ada5c4fc4aa84a5c298f4
//		
		int c=a+b;
		System.out.println(c);
		this.a=20;
		System.out.println(a);
		

	}
	private void m1() {
		System.out.println("hii");

	}
	
private void sub() {
	
	
	int c= a+b;
	
	System.out.println(c);
}
	
	
	public static void main(String[] args) {
		This t = new This();
		t.add();
		t.sub();
		
		
		
	}

}
