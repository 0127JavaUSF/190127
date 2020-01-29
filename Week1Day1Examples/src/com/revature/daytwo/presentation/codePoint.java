package com.revature.daytwo.presentation;



public class codePoint {


	
public static void main (String[] args) {
	
	
	String str = "Amik & Timeo"; // Declare and initialize the string str with our names.
	System.out.println("String = " + str); // printing out a concatenation of a string with another string.
	
	int returnVal = str.codePointAt(8); // Declare new int variable and initialize with the (unicode code point) equivalent of the character at selected index.
	System.out.println("Character at the selected index is: " + returnVal); // printing string concatenated with a unicode value.
	
	returnVal = str.codePointBefore(8); // replace int variable with new (unicode code point) value. This time the unicode value
	// belongs to the character that is in the index before the selected index.
	System.out.println("Character before the selected index is: " + returnVal); 
	
	returnVal = str.codePointCount(6, 10); // replace int variable with the amount of (unicode code points) present between 
	// the two selected indices. 
	System.out.println("Character points between the two selected indices: " + returnVal);
	
	String str2 = "Timeo & Amik"; // Declare and initialize new string used for comparing with original.
	returnVal = str.compareTo(str2); // compare the string in our first String variable to the string in our new String varaible.
	// The difference between the ascii value are returned in the form of positive or negative integers 
	//(representing how far from eachother on the ascii table they are).
	// A in the ascii table is 19 indices before the T in the same table. 
	System.out.println("The difference between the two strings lexigraphically are: "+ returnVal);
	
	
	
	
}
}
