package testCases;

import org.junit.Assert;
import org.junit.Test;

import testcasesprograms.EvenOddCheck;

public class EvenOddTesting {

	private static final double DELTA = 1e-15;
	
	@Test
	public void evenNumPass()
	{
		int checks = EvenOddCheck.checkEvenNums(8);
		Assert.assertEquals(0, checks, DELTA);
	}
	
	@Test
	public void evenNumFail()
	{
		int checks = EvenOddCheck.checkEvenNums(7);
		Assert.assertEquals(0, checks, DELTA);
	}
	
	@Test
	public void oddNumPass()
	{
		int checks = EvenOddCheck.checkOddNums(7);
		Assert.assertEquals(1, checks, DELTA);
	}
	
	@Test
	public void oddNumFail()
	{
		int checks = EvenOddCheck.checkOddNums(8);
		Assert.assertEquals(1, checks, DELTA);
	}
}
