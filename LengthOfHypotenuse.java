

//Write a program that calculates the length of the hypotenuse given the
//lengths of the other two sides in a right-angled triangle.
//Example : Enter length of 1st side= 10
 //Enter length of 2nd side= 10
 //Hypotenuse = 14.14214
//c2 = a 2 + b2


import java.util.Scanner;


public class LengthOfHypotenuse
{
    public static void main(String[] args)
	{

		
	     Scanner sc = new Scanner(System.in);
	     System.out.print("Enter length of 1st side:");
	     double len  = sc.nextDouble();
	     System.out.print("Enter length of 2nd side:");
	     double len1 = sc.nextDouble();
	    
	     double c = Math.hypot( len ,  len1);
	     System.out.printf("Hypotenuse : %.5f",c);
	      



	}
}