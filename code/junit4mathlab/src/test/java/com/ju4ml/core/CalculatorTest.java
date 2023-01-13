package com.ju4ml.core;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	Calculator calculator;

	@BeforeClass
	public static void boot() {
		System.out.println("one-time initialization logic..");
	}

	@Before
	public void init() {
		System.out.println("init()");
		calculator = new Calculator();
	}

	@Test
	public void testAddWithPositiveNumber() {
		System.out.println("testAddWithPositiveNumber");
		int a = 10;
		int b = 20;
		int expectedSum = 30;
		int actualSum = calculator.add(a, b);
		assertEquals(expectedSum, actualSum);
	}

	@Test
	public void testAddWithNegativeNumber() {
		System.out.println("testAddWithNegativeNumber");
		int a = -10;
		int b = -20;
		int expectedSum = -30;
		int actualSum = calculator.add(a, b);
		assertEquals(expectedSum, actualSum);
	}

	@After
	public void clean() {
		System.out.println("clean()");
		calculator = null;
	}

	@AfterClass
	public static void shutdown() {
		System.out.println("one-time cleanup logic");
	}
}
