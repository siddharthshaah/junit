package com.ebid.core;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import com.ebid.exception.EmptyArrayException;
import com.ebid.helper.BidSorter;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MBidAnalyzerTest {
	@Mock
	BidSorter bidSorter;

	@InjectMocks
	BidAnalyzer bidAnalyzer;

	@Test
	void testGetTopBidsWithNullArray() {
		double[] bids = null;

		when(bidSorter.sortBids(bids)).thenThrow(EmptyArrayException.class);
		assertThrows(EmptyArrayException.class, () -> {
			bidAnalyzer.getTopBids(bids, 1);
		});
	}

}
