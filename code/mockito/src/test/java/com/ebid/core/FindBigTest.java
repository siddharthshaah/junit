package com.ebid.core;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class FindBigTest {
	FindBig findBig;

	@BeforeEach
	void init() {
		findBig = new FindBig();
	}

	@Test
	void testGetBigNumber() {
		int[] inArray = new int[] { 10, 12, 11, 7 };
		int expectedBigNumber = 12;

		try (MockedStatic<NumberHelper> numberHelper = Mockito.mockStatic(NumberHelper.class)) {
			numberHelper.when(() -> {
				NumberHelper.sort(inArray);
			}).thenReturn(new int[] { 7, 10, 11, 12 });
			int actualBigNumber = findBig.getBigNumber(inArray);
			assertEquals(expectedBigNumber, actualBigNumber);
		}
	}
}
