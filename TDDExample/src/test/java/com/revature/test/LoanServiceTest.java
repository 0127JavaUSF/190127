package com.revature.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.revature.pojo.Loan;
import com.revature.service.LoanServiceImpl;
import com.revature.util.Calculator;

@RunWith(MockitoJUnitRunner.class)
public class LoanServiceTest {
	
	@Mock
	Calculator<Double> calc;
	
	LoanServiceImpl loanService;
	
	Loan loan;
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
	@Before
	public void setUp() throws Exception {
		loanService = new LoanServiceImpl();
		loan = new Loan();
	}
	@After
	public void tearDown() throws Exception{
		
	}
	@Test
	public void simpleMonthlyCalculatePaymentAmount() {
		loan.setInterest(0.05);
		loan.setInterestType(Loan.InterestType.SIMPLE);
		loan.setLength(3);
		loan.setPrinciple(1000);
		loan.setPeriod(Loan.Period.MONTHLY);

		when(calc.mult(0.05, 3.0)).thenReturn(0.15);
		when(calc.add(1.0, 0.15)).thenReturn(1.15);
		when(calc.mult(1000.0, 1.15)).thenReturn(1150.0);
		when(calc.mult(3.0,  12.0)).thenReturn(36.0);
		when(calc.div(1150.0, 36.0)).thenReturn(31.94);
		
		loanService.setCalculator(calc);
		
		assertEquals("Payments should equal 31.94", new Double(31.94), loanService.calculatePaymentAmount(loan));
}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
