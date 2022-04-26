package org.imparnt;

public class DecendingOrder {
	
	public static void main(String[] args) {
		
		int a[]={0,4,7,9,8,20,-3,-7};
		
		for (int i =a.length-1; i >= 0; i--) {
			
			for (int j = i-1; j >= 0; j--) {
				
				int c=0;
				if(a[i]<a[j]) {
					
					c=a[i];
					a[i]=a[j];
					a[j]=c;
					
				}
				
			}
			System.out.println(a[i]);
			
		}
		
	}

}
