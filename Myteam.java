package com.revature.stringManipulation;

public class Myteam {

	public static void main(String[] args) {
				
		// declaring variables for contentEquals to compair.
		String str1 = "Mason Davis";
		String str2 = "Daniel Plummer";
		StringBuffer str3 = new StringBuffer("Daniel Plummer");
		StringBuffer str4 = new StringBuffer("Mason Davis");
		
		//variation 1: String copyValueOf(char[] data)
		
		System.out.println("str1 equal to str3: " + str1.contentEquals(str3));
		System.out.println("str2 equal to str3: " + str2.contentEquals(str3));
		System.out.println("str1 equal to str4: " + str1.contentEquals(str4));
		System.out.println("str1 equal to str4: " + str2.contentEquals(str4));
		
		//copyValueOf allows you to choose from an arrays specified index "3" and copy "4" next values 
		
		char[] data = {'1','2','3','4','5','6','7','8','9','0'};
		String name1 = "num";
		
		System.out.println("this is my test for letter a of str1 " + name1.copyValueOf(data, 3, 4));
		
		
		//copyvalue(char[] data, int offset, int count) checks array for first "offset" "3" and the counts from that index (including current) to "2"
		char[] testArray = {'a','v','1','2','c', 'd', '4', 'l'};
		
		String copyValOutput = String.copyValueOf(testArray, 2, 5);
		System.out.println(copyValOutput);
	}
	
	
	
	
}
