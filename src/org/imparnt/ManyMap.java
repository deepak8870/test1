package org.imparnt;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ManyMap {
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,6,2,3,1,6};
		int c=0;
		int count=0;
		Map<Integer,Integer> mi = new LinkedHashMap<Integer,Integer>();
		for (int i = 0; i < a.length; i++) {
					mi.put(a[i],1);
					
					
				}
			
		int count1 =a.length-mi.size();
		
		
		
		System.out.println(count1);
		
		
	}
	
	

}
