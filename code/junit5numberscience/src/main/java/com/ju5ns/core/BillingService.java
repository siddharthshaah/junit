package com.ju5ns.core;

import java.util.Set;

public class BillingService {
	public double bill(Set<Item> items) throws InterruptedException {
		double totalBill = 0;

		for (Item item : items) {
			double itemAmount = item.getUnits() * item.getUnitPrice();
			totalBill += itemAmount;
			Thread.sleep(5);
		}

		return totalBill;
	}
}
