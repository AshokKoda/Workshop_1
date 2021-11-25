package testCases;

import org.junit.Assert;
import org.junit.Test;
import testcasesprograms.SwapTwoNumbers;

public class SwapNumbersTest {

	private static final double DELTA = 1e-15;
	
	@Test
	public void swapPass() {
		int result = SwapTwoNumbers.swapTwo(16, 22, 0);
		Assert.assertEquals(2216, result, DELTA);
	}
	
	@Test
	public void swapFail() {
		int result = SwapTwoNumbers.swapTwo(16, 22, 0);
		Assert.assertEquals(1622, result, DELTA);
	}
}
