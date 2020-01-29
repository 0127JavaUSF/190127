package com.revature.daythree;

import java.util.ArrayList;

public class GarbageCollectionExample {

	public static void main(String[] args) {
		/*
		 * if System.gc() doesn't return anything, how are we incrementing 
		 * whether or not it triggered the garbage collection, or if garbage collection 
		 * occured automatically???
		 * 
		 */
		// TODO Auto-generated method stub

		for (int i=0; i<100; i++) {
			new MonsterEnergy(i);
			System.out.println("Object was created");
			
			System.gc();
			System.out.println("ANCHOR: did deletion happen just before this?");
		}


	}//notice the inconsistency in when object is actually removed from the heap via garbage collection
	
}

