package com.example.exception;

public class MyCustomException extends Exception {

	public MyCustomException() {
		super();
	}
	
	public MyCustomException(String msg) {
		super(msg);
	}
	
}
