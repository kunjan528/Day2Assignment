

//Write a program to calculate the sum of the first and the second last digit 
//of a 5 digit.
//Example: Enter a five-digit number = 12345
 //Output: 1+4= 5


import java.util.Scanner;


public class Add1st_2ndDigit
{
    public static void main(String[] args)
	{

		
	     Scanner sc = new Scanner(System.in);
	     System.out.print("Enter a five-digit number:");
	     int num  = sc.nextInt();
	     int first_no = num /10000;
		//System.out.println(first_no);
             int Sec_Last_No   = num % 100;
	     int num2 = Sec_Last_No  /10;
		//System.out.println(num2);
		System.out.println("Output : "+ (first_no+num2));
	     
	     
	     



	}
}