package org.imparnt;

public class This {
	
	  int a =10;
	
	static int b= 5;
	
	private void add() {
		System.out.println(a);
		
		this.a=5;
		
		int c=a+b;
		System.out.println(c);
		this.a=20;
		System.out.println(a);
		

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
