package com.example.daythree;

public class ExceptionExample {

	public static void main(String[] args) { //throws Exception {
		
		//throw new Exception();
		/*
		 * try { throwsException(); } catch(Exception e) { e.printStackTrace(); }
		 * finally { System.out.println("This always runs!"); }
		 */

		
		try {
			mayThrow();
			System.out.println("Did not throw anything");
		} catch(Exception e) {
			System.out.println("Caught " + e.getMessage());
		}
		
		System.out.println("ok");
	}
	
	private static void throwsException() throws Exception{
		throw new Exception();
	}
	
	private static String mayThrow() throws Exception {
		if (Math.random() > .5) {
			throw new Exception();
		}
		return "Did not fail";
	}
}
