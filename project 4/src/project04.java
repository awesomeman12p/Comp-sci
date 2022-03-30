/*
 Put comment block here
*/

// import the Scanner class for use in this program
import java.util.Scanner;

public class project04
{

  public static void main (String[] args)
  {
    // create and initialize a Scanner object for use in this method ONLY
    Scanner stdIn = new Scanner(System.in);
        
 
    // Your code here
	int input;
	

	//intake number
	System.out.print("Please enter a valid (4 character) double literal : ");
	input = stdIn.nextInt();

	//if the number is between 0 and 9999 then it is a double literal

	if ( 0<= input && input <=9999.9 )
	{
		System.out.println(input +"is a double literal");
	}
		else 
		{
			System.out.println(input + "is not a double literal");
		}
	if (input == 1+23.45 )
	{
		System.out.println(input + "is not a double literal");
	}
 
    if ( input == +45 )
	{
		System.out.println(input + "is not a double literal");
	}

    // close your Scanner object after your done using it
    stdIn.close();    
  }

}