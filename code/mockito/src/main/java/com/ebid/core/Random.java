package com.ebid.core;

import java.security.SecureRandom;

public class Random {
	public final int random() {
		return new SecureRandom().nextInt();
	}
}
