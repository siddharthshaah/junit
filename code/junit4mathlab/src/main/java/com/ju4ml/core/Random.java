package com.ju4ml.core;

import java.security.SecureRandom;

public class Random {

	public int[] nPostiveNumbers(int n) throws InterruptedException {
		int[] numbers = null;
		SecureRandom random = null;
		int i = 0;

		if (n <= 0) {
			throw new InvalidInputException("n should be positive non-zero number");
		}
		numbers = new int[n];
		random = new SecureRandom();
		while (i < n) {
			int number = random.nextInt();
			if (number > 0) {
				numbers[i] = number;
				i++;
			}
			Thread.sleep(50);
		}
		return numbers;
	}

}
