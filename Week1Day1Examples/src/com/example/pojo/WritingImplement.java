package com.example.pojo;

public class WritingImplement {

	private int size;

	private String shape;

	private String medium;

	public int getSize() {
		return this.size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	
	public void write() {
		// String medium = "paper";
		System.out.println("Writing on " + this.medium);
	}

	@Override
	public String toString() {

		return "WritingImplement: Size = " + this.size + " shape = " + this.shape + " medium = " + this.medium;

	}

	public WritingImplement(int size, String shape, String medium) {
		// first line always super() or this()
		// by default it is super()
		super();
		System.out.println("Three args constructor of WritingImplement");
		this.size = size;
		this.shape = shape;
		this.medium = medium;

	}

	public WritingImplement() {
		//System.out.println("no-arg constructor of WritingImplement");
		this(0, "normal", "paper");
		System.out.println("no-arg constructor of WritingImplement");
	}

}
