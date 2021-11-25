package workshopone;

import java.util.Scanner;

public class FindLargeNumber {
	
	public static int findLargestNum(int a, int b, int c)
	{
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

	public static void main(String[] args) {
		
		int d, e, f;
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        d = sc.nextInt();
        System.out.print("Enter the second number:");
        e = sc.nextInt();
        System.out.print("Enter the third number:");
        f = sc.nextInt();
        
        int largeNum = findLargestNum(d, e, f);
        System.out.println(largeNum + " is the largest number.");
        
        //sum of digit
        int g, sum=0;
        System.out.println("The number is: " + largeNum);
        
        while(largeNum > 0)
        {
        	g = largeNum % 10;
        	sum =sum + g;
        	largeNum = largeNum/10;
        }
        
        System.out.println("Sum of Digits: " + sum);
	}

}
