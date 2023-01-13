package com.ebid.core;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.ebid.helper.MockBidSorterWith3Bids;
import com.ebid.helper.MockBidSorterWith6Bids;

import org.junit.jupiter.api.Test;

public class BidAnalyzerTest {
	BidAnalyzer bidAnalyzer;

	@Test
	public void testGetTopBidsWith6Bids() {
		bidAnalyzer = new BidAnalyzer(new MockBidSorterWith6Bids());
		double[] bids = new double[] { 12, 13.1, 34, 78.1, 34.6, 45 };
		int n = 3;
		double[] expectedTopBids = new double[] { 78.1, 45, 34.6 };

		double[] actualTopBids = bidAnalyzer.getTopBids(bids, n);
		assertArrayEquals(expectedTopBids, actualTopBids);
	}

	@Test
	public void testGetTopBidsWith3Bids() {
		bidAnalyzer = new BidAnalyzer(new MockBidSorterWith3Bids());
		double[] bids = new double[] { 98.9, 100.3, 99.1 };
		int n = 1;
		double[] expectedTopBids = new double[] { 100.3 };
		double[] actualTopBids = bidAnalyzer.getTopBids(bids, n);
		assertArrayEquals(expectedTopBids, actualTopBids);
	}

}
