package com.revature.daytwo;

import java.io.UnsupportedEncodingException;

public class joshuaVenturaEsu {

		public static void main(String[] args) {
			String str1 = new String("Vacation"); //creates str1 object
			String str2 = new String("piano"); //creates str2 object
			
				System.out.println(str1.getBytes());//str1's bytes are being printed to the console

				System.out.println(str2.getBytes());//str2's bytes are being printed to the console

			
			
			try {
				System.out.println(str1.getBytes("UTF-8"));// Encodes str1 into bytes using charset UTF-8 and prints str1 UTF-8 bytes to the console
			} catch (UnsupportedEncodingException e) {// checks for UnsupportedEncoding within the getBytes(" here ");
				e.printStackTrace();
			}

			try {
				System.out.println(str1.getBytes("Test"));// tries to encode str1 into bytes using charset UTF-8 and prints str1 UTF-8 bytes to the console
			} catch (UnsupportedEncodingException e) {// checks for UnsupportedEncoding within the getBytes(" here "); 
				e.printStackTrace();// because the getBytes("test") is not a charset it throws the UnsupportedEncodingException
			}
			
		}
	}

