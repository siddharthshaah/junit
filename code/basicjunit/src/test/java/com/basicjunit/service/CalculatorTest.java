package com.basicjunit.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

@Testable
public class CalculatorTest {
	Calculator calculator;
	int a;
	int b;
	int expectedSum;
	int na;
	int nb;
	int nexpectedSum;

	@BeforeEach
	public void setup() {
		calculator = new Calculator();
		a = 10;
		b = 20;
		expectedSum = 30;
		na = -10;
		nb = -2;
		nexpectedSum = -12;
	}

	@Test
	public void testAddWithPositiveNumbers() {
		int actualSum = calculator.add(a, b);
		assertEquals(expectedSum, actualSum);
	}

	@Test
	public void testAddWithNegativeNumbers() {
		int actualSum = calculator.add(na, nb);
		assertEquals(nexpectedSum, actualSum);
	}

	@AfterEach
	public void cleanUp() {
		calculator = null;
	}
}
