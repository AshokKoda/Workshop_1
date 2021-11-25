package testcasesprograms;

public class FindLargeNumber {
	
	public static int findLargestNum(int a, int b, int c)
	{
		a = 15; b = 10; c = 25;
		
		if(a > b && a > c)
        {
            return a;
        }
        else if(b > c)
        {
            return b;
        }
        else
        {
            return c;
        }
	}

}
