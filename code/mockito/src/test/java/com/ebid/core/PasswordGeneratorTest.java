package com.ebid.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class PasswordGeneratorTest {
	@Mock
	Random random;

	@InjectMocks
	PasswordGenerator passwordGenerator;

	@Test
	public void testGeneratorPassword() {
		int expectedLength = 6;
		int n = 6;
		when(random.random()).thenAnswer((I) -> {
			return 3;
		});
		String password = passwordGenerator.generateRandom(n);
		assertEquals(expectedLength, password.length());
	}
}
