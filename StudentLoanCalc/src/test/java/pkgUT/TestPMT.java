package pkgUT;

import static org.junit.Assert.*;
import org.apache.poi.ss.formula.functions.*;
import org.junit.Test;

import org.junit.Test;

import org.junit.Test;

import app.controller.Loan; 

public class TestPMT extends Loan {

	@Test
	public void test() {
		double r = 0.07/12;
		double n = 20 * 12;
		double p = 150000;
		double f = 0;
		boolean t = false;
		double PMT = Math.abs(FinanceLib.pmt(r, n, p, f, t));
		
		double PMTExpected = 1162.95;
		
		assertEquals(PMTExpected, PMT, 0.01);
		
				
		//fail("Not yet implemented");
	}

	@Test
		public void testTotalPayment1() {
		double loanAmount = 150000;
		int term = 20;
		double interestRate = 7;
		double expected = 279107.0;
		double actual = getTotalPayments(loanAmount,term,interestRate);
		actual = Math.round(actual*100)/100;

		assertEquals(expected,actual,0);
		}

	@Test
		public void testTotalPayment2() {
		double loanAmount = 250000;
		int term = 7;
		double interestRate = 7;
		double expected = 316946.0;
		double actual = getTotalPayments(loanAmount,term,interestRate);
		actual = Math.round(actual*100)/100;

		assertEquals(expected,actual,0);
		}

	}


