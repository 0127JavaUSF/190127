package com.revature;

import java.lang.reflect.Field;

public class Driver {

	public static void main(String[] args) {
		
		String var = "Foo";
		
		System.out.println("Initial contents: " + var);
		
		Class<String> string = String.class;
		
		try {
			Field field = string.getDeclaredField("value");
			field.setAccessible(true);
			field.set(var, "Something Different".toCharArray());
			System.out.println("New Contents: " + var);
			System.out.println("Foo");
			System.out.println(new String("Foo"));
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
