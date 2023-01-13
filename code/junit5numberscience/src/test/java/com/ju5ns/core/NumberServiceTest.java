package com.ju5ns.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.TestMethodOrder;

@TestInstance(Lifecycle.PER_CLASS)
@TestMethodOrder(value = MethodOrderer.OrderAnnotation.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class NumberServiceTest {
	NumberService numberService;

	@BeforeAll
	public void init() {
		System.out.println("baking tests!");
	}

	@BeforeEach
	public void setUp() {
		numberService = new NumberService();
	}

	@Test
	@Order(2)
	@DisplayName("test sum of n odd numbers with positive n")
	public void testSumOfNOddNumbersWithPositiveN() {
		int n = 5;
		long expectedSum = 25;
		long actualSum = numberService.sumOfNOddNumbers(n);
		assertEquals(expectedSum, actualSum);
		System.out.println("hashcode: " + this.hashCode());
	}

	@Test
	@Order(1)
	public void test_Sum_Of_N_Odd_Numbers_With_N_As_One() {
		int n = 1;
		long expectedSum = 1;
		long actualSum = numberService.sumOfNOddNumbers(n);
		assertEquals(expectedSum, actualSum);
		System.out.println("hashcode: " + this.hashCode());
	}

	@Test
	public void testDivide() {
		int a = 0;
		int b = 29;
		Exception exception = assertThrows(ArithmeticException.class, () -> {
			numberService.divide(a, b);
		});
		assertEquals("/ by zero", exception.getMessage());
	}

	@AfterEach
	public void tearDown() {
		numberService = null;
	}

	@AfterAll
	public void close() {
		System.out.println("finished!");
	}
}
