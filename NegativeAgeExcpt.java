package assignment_6b;

//Assignment 6.2
//Write a program to generate a user-defined exception called NegativeAgeException
//if the user inputs negative value for age.

//Defining Our own Exception by extending Exception class

class NegativeAgeExcpt extends Exception
{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
String errorMessage;

public NegativeAgeExcpt(String errorMessage)
{
    this.errorMessage = errorMessage;
  
    
}

//Modifying toString() method to display customized error message

@Override
public String toString()
{
    return errorMessage;
}
}

