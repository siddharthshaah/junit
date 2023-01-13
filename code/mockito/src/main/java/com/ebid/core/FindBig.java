package com.ebid.core;

public class FindBig {
	public int getBigNumber(int[] inArray) {
		int[] sortedArray = NumberHelper.sort(inArray);
		return sortedArray[sortedArray.length - 1];
	}
}
