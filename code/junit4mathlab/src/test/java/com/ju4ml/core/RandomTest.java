package com.ju4ml.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RandomTest {
	Random random;

	@Before
	public void init() {
		random = new Random();
	}

	@Test(timeout = 200)
	public void testNPositiveNumbers() throws InterruptedException {
		int n = 10;
//		long st = System.currentTimeMillis();
		int[] actualNumbers = random.nPostiveNumbers(n);
//		long et = System.currentTimeMillis();
//		long tt = et - st;
//		assertEquals("time limit exceeded", 200, tt);
		assertEquals(n + " not generated", n, actualNumbers.length);
		for (int number : actualNumbers) {
			assertTrue("not a non-zero postivie number", (number > 0));
		}
	}

	@Test(expected = InvalidInputException.class)
	public void testNPositiveNumbersWithBoundary() throws InterruptedException {
		int n = -10;
		// try {
		random.nPostiveNumbers(n);
		// assertTrue(false);
		// } catch (InvalidInputException e) {
		// assertTrue(true);
		// }
	}

	@After
	public void clean() {
		random = null;
	}

}
