package com.revature.daytwo;


/*
 * We have 4 Scopes in Java
 * Static (class) - belongs to the class
 * Instance - belongs to the object
 * Method (parameter) - belongs inside the method
 * Local (Loop, Block) - inside '{}' it is declared
 * 
 */
public class ScopesExample {
	
	static int staticScope;
	
	int instanceScope;
	
	public void doStuff(int paramScope) {
		int methodScope = 0;
		boolean check = false;
		while (check) {
			int localScope = 0;
			for (int innerLoop = 0; innerLoop < 5; innerLoop++) {
				//from the innermost scope we can access any other scope
				innerLoop++;
				localScope++;
				methodScope++;
				paramScope++;
				instanceScope++;
				staticScope++;
			}
			//innerLoop++;  cannot access inner block scope from outer block scope
			localScope++;
			methodScope++;
			paramScope++;
			instanceScope++;
			staticScope++;
		}
		
		//innerLoop++;
		//localScope++;  cannot access block scope outside of the block
		methodScope++;
		paramScope++;
		instanceScope++;
		staticScope++;
	}
	
	public void anotherMethod() {
		//innerLoop++;
		//localScope++;
		//methodScope++;
		//paramScope++; cannot access outside of the method or block
		instanceScope++;
		staticScope++;
	}
	
	public static void staticMethod() {
		//instanceScope++;  cannot access the instance members inside static scope
		staticScope++;
	}
	
	{
		//initialization block
		instanceScope++;
		staticScope++;
	}
	static {
		//static block
		//instanceScope++; cannot access inside static scope
		staticScope++;
	}

}
