/*
 Put comment block here
*/

// import the Scanner class for use in this program
import java.util.Scanner;

public class p42
{

  public static void main (String[] args)
  {
    // create and initialize a Scanner object for use in this method ONLY
    Scanner stdIn = new Scanner(System.in);
        
 
    // Your code here
	String input;
    

	//intake number
	System.out.print("Please enter a valid (4 character) double literal : ");
	input = stdIn.next();
    
    /*if ( input.matches("a") )
    {
        System.out.println(input + " is not a valid (4 character) double literal");
    }
    */

    //if it is a lenghth of 4 and it is a number from 0 to 9999
    do while
    if ( input.length() <= 4 && input.matches("[0.0-9999]+") )
    {
         System.out.println(input + " is a valid (4 character) double literal");
    }
        if ( input.length() <=4 &&!! input.matches("[a-z]"))  
        {
            System.out.println(input + " is a valid (4 character) double literal");
        }
    
        else //then it is not a 4 char double 
        {
            System.out.println( input + " is not a valid (4 character) double literal");
        }

    // close your Scanner object after your done using it
    stdIn.close();    
  }

}