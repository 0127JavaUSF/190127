package com.revature.service;

import com.revature.pojo.Loan;
import com.revature.util.Calculator;
import com.revature.util.CalculatorImpl;

public class LoanServiceImpl implements LoanService {

	private Calculator<Double> calculator = new CalculatorImpl<Double>();

	public void setCalculator(Calculator<Double> calc) {
		this.calculator = calc;
	}

	@Override
	public Double calculatePaymentAmount(Loan loan) {

		double paymentAmount = 0.0;

		if (loan.getInterestType() == Loan.InterestType.SIMPLE) {

			double totalInterestPercent = calculator.mult(loan.getInterest(), new Double(loan.getLength()));
			double totalWithInterest = calculator.mult(loan.getPrinciple(), calculator.add(1.0, totalInterestPercent));

			double payments = 0.0;
			
			if (loan.getPeriod() == Loan.Period.MONTHLY) {
				payments = calculator.mult(new Double(loan.getLength()), 12.0);
			}
			
			paymentAmount = calculator.div(totalWithInterest, payments);

		}

		return paymentAmount;
	}

	@Override
	public Double makeScheduledPayment(Loan loan) {
		return null;
	}

}
