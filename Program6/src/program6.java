/*
 Put comment block here
*/

// import the Scanner class for use in this program
import java.lang.invoke.StringConcatFactory;
import java.util.Scanner;

public class program6
{

  public static void main (String[] args)
  {
    // create and initialize a Scanner object for use in this method ONLY
    Scanner stdIn = new Scanner(System.in);
        
 
    // Your code here
	String play,input;
	String text;
	int roll;

	
	text = "Welcome to Computer Dice\n\nNext the outcome of your roll will be determined:\n\nany Quad and you Win\nany Triple and you Win\nany TwoPair and you Win\nany HighPair ( 4’s )and you Win\nanything else and you Lose";
    System.out.print(text);
    
	int d1, d2, d3, d4;
	String total;

	d1 = (int)(Math.random() * 4) + 1;
	d2 = (int)(Math.random() * 4) + 1;
	d3 = (int)(Math.random() * 4) + 1;
	d4 = (int)(Math.random() * 4) + 1;
	//print the random math
	System.out.print();

	System.out.println("Do you wish to play again [y, n] :");
	play = stdIn.next;
	while ( play = "y" )
	{
		//do the dice roll
		System.out.print("");
		//if the roll is equal to the correct response then it will say you win
		if (roll = 4)
		{
			System.out.println("A quad, you win!");
		}
			if ( d1,d2,d3,d4 = 4 )
	}
    
    // close your Scanner object after your done using it
    stdIn.close();    
  }

}