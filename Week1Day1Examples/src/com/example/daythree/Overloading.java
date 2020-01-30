package com.example.daythree;

public class Overloading {

	public static void main(String[] args) {

		//System.out.println(add(5, 12));
		
		//System.out.println(add(1, 5, 34, 84, 9872));
		
		//System.out.println(add(3, "number?", 4, 5, 2, 4, 6, 3, 4334, 64, 234, 6543, 234, 65432, 65243, 32452, 652354, 2345, 42354, 6532));
		
		//Wrapper Classes - Class used to wrap primative values
		//Double, Short, Float, Long, Integer, Char, Boolean, Byte
		Integer integer = new Integer(7);
		Integer integer2 = new Integer(8);
		Double doubl = new Double(5.0);
		Double doubl2 = new Double(4.5);
		//auto-unboxing: take a wrapper class and turn it into a primative type automatically
		System.out.println(add(integer, 4));
		System.out.println(add(4, doubl2));
		//auto-boxing: take a primative and wrap it into the wrapper class automatically when Java expects a Class
		//takeInteger(5);
	}
	
	public static int takeInteger(Integer i) {
		return i;
	}
	
	public static double add(double d, double d2) {
		System.out.println("prints primitiave arg double");
		return d + d2;
	}
	
	public static double add(Double d, Double d2) {
		System.out.println("prints wrapper arg double");
		return d + d2;
	}
	
	public static int add(Integer x, Integer y) {
		System.out.println("prints wrapper arg int");
		return x + y;
	}
	
	
	public static int add(int x, int y) {
		System.out.println("prints primitave arg int");
		return x + y;
	}
	
	public static int add(int ... s) {
		int result = 0;
		for (int i: s) {
			result += i;
		}
		System.out.println("prints var arg");
		return result;
	}
	
	public static int add(int x, int y, int z, int a, int b) {
		return x + y + z + a + b;
	}
	//-----------------------------------------VVVV varargs
	public static int add(int a, String b, int ... x) {
		for (int i: x) {
			a += i;
		}
		return a;
	}

}
