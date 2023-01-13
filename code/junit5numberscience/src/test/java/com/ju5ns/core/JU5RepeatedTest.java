package com.ju5ns.core;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

public class JU5RepeatedTest {

	@BeforeEach
	public void beforeEach(TestInfo testInfo, RepetitionInfo repetitionInfo) {
		System.out.println("about to run " + testInfo.getTestMethod().get().getName() + ": "
				+ repetitionInfo.getCurrentRepetition() + "/" + repetitionInfo.getTotalRepetitions());
	}

	@RepeatedTest(10)
	public void repeatedTest() {
		assertTrue(true);
	}

	@RepeatedTest(10)
	public void repeatedTestWithRepeationInfo(RepetitionInfo repetitionInfo) {
		System.out.println(
				"repeatition :" + repetitionInfo.getCurrentRepetition() + "/" + repetitionInfo.getTotalRepetitions());
	}

	@RepeatedTest(10)
	@DisplayName("Test With Info")
	public void repeatedTestWithTestInfo(TestInfo testInfo) {
		System.out.println("Test Method: " + testInfo.getTestMethod().get().getName());
		System.out.println("DisplayName : " + testInfo.getDisplayName());
	}

	@RepeatedTest(value = 4, name = "{displayName} {currentRepetition}/{totalRepetition}")
	@DisplayName("test with expression!")
	public void repeatedTestWithDisplayNameExpression() {

	}
}
