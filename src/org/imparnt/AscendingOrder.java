package org.imparnt;

public class AscendingOrder {

	public static void main(String[] args) {

		int a []= {2,6,-4,6,-3,0};
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i+1; j < a.length; j++) {
				int c=0;
				
				if (a[i]>a[j]) {
					
					c=a[i];
					a[i]=a[j];
					a[j]=c;
					
					
				}
				
				
			}System.out.println(a[i]);
		}
		
		
		
		
		
		
	}

}
