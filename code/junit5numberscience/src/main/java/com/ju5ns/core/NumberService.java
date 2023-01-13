package com.ju5ns.core;

public class NumberService {
	public long sumOfNOddNumbers(int n) {
		int c = 0;
		int i = 0;
		long sum = 0;

		while (c < n) {
			if (i % 2 != 0) {
				sum += i;
				c++;
			}
			i++;
		}
		return sum;
	}

	public double divide(int a, int b) {
		return b / a;
	}
}
