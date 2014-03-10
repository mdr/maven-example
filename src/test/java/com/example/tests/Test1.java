package com.example.tests;

import junit.framework.AssertionFailedError;

import org.junit.Test;

public class Test1 {

	@Test
	public void testMethod1() {
		if (Math.random() > 0.5)
			throw new AssertionFailedError("Test failed");
	}
	
	@Test
	public void testMethod2() {
		if (Math.random() > 0.9)
			throw new AssertionFailedError("Test failed");
	}

}
