package com.revature.dayfive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CollectionExample {

	public static void main(String[] args) {
		List<String> nameList = new ArrayList<String>();
		
		nameList.add("Daniel");
		nameList.add("Amik");		
		nameList.add("Charles");		
		nameList.add("Esu");
		nameList.add("Michael");
		
		System.out.println("Where is Amik? : " + nameList.indexOf("Esu"));
		
		Iterator<String> iter = nameList.iterator();

		while(iter.hasNext()) {
			String val = iter.next();
			System.out.println("inside while: " + val);
		}

		Collections.shuffle(nameList);
	
		System.out.println("The winner is " + nameList.get(0));
		
		Map<Integer, String> trainerMap = new HashMap<Integer, String>();
		
		trainerMap.put(2, "Mark");
		trainerMap.put(1, "Alex");
		trainerMap.put(3, "Jacob");
		trainerMap.put(4, "Marielle");
		trainerMap.put(6, "Nick");
		trainerMap.put(5, "Matt");
		
		System.out.println(trainerMap.get(2));
		
		for(int i=0 ; i<=trainerMap.size() ; i++) {
			System.out.println(trainerMap.get(i));
		}
		
		
		
	}
}
