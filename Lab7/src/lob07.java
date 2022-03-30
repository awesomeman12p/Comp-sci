/*
 Put comment block here
*/

// import the Scanner class for use in this program
import java.util.Scanner;

public class lob07
{

  public static void main (String[] args)
  {
    // create and initialize a Scanner object for use in this method ONLY
    Scanner stdIn = new Scanner(System.in);
    int input=8;
    // Your code here
    
    System.out.print("What is your number:");
    input = stdIn.nextInt();
    
    
    while ( input <1 || input >9 )
    {
    	System.out.print("What is your number:");
    	input = stdIn.nextInt();
    }

   for ( int line = 1; line <= input; ++line)
   {
     for ( int spaces = 1; spaces <= (input - line); ++ spaces)
     {
       System.out.print(' ');
     }
     for ( int first = 1; first <= line; ++ first)
     {
       System.out.print(first);
     }
     for ( int last = line; last >= 1; --last)
     {
       System.out.print(last);
     }
     System.out.println();
   }



    // close your Scanner object after your done using it
    stdIn.close();    
  }

}