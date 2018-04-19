package com.qa.calculator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class DivisonTest {
	
	private Divide divide;

	@Test
	public void test() {
		divide = new Divide();
		int expectedValue = 2;
		int actualValue = divide.Divide(4,2);
		Assert.assertEquals(expectedValue, actualValue);
		
	}

}
