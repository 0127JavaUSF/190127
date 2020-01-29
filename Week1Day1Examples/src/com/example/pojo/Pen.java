package com.example.pojo;

public class Pen extends WritingImplement{
	
	private String name;
	
	private String brand;
	
	private String color;
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return this.brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String write(String message) {
		return "Writting message " + message + " with a " + brand + " pen in " + color + " ink";
	}
	
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
