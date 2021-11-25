package testcasesprograms;

public class SwapTwoNumbers {
	
	public static int swapTwo(int a, int b, int c)
	{
		a = 16; b = 22;
		c = a;
		a = b;
		b = c;
		
		String swap = a+""+b;
		c = Integer.parseInt(swap);
		return c;
	}

}
