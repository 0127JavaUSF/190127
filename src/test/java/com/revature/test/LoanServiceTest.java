package com.revature.test;

import static org.junit.Assert.fail;
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
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
