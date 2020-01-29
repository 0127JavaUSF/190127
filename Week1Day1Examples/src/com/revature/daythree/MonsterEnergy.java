package com.revature.daythree;

public class MonsterEnergy {
	double fluidoz = 15.5;
	String name;
	int id;
	
	
	public MonsterEnergy() {
		this.name = "Generic Monster Energy";
		this.id = 999;
	}
	
	public MonsterEnergy(int id) {
		this.id = id;
	}
	
	@Override
	public void finalize() {
		System.out.println("id of deleted object: " + this.id);
		
	}

}
