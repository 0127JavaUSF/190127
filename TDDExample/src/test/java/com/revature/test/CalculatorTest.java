package com.revature.test;

//import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.util.Calculator;
import com.revature.util.CalculatorImpl;

public class CalculatorTest {
	
	private Calculator<Integer> intCalc;
	private Calculator<Double> doubleCalc;

	@BeforeClass // runs once before any tests
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass // runs once after all tests finish
	public static void tearDownAfterClass() throws Exception {
	}

	@Before // runs before each test
	public void setUp() throws Exception {
		intCalc = new CalculatorImpl<Integer>();
		doubleCalc = new CalculatorImpl<Double>();
	}

	@After // runs after each test
	public void tearDown() throws Exception {
	}

	@Test
	public void addPositiveIntegersTest() {
		assertEquals("2 + 3 should equal 5", new Integer(5), intCalc.add(2, 3));
	}
	
	@Test
	public void addPositiveDoublesTest() {
		assertEquals("2.2 + 3.1 should be 5.3", new Double(5.3), doubleCalc.add(2.2,  3.1), 0.001);
	}

}
