package com.ju5ns.core;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorTest {

	Calculator calculator;

	@BeforeEach
	void before() {
		calculator = new Calculator();
	}

	@ParameterizedTest
	@CsvSource({ "10, 20, 30", "20, -10, 10", "0, 0, 0" })
	void testAdd(int a, int b, int expectedSum) {
		int actualSum = calculator.add(a, b);
		assertEquals(expectedSum, actualSum);
	}

	@ParameterizedTest
	@CsvSource({ "10, 20, 10", "10, 10, 0" })
	void testSubstract(int a, int b, int expectedSubstract) {

	}
}
