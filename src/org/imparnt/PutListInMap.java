package org.imparnt;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PutListInMap {
	
	
	public static void main(String[] args) {
		
		
		List<Integer> li = new ArrayList<>();
		li.add(12);
		li.add(122);
		li.add(123);
		li.add(124);
		li.add(78);
		
		
		Map<List<Integer>, String>mi = new LinkedHashMap<>();
		
		mi.put(li, "rrr");
		
		System.out.println(mi);
		
		
	}

}
