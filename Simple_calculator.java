

//Write a program that acts as a simple calculator. It should take two
//numbers and an operator (+, -, *, /) as input and perform the
//corresponding operation.
//Example: Input 1st Number : 10
 //Input 2nd Number: 20
 //Enter the operation to be performed (+,-,/,*) : +
 //Result: 10+20 = 30 


import java.util.Scanner;


public class Simple_calculator
{
    public static void main(String[] args)
	{

		
	     Scanner sc = new Scanner(System.in);
	     System.out.print("Enter 1st Number:");
	     int len  = sc.nextInt();
	     System.out.print("Enter length of 2nd Number:");
	     int len1 = sc.nextInt();
	     System.out.print("Enter the operation to be performed (+,-,/,*) :");
	     char operator = sc.next().charAt(0);
		
		if(operator == '+')
			{
				int sum = len + len1;
				System.out.println(len +""+operator+""+len1+ "=" +sum); 
			}
		else if(operator == '*')
			{
				int Mul = len * len1;
				System.out.println(len +""+operator+""+len1+ "=" +Mul); 
			}
		else if(operator == '-')
			{
				int Sub = len - len1;
				System.out.println(len +""+operator+""+len1+ "=" +Sub); 
			}
		else if(operator == '/')
			{
				int Div = len / len1;
				System.out.println(len +""+operator+""+len1+ "=" +Div); 
			}
	     
		
	     



	}
}