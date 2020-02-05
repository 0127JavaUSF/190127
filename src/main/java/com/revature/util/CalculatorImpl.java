package com.revature.util;

public class CalculatorImpl <T extends Number> implements Calculator<T> {
	
	public T add(T a, T b) {
		if(a instanceof Integer) {
			Number sum = (a.intValue() + b.intValue());
			return (T)sum;
		}
		else if(a instanceof Double) {
			Number sum = (a.doubleValue() + b.doubleValue());
			return (T)sum;
		}else {
			return null;
		}
	}

	public T sub(T a, T b) {
		if(a instanceof Integer) {
			Number difference = (a.intValue() - b.intValue());
			return (T)difference;
		}
		else if(a instanceof Double) {
			Number difference = (a.doubleValue() - b.doubleValue());
			return (T)difference;
		}else {
			return null;
		}
		
	}

	public T mult(T a, T b) {
		if(a instanceof Integer) {
			Number product = (a.intValue() * b.intValue());
			return (T)product;
		}
		else if(a instanceof Double) {
			Number product = (a.doubleValue() * b.doubleValue());
			return (T)product;
		}else {
			return null;
		}
	}

	public T div(T a, T b) {
		if(a instanceof Integer) {
			Number product = (a.intValue() / b.intValue());
			return (T)product;
		}
		else if(a instanceof Double) {
			Number product = (a.doubleValue() / b.doubleValue());
			return (T)product;
		}else {
			return null;
		}
	}

	public T sqrt(T a) {
		Number sqrt = sqrt(a);
		return (T)sqrt;
	}

	public T pow(T a, int b) {
		
		return null;
	}

	public T sqrt(T a, T b) {
		// TODO Auto-generated method stub
		return null;
	}


	 
}
