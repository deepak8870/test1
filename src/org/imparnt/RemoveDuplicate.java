package org.imparnt;

import java.util.Arrays;

public class RemoveDuplicate {
	
	
	public static void main(String[] args) {
		
		
		int a[]= {1,7,6,1,7,10,1,7,78};		
		
		int b[] = new int[100];
       
        for(int i=0;i<a.length;i++){
        	
        	
        b[a[i]]++;
        
       
        
        if(b[a[i]]==1){
        	
        	System.out.println(a[i]);
            
        }
    } 
		
       
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		 k = a.length;
//		
//		for (int i = 0; i < a.length; i++) {
//			
//			
//			for (int j = i+1; j < a.length; j++) {
//				
//				
//				if (a[i]==a[j]) {
//					
//					a[j]=a[k-1];
//					
//					k--;
//					j--;
//				}
//			}
//			
//		}
//		
//		int b[]= Arrays.copyOf(a, k);
//		
//		for (int i = 0; i < b.length; i++) {
//			System.out.println(b[i]);
//		}
		
		}
		
	}


