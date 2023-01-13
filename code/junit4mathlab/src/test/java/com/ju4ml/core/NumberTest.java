package com.ju4ml.core;

import junit.framework.Assert;
import junit.framework.TestCase;

public class NumberTest extends TestCase {
	Number number;

	@Override
	protected void setUp() throws Exception {
		number = new Number();
	}

	public void testEven() {
		int n = 9;
		boolean actualEven = number.isEven(n);
		Assert.assertFalse(actualEven);
	}

	@Override
	protected void tearDown() throws Exception {
		number = null;
	}

}
