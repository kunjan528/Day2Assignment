

//Rs 8500 is invested for 5 years at 0.3% per year compound interest. What 
//is the value of the investment after this time? Write a Java program to
//calculate the result.
//Enter the principal amount : 8500
 //Interest rate : 0.3 %
 //Time period: 5 yrs
 //Output: A=P(1+r/100)^n
//n =8628.27 Rs


import java.util.Scanner;


public class compound_interest
{
    public static void main(String[] args)
	{

		
	     Scanner sc = new Scanner(System.in);
	     System.out.print("Enter the Principle Amount:");
	     double PA  = sc.nextDouble();

	     System.out.print("Enter the Interest rate:");
	     double IR = sc.nextDouble();

             System.out.print("Time period:");
	     double TR = sc.nextDouble();

	     //System.out.print("n:");
	     //double n = sc.nextDouble();
	     

	     double A=PA  * (Math.pow((1+ IR/100),TR));
	     System.out.printf("Output: %.2f " ,A);
	
		

	     
	     
	     



	}
}