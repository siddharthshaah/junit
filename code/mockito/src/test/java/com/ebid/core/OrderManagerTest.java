package com.ebid.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class OrderManagerTest {
	@Spy
	private Cart cart;
	@InjectMocks
	private OrderManager orderManager;

	@Test
	public void testCheckout() {
		Map<String, Integer> products = new HashMap<>();
		products.put("p1", 1);
		products.put("p2", 29);

		ShippingAddress shippingAddress = new ShippingAddress();
		shippingAddress.setAddressLine1("address");
		shippingAddress.setCity("Hyderabad");
		shippingAddress.setState("TS");
		shippingAddress.setZip(50007);
		shippingAddress.setCountry("India");
		String expectedOrderNo = "CO" + LocalDate.now() + "Q" + products.size() + "Z" + shippingAddress.getZip();

		when(cart.addLineItem(eq("p1"), eq(1), anyDouble())).thenReturn("r1");
		when(cart.addLineItem(eq("p2"), eq(29), anyDouble())).thenReturn("r2");

		String actualOrderNo = orderManager.checkout(products, shippingAddress);

		verify(cart, atLeast(1)).addLineItem(eq("p1"), eq(1), anyDouble());
		verify(cart, atLeast(1)).addLineItem(eq("p2"), eq(29), anyDouble());

		assertEquals(expectedOrderNo, actualOrderNo);
	}
}
