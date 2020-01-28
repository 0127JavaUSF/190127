package com.revature.daytwo;

import java.util.LinkedList;
import java.util.List;

public class StringExercise {

	public StringExercise()
	{
		/*
		static String 	join(CharSequence delimiter, CharSequence... elements)
		Returns a new String composed of copies of the CharSequence elements joined together with a copy of the specified delimiter.
		*/
		
		//list of strings
		List<String> strings = new LinkedList<>();
	     strings.add("Revature");strings.add("is");
	     strings.add("cool");
		
	     //join the list using delimiter "-" into a single string
	     //throws NullPointerException
		String s = String.join("-", strings);
		
		//print string
		System.out.println(s);
		
		//get the last index of the character 'e' in the string
		//case sensitive
		//returns -1 if not found
		//throws NULLPointerException if null is passed
		System.out.println( s.lastIndexOf('e') );

		try
		{
			System.out.println( s.lastIndexOf( null ) );
		}
		catch(NullPointerException e) {
			
			e.printStackTrace();
		}
		
		//Returns the index within this string of the last occurrence of the specified character, searching backward starting at the specified index.
		//if not found, returns -1
		//case sensitive
		int fromIndex = s.lastIndexOf('e', 6);
		
		//print the index
		System.out.println(fromIndex);
		
		//Returns the index within this string of the last occurrence of the specified substring.
		//The last occurrence of the empty string "" is considered to occur at the index value this.length().
		//it is case sensitive
		//returns -1 if not found
		System.out.println( s.lastIndexOf("is") );

		//not found
		System.out.println( s.lastIndexOf("Is") ); //returns -1
}
	
	public static void main(String[] args) {
		
		StringExercise ex = new StringExercise();
	}
}
