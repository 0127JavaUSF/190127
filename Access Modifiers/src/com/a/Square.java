package com.a;

import com.c.Triangle;

/*
 * Public - 	Can be seen anywhere
 * Protected - 	Can be seen by anything in the class, package, or through child classes subclasses, no where else 
 * Default - 	Can be seen anywhere in the package, no where else
 * Private - 	can be seen anywhere in the class, no where else
 */

public class Square {

	public static int a;
	protected static int b;
	static int c; 
	private static int d;
	
	//package a
	static com.a.Square squareA = new com.a.Square();
	static com.a.Circle cirA = new com.a.Circle();
	static com.a.Star starA = new com.a.Star();
	//package b
	static com.b.Circle cirB = new com.b.Circle();
	//package c
	static com.c.Star starC = new com.c.Star();
	static Triangle traingleC = new Triangle();
	//package d
	static com.d.Star starD = new com.d.Star();
	
	public void SquareA() {
		System.out.println(squareA.a);// public
		System.out.println(squareA.b);// protected
		System.out.println(squareA.c);// default
		System.out.println(squareA.d);// private 
	}
	public void CircleA() {
		System.out.println(cirA.a);// public
		System.out.println(cirA.b);// protected
		System.out.println(cirA.c);// default
		System.out.println(cirA.d);// private breaks because Class package a Circle variable 'd' has a private access modifier.
	}
	public void StarA() {
		System.out.println(starA.a);// public
		System.out.println(starA.b);// protected
		System.out.println(starA.c);// default 
		System.out.println(starA.d);// private breaks because package a Class Star variable 'd' has a private access modifier.
	}
	public void CircleB() {
		System.out.println(cirB.a);// public
		System.out.println(cirB.b);// protected breaks because package b Class Circle variable 'b' is not a subclass
		System.out.println(cirB.c);// default breaks because package b Class Circle variable 'c' is not in the same package
		System.out.println(cirB.d);// private breaks because package b Class Circle variable 'd' has a private access modifier.
	}
	public void StarC() {// can't be seen at all because Class Star in package c has a default access modifier.
		
		System.out.println(starC.a);// public breaks because the Class Star in package c itself has an access modifier of default
		System.out.println(starC.b);// protected breaks because package c Class Star variable 'b' is not a subclass
		System.out.println(starC.c);// default breaks because package c Class Star variable 'c' is not in the same package
		System.out.println(starC.d);// private breaks because package c Class Star variable 'd' has a private access modifier.
	}
	
	
	  public void TriangleC() { 
		  System.out.println(traingleC.a);// public
		  System.out.println(traingleC.b);// protected breaks because package c Class Triangle variable 'b' is not a subclass 
		  System.out.println(traingleC.c);// default breaks because package c Class Triangle variable 'c' is not in the same package 
		  System.out.println(traingleC.d);// private breaks because package c Class Triangle variable 'd' has a private access modifier. 
	  }
	
	
	public void StarD() {
		System.out.println(starD.a);// public
		System.out.println(starD.b);// protected breaks because package d Class Star variable 'b' is not a subclass
		System.out.println(starD.c);// default breaks because package d Class Star variable 'c' is not in the same package
		System.out.println(starD.d);// private breaks because package d Class Star variable 'd' has a private access modifier.
	}
	
	


}
