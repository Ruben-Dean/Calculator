package com.qa.calculator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class SubtractorTest {

	private Subtractor subtractor;
	@Test
	public void test() {
		subtractor = new Subtractor();
		int expectedValue = 5;
		int actualValue = Subtractor.subtract(2,3);
		Assert.assertEquals(expectedValue, actualValue );
	}

}
