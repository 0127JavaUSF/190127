package com.revature.test;
//allows us to import static values into our class, without having to
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
    private Calculator<Integer> intCalc;//because we set up calculator as a generic object, we need to tell it what type we want <Integer> for example here
	//we declare one reference here to be reused in every test
    private Calculator<Double> doubleCalc;
    private Calculator<Float> floatCalc;
    private Calculator<Long> longCalc;
    private Calculator<Short> shortCalc;
    @BeforeClass //Runs once before any tests(setup, connections, etc)
	public static void setUpBeforeClass() throws Exception {
	}
	@AfterClass  //Runs once after all tests finish(cleanup,
	public static void tearDownAfterClass() throws Exception {
	}
	@Before  //Runs once before each test
	public void setUp() throws Exception {
		intCalc = new CalculatorImpl<Integer>();//we have all requirements for all tests initialized here because we want fresh objects each time,
												//it doesn't hurt to have allocated objects that aren't used
		doubleCalc = new CalculatorImpl<Double>();
		floatCalc = new CalculatorImpl<Float>();
		longCalc  = new CalculatorImpl<Long>();
		shortCalc = new CalculatorImpl<Short>();
	}
	@After  //Runs once after each test
	public void tearDown() throws Exception {
	}
//	@Test
//	public void addPositiveDoublesTest() {
//		assertEquals("2.2 + 3.1 should be 5.3", new Double(5.3), doubleCalc.add(2.2, 3.1), 0.001);//overloaded value for assertEquals when dealing with doubles or floats, for checking precision
//	}
	@Test
	public void addFloatsTest() {
		assertEquals("2.3f + 3.7f should be 6.0f", new Float(6.0f), floatCalc.add(2.3f, 3.7f));
	}
//	
//	
//	@Test
//	public void addIntegerValuesTest() {
//		
//		assertEquals("34000 + 34000 should equal 68000", new Integer(68000), intCalc.add(34000, 34000));//assert more common
//	}
//	@Test
//	public void addLongsTest() {
//		assertEquals("2L + 3L should be 5L", new Long(5L), longCalc.add(2L, 3L));
//	}
//	@Test
//	public void addShortTest() {
//		assertEquals("10000 + 10000 should be 20000",  new Short((short) 20000), shortCalc.add((short)10000, (short)10000));
//	}
//	
//	
//	@Test
//	public void subDoublesTest() {
//		assertEquals("3.3 - 2.2 should be 1.1", new Double(1.1), doubleCalc.sub(3.3, 2.2), 0.001);
//	}
//	@Test
//	public void subFloatsTest() {
//		assertEquals("2.3f - 3.7f should be 6.0f", new Float(-1.400f), floatCalc.sub(2.3f, 3.7f), 0.001);
//	}
//	@Test
//	public void subIntegerValuesTest() {
//		assertEquals("68000- 34000 should equal 0", new Integer(34000) , intCalc.sub(68000, 34000));
//	}
//	@Test
//	public void subLongsTest() {
//		assertEquals("3L - 2L should be 1L", new Long(1L), longCalc.sub(3L, 2L));
//	}
//	@Test
//	public void subShortTest() {
//		assertEquals("10000 - 10000 should be 0",  new Short((short) 0), shortCalc.sub((short)10000, (short)10000));
//	}
//	
//	
//	@Test
//	public void multDoublesTest() {
//		assertEquals("3.3 * 2.2 should be 7.26", new Double(7.26),doubleCalc.mult(3.3, 2.2), 0.001);
//	}
}