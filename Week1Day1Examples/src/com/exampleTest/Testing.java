package com.exampleTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.example.daythree.Overloading;
//import junit.framework.Assert;

class Testing {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test1() {
		//fail("Not yet implemented");
	}
	
	@Test
	void testTakeInteger2() {
		//Arrange
		Integer a = 4;
		
		//act
		Integer bInteger =com.example.daythree.Overloading.takeInteger(a);
		
		//assert
		assertEquals(4, bInteger.intValue());
	}

	@Test
	void testAddWithDoubles3() {
		//Arrange
		double a = 2020;
		double b = 2021;
		
		//Act
		double actual = Overloading.add(a, b);
		
		//Assert
		assertEquals(2020+2021, actual);
	}
	
	@Test
	void testAddWithInts4() {
		//Arrange
		int a = 2019;
		int b = 2021;
		
		//Act
		int actual = Overloading.add(a, b);
		
		//Assert
		assertEquals(a+b, actual);
	}
	
	@Test
	void testAddWithDoubles() {
		//Arrange
		Double aDouble = 25.2;
		Double bDouble = 26.1;
		
		//Act
		double actual = Overloading.add(aDouble, bDouble);
		
		//Assert
		assertEquals(aDouble+bDouble, actual);
	}
	
	@Test
	void test6() {
		//Arrange
		
		
		//Act
		
		
		//Assert
		
	}
	
}
