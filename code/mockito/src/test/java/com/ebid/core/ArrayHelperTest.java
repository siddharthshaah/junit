package com.ebid.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.ebid.exception.EmptyArrayException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = org.mockito.quality.Strictness.LENIENT)
public class ArrayHelperTest {
	@Mock
	Finder finder;

	@InjectMocks
	ArrayHelper arrayHelper;

//	@BeforeEach
//	public void before() {
//		finder = Mockito.mock(Finder.class);
//		arrayHelper = new ArrayHelper(finder);
//	}

	@Test
	public void testSumOfEvens() {
		int[] inArray = new int[] { 10, 8, 6 };
		int expectedSum = 24;

		when(finder.isEven(10)).thenReturn(true);
		when(finder.isEven(8)).thenReturn(true);
		// when(finder.isEven(3)).thenReturn(false);
		// when(finder.isEven(1)).thenReturn(false);
		// lenient().when(finder.isEven(6)).thenReturn(true);
		when(finder.isEven(6)).thenReturn(true);

		long actualSum = arrayHelper.sumOfEvenNumbers(inArray);
		verify(finder, atLeast(1)).isEven(10);
		verify(finder, atLeast(1)).isEven(8);
		verify(finder, atLeast(1)).isEven(6);

		assertEquals(expectedSum, actualSum);
	}

	@Test
	public void testSumOfEventsWithEmptyArray() {
		int[] inArray = new int[] {};
		int expectedSum = 0;

		long actualSum = arrayHelper.sumOfEvenNumbers(inArray);
		assertEquals(expectedSum, actualSum);
	}

	@Test
	public void testSumOfEventsWithNullArray() {
		Exception e = assertThrows(EmptyArrayException.class, () -> {
			arrayHelper.sumOfEvenNumbers(null);
		});
		assertEquals("input array is null", e.getMessage());
	}

}
