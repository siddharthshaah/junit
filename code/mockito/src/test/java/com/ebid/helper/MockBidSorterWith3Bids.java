package com.ebid.helper;

public class MockBidSorterWith3Bids implements BidSorter {

	@Override
	public double[] sortBids(double[] bids) {
		return new double[] { 100.3, 99.1, 98.9 };
	}

}
