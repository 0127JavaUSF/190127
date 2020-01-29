package com.revature.daytwo;

public class StringTest {
	
	
	public static void main (String [] args) {
		
		String str1 = new String ("This is string number 1 "); //initiate string number 1
		String str2 = new String ("This is string number 2 "); //initiate string number 2
		
		System.out.println(str1.compareToIgnoreCase(str2)); // compare two strings for differences.
		
		System.out.println(str1.concat(str2));  // adding two strings together
		
		System.out.println(str1.contains("b")); // returns true if the str1 contains the character passed
		
		System.out.println(str1.contentEquals(str2));// returns false if any chars don't match
	}
	
}