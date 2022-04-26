package org.imparnt;

public class StringReverse {

	public static void main(String[] args) {
		
		// using String builder:
		
	
		
//		String s1 = "guru";
//		
//		StringBuilder s2 = new StringBuilder();
//		s2.append(s1);
//		
//		s2 = s2.reverse();
//		System.out.println(s2);
		
		// without string builder:
		
		String s1 = "arun";
		
		char[] charArray = s1.toCharArray();// convert string to charArray:
		
		
		for (int i = charArray.length-1; i>=0; i--) {
			
			System.out.println(charArray[i]);
		}
		
		//using spilt method:
		
		
		String s2 = "Welcome to java";
		String[] split = s2.split(" ");
		
		for (int i = split.length-1; i >=0; i--) {
			
		
			
			System.out.println(split[i]);
		}
	}
	
	
}
