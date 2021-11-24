package workshopone;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		int a, b, c;
		
		 @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);  
		 System.out.println("Enter the value of A and B:"); 
		 a = sc.nextInt(); 
		 b = sc.nextInt(); 
		 
		 System.out.println("Before swapping numbers: "+a +"  "+ b); 
		 
		 c = a;
		 a = b;
		 b = c;
		 System.out.println("After swapping: "+ a +" " + b); //After swapping
		 
		 //Task
		 int d, sum = 0;
		 String swap = a+""+b;
		 int convert = Integer.parseInt(swap);
		 System.out.println("Combined numbers: " + convert);
		 while(convert > 0)
		 {
			 d = convert % 10;
			 sum = sum + d;
			 convert = convert/10;
		 }
		 System.out.println("Sum of Digits: " + sum);
		 
		 

	}

}
