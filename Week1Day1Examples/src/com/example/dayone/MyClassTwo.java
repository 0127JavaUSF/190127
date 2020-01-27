package com.example.dayone;

/*
 * Naming Conventions
 * 
 * Class - TitleCase, named after nouns
 * Packages - lowercase
 * Interfaces - TitleCase, named after adjectives
 * Variables  - camelCase
 * Method - camelCase, typically named after verbs
 * 
 * (Note: Java is case sensitive!)
 */

public class MyClassTwo {
	
	public static void main(String[] args) {
		/*
		 * public - access modifier, there is no restriction
		 * of access
		 * static - this entity belongs to the class,
		 * one copy per class
		 * static when applied to methods:
		 *  - you do not have to instantiate or create
		 *  an object to call on this method
		 * void - is a return type that returns nothing 
		 * main - method name
		 * String[] args - array of strings that are 
		 * able to be passed into the method
		 */
		//main method
		//it is the entry point of your program
		//this is the method from which the JVM
		//can run your program
		/*
		 * multi - line comment
		 */
		//System.out.println("What's up, peoples");
		
		//instantiate/create an object of type Snowman
		Snowman ralphTheSnowman = new Snowman();
		System.out.println("Snowman's name is " + ralphTheSnowman.name);
		System.out.println(ralphTheSnowman.name + 
				" has " + ralphTheSnowman.arms + " arms.");
		
		
	}

}
