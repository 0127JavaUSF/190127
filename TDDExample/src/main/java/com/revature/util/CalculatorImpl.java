package com.revature.util;
public class CalculatorImpl <T extends Number> implements Calculator<T> {
//double, floats, integers, long, short
	@Override
	public T add(T a, T b) {
		// TODO Auto-generated method stub
		Number result = a.doubleValue() + b.doubleValue();
		if (a instanceof Double) {
			result = a.doubleValue() + b.doubleValue();
			return (T) result;
		}
		else if(a instanceof Float) {
			result = a.floatValue() + b.floatValue();
			return(T) result;
		}
		else if(a instanceof Integer) {
			result = Math.floor(result.doubleValue());
			result = result.intValue();
			return (T) result;
		}
		else if(a instanceof Long) {
			result = Math.floor(result.longValue());
			result = result.longValue();
			return (T) result;
		}
		else if(a instanceof Short) {
			result = result.shortValue();
			return (T) result;
		}
		else{
			return (T) result;
		}
	}
	@Override
	public T sub(T a, T b) {
		// TODO Auto-generated method stub
		Number result = a.doubleValue() - b.doubleValue();
		if (a instanceof Double) {
			result = a.doubleValue() - b.doubleValue();
			return (T) result;
		}
		else if(a instanceof Float) {
			result = a.floatValue() - b.floatValue();
			return(T) result;
		}
		else if(a instanceof Integer) {
			result = a.intValue() - b.intValue();
			return(T) result;
		}
		else if(a instanceof Long) {
			result = result.longValue();
			return (T) result;
		}
		else if(a instanceof Short) {
			result = result.shortValue();
			return (T) result;
		}
		return null;
	}
	@Override
	public T mult(T a, T b) {
		Number result = a.doubleValue() - b.doubleValue();
		if (a instanceof Double) {
			result = a.doubleValue() * b.doubleValue();
			return (T) result;
		}
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public T div(T a, T b) {
		// TODO Auto-generated method stub
		return null;
	}
//	@Override
//	public T sqrt(T a, T b) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	@Override
	public T pow(T a, T b) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public T sqrt(T a) {
		// TODO Auto-generated method stub
		return null;
	}
}