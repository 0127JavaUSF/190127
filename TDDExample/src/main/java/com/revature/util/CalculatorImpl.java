package com.revature.util;

public class CalculatorImpl <T extends Number> implements Calculator<T> {

	@Override
	public T add(T a, T b) {
		
		Number result = a.doubleValue() + b.doubleValue();
		
		if (a instanceof Double) {
			return (T) result;
		}
		
		result = Math.floor(result.doubleValue());
		
		result = result.intValue();
		
		return (T)  result;
	}

	@Override
	public T sub(T a, T b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T mult(T a, T b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T div(T a, T b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T sqrt(T a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T pow(T a, T b) {
		// TODO Auto-generated method stub
		return null;
	}

}
