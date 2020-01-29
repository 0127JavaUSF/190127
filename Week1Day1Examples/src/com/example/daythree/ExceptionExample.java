package com.example.daythree;

import com.example.exception.MyCustomException;

public class ExceptionExample {

	public static void main(String[] args) {// throws Exception, IOException {

		// throw new Exception();

		/*
		 * try { throwsException(); System.out.println("Past"); } catch(Exception e) {
		 * e.printStackTrace(); } catch(IOException e) { e.printStackTrace(); }
		 * 
		 * finally { System.out.println("This always runs"); }
		 */

		try {
			mayThrow();
			System.out.println("Did not throw anything");
		} catch (MyCustomException e) {
			System.out.println("Caught Custom Exception " + e.getMessage());
		}catch (Exception e) {
			System.out.println("Caught " + e.getMessage());
		} finally {
			System.out.println("This will always run for the second try/catch");
		}
		
		try {
			throw new RuntimeException();
		} finally {
			System.out.println("this happens");
		}

		//System.out.println("ok");

	}

	private static void throwsException() throws Exception {
		throw new Exception();
	}

	private static String mayThrow() throws Exception {

		if (Math.random() > .5) {
			throw new MyCustomException("Too large of a random number");
		}
		return "Did not fail";

	}

}
