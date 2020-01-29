package com.example.daythree;

public class GCTester {
	
	int id = 0;
	
	GCTester() {
		
	}
	
	GCTester(int id) {
		
		this.id = id;
	}
	
	@Override
	public void finalize()
	{
		System.out.println(id + " deleted");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 0; i < 1000; i++)
		{
			new GCTester(i);
			System.out.println(i + " created");
			System.gc();
		}
	}

}
