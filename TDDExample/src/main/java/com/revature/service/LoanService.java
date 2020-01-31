package com.revature.service;

import com.revature.pojo.Loan;

public interface LoanService {
	public Double calculatePaymentAmount(Loan loan);
	
	public Double makeScheduledPayment(Loan loan);
	
}
