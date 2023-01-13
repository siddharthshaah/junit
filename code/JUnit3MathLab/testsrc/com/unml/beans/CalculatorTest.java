package com.unml.beans;

import junit.framework.Assert;
import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
	int a;
	int b;
	int expectedSum;
	int na;
	int nb;
	int nExpectedSum;
	Calculator calculator;

	@Override
	protected void setUp() throws Exception {
		System.out.println("setUp()");
		a = 10;
		b = 20;
		expectedSum = 30;
		na = -10;
		nb = -1;
		nExpectedSum = -11;
		calculator = new Calculator();
	}

	public void testAddWithPositiveNumbers() {
		int actualSum = calculator.add(a, b);
		Assert.assertEquals(expectedSum, actualSum);
	}

	public void testAddWithNegativeNumbers() {
		int actualSum = calculator.add(na, nb);
		Assert.assertEquals(nExpectedSum, actualSum);
	}

	@Override
	protected void tearDown() throws Exception {
		System.out.println("tearDown()");
		calculator = null;
	}

}
