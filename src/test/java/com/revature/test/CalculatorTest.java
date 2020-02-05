package com.revature.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.util.Calculator;
import com.revature.util.CalculatorImpl;

public class CalculatorTest {
	
	//This is creating the Generic. 
	private Calculator<Integer> intCalc;//You have to make an object to work with.
	private Calculator<Double> doubleCalc;//you have to make an object to work with.

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		intCalc = new CalculatorImpl<Integer>();		//instantiate the object.
		doubleCalc = new CalculatorImpl<Double>();		//instantiate the object.
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void addPositiveIntegersTest() {
		//Arrange
		Integer a = 4;
		Integer b = 5;
		
		//Act
		Integer c = intCalc.add(a,b);
		
		//Assert
		//assertEquals(9, 9);
		assertEquals("4 + 5 should equal 9", 9, c.intValue());
	}
	
	@Test
	public void addPositiveDoublesTest() {
		//Arrange
		Double a = 4.1;
		Double b = 5.1;
		
		//Act
		Double c = doubleCalc.add(a,b);
		
		//Assert
		//assertEquals(, 9.2, c.doubleValue());
		assertEquals("4.1 + 5.1 should equal 9.2", 9.2, c.doubleValue(), .1);
	}
	
	@Test
	public void subPositiveIntegersTest() {
		//Arrange
		Integer a = 5;
		Integer b = 4;
		
		//Act
		Integer c = intCalc.sub(a,b);
		
		//Assert
		assertEquals("5-4 should equal 1", 1, c.intValue());
	}
	
	@Test
	public void subPositiveDoublesTest() {
		//Arrange
		Double a = 5.5;
		Double b = 4.3;
		
		//Act
		Double c = doubleCalc.sub(a,b);
		//System.out.println(c.doubleValue());
		//Assert
		assertEquals("5.5-4.3 should equal 1.2", 1.2, c.doubleValue(),.0001);
	}
	
	@Test
	public void multPositiveIntegersTest() {
		//Arrange
		Integer a = 5;
		Integer b = 4;
		
		//Act
		Integer c = intCalc.mult(a,b);
		
		//Assert
		assertEquals("5*4 should equal 20", 20, c.intValue());
	}
	
	@Test
	public void multPositiveDoublesTest() {
		//Arrange
		Double a = 5.1;
		Double b = 4.2;
		
		//Act
		Double c = doubleCalc.mult(a,b);
		
		//Assert
		assertEquals("5.1*4.2 should equal 21", 21.42, c.doubleValue(), .0001);
	}
	
	@Test
	public void divPositiveIntegersTest() {
		//Arrange
		Integer a = 20;
		Integer b = 4;
		
		//Act
		Integer c = intCalc.div(a,b);
		
		//Assert
		assertEquals("20/4 should equal 5", 5, c.intValue());
	}

	@Test
	public void divPositiveDoublesTest() {
		//Arrange
		Double a = 25.5;
		Double b = 5.1;
		
		//Act
		Double c = doubleCalc.div(a,b);
		
		//Assert
		assertEquals("25.5/5.1 should equal 5", 5, c.doubleValue(), .0001);
	}

	@Test
	public void sqrtPositiveIntegersTest() {
		//Arrange
		Integer a = 100;
		//Integer b =10;
		
		//Act
		Integer c = intCalc.sqrt(a);
		
		//Assert
		assertEquals("The square root of 100 should equal 10", 10, c.intValue());
	}

	@Test
	public void sqrtPositiveDoublesTest() {
		//Arrange
		Double a = 25.5;
		Double b = 5.1;
		
		//Act
		Double c = doubleCalc.div(a,b);
		
		//Assert
		assertEquals("25.5/5.1 should equal 5", 5, c.doubleValue(), .0001);
	}
}
