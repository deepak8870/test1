package org.imparnt;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ArrayToMap {
	
	public static void main(String[] args) {
		
		String str="welcome to the java";
		
		LinkedHashMap<Character, Integer> mi = new LinkedHashMap<>();
	
		mi.put('a', 0);
		mi.put('e', 0);
		mi.put('i', 0);
		mi.put('o', 0);
		mi.put('u', 0);
		
		for (int i = 0; i <= str.length()-1; i++) {
			 
		char at = str.charAt(i);
		
		if (mi.containsKey(at)) {
			
			Integer co = mi.get(at);
			
			mi.put(at, ++co);
			
		}
			
			}
			
			System.out.println(mi);
		
		
		
		
			
		
		
		
	}

}
