package com.example.pojo;

public class GelPen extends Pen{
	
	@Override
	public String write(String message) {
		return "I am writing the message " + message + " but it looks really fancy."; 
	}
	
	public GelPen() {
		super();
	}
	
	public GelPen(String name) {
		super(name);
	}
	
}
