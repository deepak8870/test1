package org.imparnt;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringToMap {
	
	public static void main(String[] args) {
		
	
	String str ="welcome to the java";
	
	Map< Integer,Character> mi = new LinkedHashMap<>();
	Map< Integer,Character> m = new LinkedHashMap<>();
	
	for (int i = 0; i < str.length(); i++) {
		
		char at = str.charAt(i);
		
		if (at=='a'||at=='e'||at=='i'||at=='o'||at=='u') {
			
			mi.put(i,at );
			
		}
		else {
			m.put(i,at);
		}
		
		
	}
	
System.out.println(mi);	
	
System.out.println(m);
	
	
	
}
}