package com.revature.daytwo;

import java.util.IllegalFormatException;

//developed by Kirsaly and Torell

public class StringPractice{
	
	public static void main (String[] args){
		// create two String objects
		String string1 = new String("Hello World.");
		String string2 = new String("hello world.");

		
		//perform String comparison tests
		System.out.println(string1.equals(string2));
		System.out.println(string1.equalsIgnoreCase(string2));
		
		
		
		
		//Does not throw an error
		try {
			String string3 = String.format("%x", 124); // Hexidecimal value
			System.out.println(string3);
		}
		catch (IllegalFormatException exc) {
			exc.printStackTrace();
		}
		
		//Throws an error
		try {
			String string3 = String.format("%x", "string"); // Hexidecimal value
			System.out.println(string3);
		}
		catch (IllegalFormatException exc) {
			exc.printStackTrace();
		}
	}
}