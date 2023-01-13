package com.ju5ns.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class BillingServiceTest {
	BillingService billingService;

	@BeforeEach
	public void before() {
		billingService = new BillingService();
	}

	@ParameterizedTest
	@MethodSource("getItemsParameters")
	public void testBill(Set<Item> items, double expectedBillAmount) throws InterruptedException {
		assertTimeout(Duration.ofMillis(10), () -> {
			double actualBillAmount = billingService.bill(items);
			assertEquals(expectedBillAmount, actualBillAmount);
		});

	}

	public static Stream<Arguments> getItemsParameters() {

		Set<Item> oneItemSet = new HashSet<>();
		oneItemSet.add(new Item("ic9383", 10, 34.3));

		Set<Item> moreItemSet = new HashSet<>();
		moreItemSet.add(new Item("ic99", 2, 23.2));
		moreItemSet.add(new Item("ic998", 12, 3.2));
		moreItemSet.add(new Item("ic39", 98, 1.2));

		return Stream.of(Arguments.arguments(Collections.emptySet(), 0), Arguments.arguments(oneItemSet, 343),
				Arguments.arguments(moreItemSet, 202.4));
	}
}
