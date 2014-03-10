package com.example.tests;

import junit.framework.AssertionFailedError;

import org.junit.Test;

public class Test2 {

	@Test
	public void testMethod1() {
		if (Math.random() > 0.1)
			throw new AssertionFailedError("Test failed");

	}

	@Test
	public void testMethod2() {
		if (Math.random() > 0.8)
			throw new AssertionFailedError("Test failed");

	}

	@Test
	public void testMethod3() {
		if (Math.random() > 0.8)
			throw new AssertionFailedError("Test failed");

	}

}
