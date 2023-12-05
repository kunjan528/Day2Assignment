

//Create a function that calculates the power of a number. It should take 
//two parameters, base and exponent, and return the result.
//Example: base = 5
// exponent =2 
 //Result = 52 =25


import java.util.Scanner;


public class Power_Number
{
    public static void main(String[] args)
	{

		
	     Scanner sc = new Scanner(System.in);
	     System.out.print("Enter Base:");
	     double base  = sc.nextDouble();
	     System.out.print("Enter exponent:");
	     double expo = sc.nextDouble();
	     System.out.println("Result : "+(int)(Math.pow(base ,2)));
	     



	}
}