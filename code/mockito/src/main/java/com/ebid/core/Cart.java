package com.ebid.core;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class Cart {
	private Set<LineItem> lineItems;
	private ShippingAddress shippingAddress;

	public String addLineItem(String productCode, int quantity, double unitPrice) {
		String ref = null;
		LineItem lineItem = new LineItem();
		lineItem.setProductCode(productCode);
		lineItem.setQuantity(quantity);
		lineItem.setUnitPrice(unitPrice);

		if (lineItems == null) {
			lineItems = new HashSet<>();
		}
		lineItems.add(lineItem);
		ref = UUID.randomUUID().toString().substring(0, 6);
		return ref;
	}

	public boolean setShippingAddress(ShippingAddress shippingAddress) {
		System.out.println("setShippingAddress()");
		this.shippingAddress = shippingAddress;
		return true;
	}

}
