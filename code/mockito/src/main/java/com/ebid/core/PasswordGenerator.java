package com.ebid.core;

public class PasswordGenerator {
	private Random random;

	public PasswordGenerator(Random random) {
		this.random = random;
	}

	public String generateRandom(int len) {
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < len; i++) {
			buffer.append(random.random());
		}
		return buffer.toString(); 
	}

}
