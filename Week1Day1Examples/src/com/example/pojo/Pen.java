package com.example.pojo;

public class Pen extends WritingImplement{
	
	String name;
	
	String brand;
	
	String color;
	
	/*
	 * default constructor
	 * public Pen() {
	 * 	super();
	 * }
	 */
	
	public Pen(String name) {
		super(5, "narrow", "paper");
		System.out.println("Inside 1 arg constructor of Pen");
		this.name = name;
	}

	public Pen() {
		this("no name");
		System.out.println("No-args constructor of Pen");
	}
	
}
