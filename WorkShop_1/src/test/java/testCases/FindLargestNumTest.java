package testCases;

import org.junit.Assert;
import org.junit.Test;

import workshopone.FindLargeNumber;

public class FindLargestNumTest {

	private static final double DELTA = 1e-15;
	
	@Test
	public void largestNumPass() {
		int test = FindLargeNumber.findLargestNum(15, 10, 25);
		Assert.assertEquals(25, test, DELTA);
	}
	
	@Test
	public void largestNumFail() {
		int test = FindLargeNumber.findLargestNum(15, 10, 25);
		Assert.assertEquals(10, test, DELTA);
	}
}
