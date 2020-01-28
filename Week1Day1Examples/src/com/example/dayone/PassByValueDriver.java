package com.example.dayone;

import com.example.pojo.Person;

public class PassByValueDriver {

	public static void main(String[] args) {

		int a = 7, b = 12, c = 0;
		
		System.out.println("initial value: " + c);
		add(a, b, c);
		System.out.println("final value: " + c);
		
		Person myPerson = new Person();
		myPerson.name = "Nick";
		System.out.println("Initial name: " + myPerson.name);
		changeName(myPerson);
		System.out.println("Final name: " + myPerson.name);
	}
	
	public static void add(int x, int y, int result) {
		result = x + y;
		System.out.println("Inside add");
	}
	
	public static void changeName(Person p) {
		p.name = "Mark";
	}

}
