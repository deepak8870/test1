package org.imparnt;

public class Revnum {

	
	public static void main(String[] args) {
		
		
		int a=1223797;
		
		int r=0;
		  while (a>0) {
			  
			  int ab= a%10;
			  r= (r*10)+ab;
			  a/=10;
			
		}
		System.out.println(r);
		
		
		System.out.println("*************");
		
		
		
		
	}
	
	
	
	
	
	
	
}
