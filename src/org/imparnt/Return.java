package org.imparnt;

public class Return {

	private int m1(int empid) {
		int res=0;
		if (empid==10) {
			
			res=100;
		}
		
		if (empid==20) {
			
			res=200;
			
		}
		if (empid==30) {
			res=499;
			
			
		}
		return res;

	}
		
		public static void main(String[] args) {
			
			
			Return a = new Return();
			int m1 = a.m1(310);
			
			System.out.println(m1);
		}
	
	
	
}
