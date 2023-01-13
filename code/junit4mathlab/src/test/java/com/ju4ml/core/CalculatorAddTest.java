package com.ju4ml.core;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculatorAddTest {
	Calculator calculator;
	int a;
	int b;
	int expectedSum;

	public CalculatorAddTest(int a, int b, int expectedSum) {
		this.a = a;
		this.b = b;
		this.expectedSum = expectedSum;
	}

	@Parameters
	public static List<Object[]> parameters() {
		return Arrays.asList(new Object[][] { { 10, 20, 30 }, { -10, 20, 10 }, { 0, 0, 0 }, { -10, -20, -30 } });
	}

	@Before
	public void setup() {
		calculator = new Calculator();
	}

	@Test
	public void testAdd() {
		int actualSum = calculator.add(a, b);
		assertEquals(expectedSum, actualSum);
	}

	@After
	public void tearDown() {
		calculator = null;
	}
}
