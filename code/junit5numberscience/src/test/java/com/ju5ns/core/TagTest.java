package com.ju5ns.core;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TagTest {

	@Test
	@Tag("performance")
	public void testPerformance() {
		assertTrue(true);
	}

	@Test
	@Tag("performance")
	public void testLoad() {
		assertTrue(false);
	}

	@Test
	@Tag("stress")
	public void testAllUsers() {
		assertTrue(true);
	}
}
