package com.ebid.helper;

public class MockBidSorterWith6Bids implements BidSorter {

	/**
	 * 12, 13.1, 34, 78.1, 34.6, 45
	 */
	@Override
	public double[] sortBids(double[] bids) {
		return new double[] { 78.1, 45, 34.6, 34, 13.1, 12 };
	}

}
