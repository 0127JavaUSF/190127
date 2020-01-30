package com.example.pojo;

public class Cards 
{
	public static void main(String[] args)
	{
		for (int i = 0; i <= 20; i++)
		{
			new Cards();
			System.out.println(i);
			System.gc();
		}
	}

	public void finalize() throws Throwable 
	{
		super.finalize();
		System.out.println("garbage collected");
	}
	
}

