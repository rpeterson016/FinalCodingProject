package app.controller;

import java.util.LinkedList;
import org.apache.poi.ss.formula.functions.FinanceLib;


public class Loan {
		
		public double getTotalPayments(double loanAmount, int term, double interestRate) {
			interestRate= interestRate/1200;
			int months = term*12;
			double num = interestRate*loanAmount*months;
			double denom = 1-(Math.pow(1+interestRate, -1*months));
			double totalPayment = num/denom;
			double total = Math.round(totalPayment*100)/100;
			
			return total;
		}
	}
