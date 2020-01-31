package com.revature.test;



import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.util.Calculator;
import com.revature.util.CalculatorImpl;

public class CalculatorTest {
	
	private Calculator<Byte> byteCalc;
	private Calculator<Double> doubleCalc;
	private Calculator<Float> floatCalc;
	private Calculator<Integer> intCalc;
	private Calculator<Long> longCalc;
	private Calculator<Short> shortCalc;
	
	@BeforeClass// runs once before any tests
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass // runs once after all tests finish
	public static void tearDownAfterClass() throws Exception {
	}

	@Before // runs before each test
	public void setUp() throws Exception {
		
		byteCalc = new CalculatorImpl<Byte>();
		doubleCalc = new CalculatorImpl<Double>();
		floatCalc = new CalculatorImpl<Float>();
		intCalc = new CalculatorImpl<Integer>();
		longCalc = new CalculatorImpl<Long>();
		shortCalc = new CalculatorImpl<Short>();
		
	}

	@After // runs after each test 
	public void tearDown() throws Exception {
	}
	
	@Test
	public void addBytesTest() {
		assertEquals("7 + 3 shoud equal 10" , new Byte((byte)10), byteCalc.add((byte)7,(byte)3));
	}
	
	@Test
	public void addPositiveDoublesTest() {
		assertEquals("2.2 + 3.1 should be 5.3 " , new Double(5.3), doubleCalc.add(2.2, 3.1), 0.001);
	}
	
	@Test
	public void addPositiveFloatsTest() {
		assertEquals("2.2 + 3.1 should be 5.3 " , new Double(5.3), doubleCalc.add(2.2, 3.1), 0.001);
	}
	
	@Test
	public void addPositiveIntegersTest() {
		assertEquals("2 + 3 shoud equal 5" , new Integer(5), intCalc.add(2, 3));
	}
	
	@Test
	public void addPositiveLongsTest() {
		assertEquals("12000 + 13000 should be 25000 " , new Long(25000), longCalc.add((long)12000, (long)13000));
	}
	
	@Test
	public void addPositiveShortsTest() {
		assertEquals("1 + 7 should equal 8 ", new Short((short)8), shortCalc.add((short)1, (short)7));
	}

	@Test
	public void subBytesTest() {
		assertEquals("7 - 3 shoud equal 4" , new Byte((byte)4), byteCalc.sub((byte)7,(byte)3));
	}
	
	@Test
	public void subPositiveDoublesTest() {
		assertEquals("2.2 - 3.1 should be -0.9 " , new Double(-0.9), doubleCalc.sub(2.2, 3.1), 0.001);
	}
	
	@Test
	public void subPositiveFloatsTest() {
		assertEquals("2.2 - 3.1 should be -0.9 " , new Double(-0.9), doubleCalc.sub(2.2, 3.1), 0.001);
	}
	
	@Test
	public void subPositiveIntegersTest() {
		assertEquals("2 - 3 shoud equal -1" , new Integer(-1), intCalc.sub(2, 3));
	}
	
	@Test
	public void subPositiveLongsTest() {
		assertEquals("12000 - 13000 should be -1000 " , new Long(-1000), longCalc.sub((long)12000, (long)13000));
	}
	
	@Test
	public void subPositiveShortsTest() {
		assertEquals("1 - 7 should equal -6 ", new Short((short)-6), shortCalc.sub((short)1, (short)7));
	}
	
	@Test
	public void multBytesTest() {
		assertEquals("7 * 3 shoud equal 21" , new Byte((byte)21), byteCalc.mult((byte)7,(byte)3));
	}
	
	@Test
	public void multPositiveDoublesTest() {
		assertEquals("2.2 * 3.1 should be 6.82 " , new Double(6.82), doubleCalc.mult(2.2, 3.1), 0.001);
	}
	
	@Test
	public void multPositiveFloatsTest() {
		assertEquals("2.2 * 3.1 should be 6.82 " , new Double(6.82), doubleCalc.mult(2.2, 3.1), 0.001);
	}
	
	@Test
	public void multPositiveIntegersTest() {
		assertEquals("2 * 3 shoud equal 6" , new Integer(6), intCalc.mult(2, 3));
	}
	
	@Test
	public void multPositiveLongsTest() {
		assertEquals("12000 * 13000 should be 156000000 " , new Long(156000000), longCalc.mult((long)12000, (long)13000));
	}
	
	@Test
	public void multPositiveShortsTest() {
		assertEquals("1 * 7 should equal 7 ", new Short((short)7), shortCalc.mult((short)1, (short)7));
	}
	
	@Test
	public void divBytesTest() {
		assertEquals("12 / 3 shoud equal 4" , new Byte((byte)4), byteCalc.div((byte)12,(byte)3));
	}
	
	@Test
	public void divPositiveDoublesTest() {
		assertEquals("6.0 / 3.0 should be 2.0 " , new Double(2.0), doubleCalc.div(6.0, 3.0), 0.001);
	}
	
	@Test
	public void divPositiveFloatsTest() {
		assertEquals("6.0 * 3.0 should be 2.0 " , new Double(2.0), doubleCalc.div(6.0, 3.0), 0.001);
	}
	
	@Test
	public void divPositiveIntegersTest() {
		assertEquals("12 * 3 shoud equal 4" , new Integer(4), intCalc.div(12, 3));
	}
	
	@Test
	public void divPositiveLongsTest() {
		assertEquals("25000 * 5000 should be 5 " , new Long(5), longCalc.div((long)25000, (long)5000));
	}
	
	@Test
	public void divPositiveShortsTest() {
		assertEquals("12 * 4 should equal 3 ", new Short((short)3), shortCalc.div((short)12, (short)4));
	}
}
