//Assignment 6.2
//Write a program to generate a user-defined exception called NegativeAgeException
//if the user inputs negative value for age.

package assignment_6b;

import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args)
    {
          @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);  //Declaring Scanner variable to take input from user
 
          System.out.println("Enter Your Age");
 
          int age = sc.nextInt();         //Taking input from user
 
          try
          {
              if(age < 0)
              {
                  throw new NegativeAgeExcpt("Age can not be negative");    //throws AgeIsNegativeException if age is negative
              }
          }
          catch(NegativeAgeExcpt ex)
          {
              System.out.println(ex);    //Output : Age can not be negative
          }
    }
}