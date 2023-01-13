package com.ju5ns.core;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class UserAccountServiceTest {

	@Nested
	public class NewUserRegistrationTest {
		@BeforeEach
		public void before(TestInfo testInfo) {
			System.out.println("preparing for test : " + testInfo.getDisplayName());
		}

		@Test
		public void testRegisterUserNew() {
			assertTrue(true);
		}

		@Test
		public void testRegisterUserWithInvalidEmailAddress() {
			assertTrue(true);
		}

		@Test
		public void testRegisterUserWithInvalidMobileNo() {
			assertTrue(false);
		}
	}

	@Nested
	public class ExistingUserRegistrationTest {
		@BeforeEach
		public void before(TestInfo testInfo) {
			System.out.println("preparing test : " + testInfo.getDisplayName());
		}

		@Test
		public void testRegisterUserWithExistingUser() {
			assertTrue(true);
		}

		@Test
		public void testRegisterUserWithDisabledUser() {
			assertTrue(false);
		}

		@Test
		public void testUserWithExistingMobile() {
			assertTrue(true);
		}
	}
}
