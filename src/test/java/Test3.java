
import junit.framework.AssertionFailedError;

import org.junit.Test;

public class Test3 {

	@Test
	public void testMethod1() {
		if (Math.random() > 0.8)
			throw new AssertionFailedError("Test failed");

	}
	
	@Test
	public void testMethod2() {
		if (Math.random() > 0.8)
			throw new AssertionFailedError("Test failed");

	}

}
