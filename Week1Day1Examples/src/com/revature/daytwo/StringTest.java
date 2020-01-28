package com.revature.daytwo;

public class StringTest {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numbers = "123456";
		
		/* test of method indexOf */
		System.out.println("String numbers = \"123456\";");
		System.out.println("/* test of method indexOf */");
		System.out.println("First time we find 456 after index 0: "+numbers.indexOf("456", 0));
		System.out.println("First time we find 456 after index 6: "+numbers.indexOf("456", 6));
		System.out.println("-------------------");
		
		/* Test of method intern */
		System.out.println("String numbers = \"123456\";");
		System.out.println("String numbers2 = \"123456\";");
		System.out.println("/* Test of method intern */");
		String numbers2 = "123456";
		System.out.println("Are the two strings located in the same memory area ?: "+(numbers.intern().equals(numbers2.intern())));
		System.out.println("-------------------");
		
		/* Test of method isEmpty  */
		System.out.println("Reference String is \"\"");
		System.out.println("/* Test of method isEmpty  */");
		System.out.println("Is this String empty? :"+"".isEmpty());
		System.out.println("-------------------");
		
		/*Test of method join */
		System.out.println("Joining  \"Word1\", \"Word2\",\"Word3\" with *");
		System.out.println("/*Test of method join */");
		System.out.println("Words joined with stars: "+String.join("*", "Word1", "Word2","Word3"));
		

	}

}
