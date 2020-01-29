package com.example.pojo;

public class WritingImplement {

	private int size;

	private String shape;

	private String medium;

	private boolean erasable;

	public boolean isErasable() {
		return this.erasable;
	}

	public void setErasable(boolean erasable) {
		this.erasable = erasable;
	}

	public int getSize() {
		return this.size;
	}

	public void setSize(int size) {
		if (size > 0) {
			this.size = size;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public String getShape() {
		return this.shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getMedium() {
		return this.medium;
	}

	public void setMedium(String medium) {
		this.medium = medium;
	}

	public void write() {
		// String medium = "paper";
		System.out.println("Writing on " + this.medium);
	}

	@Override
	public String toString() {

		return "WritingImplement: Size = " + this.size + " shape = " + this.shape + " medium = " + this.medium;

	}

<<<<<<< HEAD
//	public WritingImplement(int size, String shape, String medium) {
//		// first line always super() or this()
//		// by default it is super()
//		super();
//		System.out.println("Three args constructor of WritingImplement");
//		this.size = size;S
//		this.shape = shape;
//		this.medium = medium;
//
//	}
//
//	public WritingImplement() {
//		//System.out.println("no-arg constructor of WritingImplement");
//		this(0, "normal", "paper");
//		System.out.println("no-arg constructor of WritingImplement");
//	}
=======
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
		// System.out.println("no-arg constructor of WritingImplement");
		this(0, "normal", "paper");
		System.out.println("no-arg constructor of WritingImplement");
	}
>>>>>>> 6c24e4c8590bb552ca1eb05fe0caee8c7616201e

}
