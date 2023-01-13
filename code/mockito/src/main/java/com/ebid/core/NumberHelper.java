package com.ebid.core;

import com.ebid.exception.EmptyArrayException;

public class NumberHelper {

	public static int[] sort(int[] inArray) {
		int[] sortedBids = null;
		int temp = 0;

		if (inArray == null || inArray.length == 0) {
			throw new EmptyArrayException("bids are empty");
		}
		
		sortedBids = new int[inArray.length];
		for (int i = 0; i < inArray.length; i++) {
			sortedBids[i] = inArray[i];
		}
		for (int i = 0; i < inArray.length - 1; i++) {
			for (int j = 0; j < inArray.length - 1; j++) {
				if (sortedBids[j] < sortedBids[j + 1]) {
					temp = sortedBids[j];
					sortedBids[j] = sortedBids[j + 1];
					sortedBids[j + 1] = temp;
				}
			}
		}
		return sortedBids;
	}
}
