package com.revature.util;

public class CalculatorImpl <T extends Number>implements Calculator<T> {

	public T add(T a, T b) {
		
		Number result = a.doubleValue() + b.doubleValue();
		
		if (a instanceof Byte) {
			
			result = Math.floor(result.doubleValue());
			result = result.byteValue();
			return (T) result;
		}
		
		if (a instanceof Integer) {
			
			result = Math.floor(result.doubleValue());
			result = result.intValue();
			return (T) result;
		}
		
		if (a instanceof Long) {
			
			result = Math.floor(result.doubleValue());
			result = result.longValue();
			return (T) result;
		}
		
		if (a instanceof Short) {
			
			result = Math.floor(result.doubleValue());
			result = result.shortValue();
			return (T) result;
		}
		
		if (a instanceof Double) {
			return (T) result;
		}	result = Math.floor(result.doubleValue());
			result = result.intValue();
			return (T) result;
	}

	public T sub(T a, T b) {
		
		Number result = a.doubleValue() - b.doubleValue();
		
		if (a instanceof Byte) {
			
			result = Math.floor(result.doubleValue());
			result = result.byteValue();
			return (T) result;
		}
		
		if (a instanceof Integer) {
			
			result = Math.floor(result.doubleValue());
			result = result.intValue();
			return (T) result;
		}
		
		if (a instanceof Long) {
			
			result = Math.floor(result.doubleValue());
			result = result.longValue();
			return (T) result;
		}
		
		if (a instanceof Short) {
			
			result = Math.floor(result.doubleValue());
			result = result.shortValue();
			return (T) result;
		}
		
		if (a instanceof Double) {
			return (T) result;
		}	result = Math.floor(result.doubleValue());
			result = result.intValue();
			return (T) result;
	}

	public T mult(T a, T b) {
		
		Number result = a.doubleValue() * b.doubleValue();
		
		if (a instanceof Byte) {
			
			result = Math.floor(result.doubleValue());
			result = result.byteValue();
			return (T) result;
		}
		
		if (a instanceof Integer) {
			
			result = Math.floor(result.doubleValue());
			result = result.intValue();
			return (T) result;
		}
		
		if (a instanceof Long) {
			
			result = Math.floor(result.doubleValue());
			result = result.longValue();
			return (T) result;
		}
		
		if (a instanceof Short) {
			
			result = Math.floor(result.doubleValue());
			result = result.shortValue();
			return (T) result;
		}
		
		if (a instanceof Double) {
			return (T) result;
		}	result = Math.floor(result.doubleValue());
			result = result.intValue();
			return (T) result;
	}

	public T div(T a, T b) {
		
		Number result = a.doubleValue() / b.doubleValue();
		
		if (a instanceof Byte) {
			
			result = Math.floor(result.doubleValue());
			result = result.byteValue();
			return (T) result;
		}
		
		if (a instanceof Integer) {
			
			result = Math.floor(result.doubleValue());
			result = result.intValue();
			return (T) result;
		}
		
		if (a instanceof Long) {
			
			result = Math.floor(result.doubleValue());
			result = result.longValue();
			return (T) result;
		}
		
		if (a instanceof Short) {
			
			result = Math.floor(result.doubleValue());
			result = result.shortValue();
			return (T) result;
		}
		
		if (a instanceof Double) {
			return (T) result;
		}	result = Math.floor(result.doubleValue());
			result = result.intValue();
			return (T) result;
	}
	
	public T sqrt(T a) {
		
		Number result = a.doubleValue();
		result = Math.sqrt(result.doubleValue());
		
		if (a instanceof Byte) {
			
			result = Math.floor(result.doubleValue());
			result = result.byteValue();
			return (T) result;
		}
		
		if (a instanceof Integer) {
			
			result = Math.floor(result.doubleValue());
			result = result.intValue();
			return (T) result;
		}
		
		if (a instanceof Long) {
			
			result = Math.floor(result.doubleValue());
			result = result.longValue();
			return (T) result;
		}
		
		if (a instanceof Short) {
			
			result = Math.floor(result.doubleValue());
			result = result.shortValue();
			return (T) result;
		}
		
		if (a instanceof Double) {
			return (T) result;
		}	result = Math.floor(result.doubleValue());
			result = result.intValue();
			return (T) result;
	}
	

	public T pow(T a) {
		
		Number result = a.doubleValue();
		result = Math.pow(result.doubleValue(), 7);
		
		if (a instanceof Byte) {
			
			result = Math.floor(result.doubleValue());
			result = result.byteValue();
			return (T) result;
		}
		
		if (a instanceof Integer) {
			
			result = Math.floor(result.doubleValue());
			result = result.intValue();
			return (T) result;
		}
		
		if (a instanceof Long) {
			
			result = Math.floor(result.doubleValue());
			result = result.longValue();
			return (T) result;
		}
		
		if (a instanceof Short) {
			
			result = Math.floor(result.doubleValue());
			result = result.shortValue();
			return (T) result;
		}
		
		if (a instanceof Double) {
			return (T) result;
		}	result = Math.floor(result.doubleValue());
			result = result.intValue();
			return (T) result;
	}
	
	

}
