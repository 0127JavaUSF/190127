package com.revature.daytwo;

/*
 * We have 4 scopes in java 
 * Static (class) - belongs to the class
 * Instance - belongs to the object
 * Method w/ or w.out/(parameter) - belongs inside the method
 * Local (loop, block) - inside '{}' it is declared
 */

public class Scopes {
	
	static int staticScope;
	
	int instanceScope;
	
	public void doStuff(int paramScope) {
		int methodScope = 0;
		boolean check = false;
		
		while(check) {
			int localScope = 0;
			for(int i = 0; i < 5 ; i++) {
				i++;
				localScope++;
				methodScope++;
				paramScope++;
				instanceScope++;
				staticScope++;
			}
			//i++; Cannot access i from outside for loop block
			localScope++;
			methodScope++;
			paramScope++;
			instanceScope++;
			staticScope++;
		}
		//i++; Cannot access i from outside for loop block
		//localScope++; Cannot access i from outside while loop block
		methodScope++;
		paramScope++;
		instanceScope++;
		staticScope++;
	}
	
	public void anotherMethod() {
	//i++; Cannot access i from outside for loop block
	//localScope++; Cannot access localScope from outside while loop block
	//methodScope++; Cannot access methodScope from outside its method
	//paramScope++; Cannot access paramScope from outside its method
	instanceScope++;
	staticScope++;
	}
	
	public static void staticMethod() {
		//i++; Cannot access i from outside for loop block
		//localScope++; Cannot access localScope from outside while loop block
		//methodScope++; Cannot access methodScope from outside its method
		//paramScope++; Cannot access paramScope from outside its method
		//instanceScope++; Cannot access instanceScope from within static scope
		staticScope++;
	}
	
	{
		//initializtion block
		instanceScope++;
		staticScope++;
		
	}
	
	static {
		//static block
		//instanceScope++; Cannot access instanceScope from within static scope
		staticScope++;
	}
}

