/*
 Put comment block here
*/

// import the Scanner class for use in this program
import java.util.Scanner;

public class program06
{

  public static void main (String[] args)
  {
    // create and initialize a Scanner object for use in this method ONLY
    Scanner stdIn = new Scanner(System.in);
        
 
    // Your code here
    //dice declared
    int d1,d2,d3,d4,timesplayed=0,wins=0,loses=0;
    // declared if you want to play again
    String play="y",text;
	
    //print the start instructions
    text = "   You will first roll your dice\n\nNext the outcome of your roll will be determined:\n\nany Quad and you Win\nany Triple and you Win\nany TwoPair and you Win\nany HighPair ( 4’s )and you Win\nanything else and you Lose";
    System.out.println("      Welcome to Computer Dice\n\n-----------------------------------------");
	System.out.println(text);
    System.out.println("-----------------------------------------");
    
    do {
     // dice roll
     d1 = (int)(Math.random() * 4) + 1;
     d2 = (int)(Math.random() * 4) + 1;
     d3 = (int)(Math.random() * 4) + 1;
     d4 = (int)(Math.random() * 4) + 1;
    //adds how many times played
    timesplayed++;
    
    //print total
    System.out.println("\n  Player\n" + d1 + "  " + d2 + "  " + d3 + "  " + d4);
    System.out.println("----------");
    
    //quad
    if ( d1 == d2 && d1 == d3 && d1 == d4)
    {
    System.out.println("Quad, You win!");
    wins++;
    }
    //triple
    	else if ((d1 == d2 && d1 == d3 ) || (d2 == d3 && d2 == d4) || (d1 == d4 && d1 == d2) || (d1 == d3 && d1 == d4))
    	{
    	System.out.println("Triple, You win!");
    	wins++;
    	}
		//high pair
    		else if ((d1==4 && d1 == d2) || (d1 ==4 && d1 == d3) || (d1==4 && d1 == d4) || (d2==4 && d2==d3) || (d2==4 && d2==d4) || (d3==4 && d3==d4))
    		{
    		System.out.println("High pair, You win!");
    		wins++;
    		}
    			//twos
    			else if ( d1==d2 || d1==d3 || d1==d4 || d2==d3 || d2==d4 || d3==d4)
    			{
    			System.out.println("Two pairs, You win!");
    			wins++;
    			}

    				else if ((d1 != d2 && d1 != d3 && d1 != d3) || (d2 != d3 && d2 != d4) || (d3 != d4 && d3 != d2))
    				{
    				System.out.println("Sorry, you lose!");
    				loses++;
    				}
    
    do{
    	// ask to play again
    	System.out.println("\nDo you wish to play again [y, n] :");
    	play = stdIn.next();
    	// if it is no then 
    }while ( play.toLowerCase().charAt(0) != 'n' && play.toLowerCase().charAt(0) != 'y') ;
    if (play.charAt(0) == 'n')
    {
    System.out.println("Computer Dice Results");
    System.out.println("---------------------");
    System.out.println("You played " + timesplayed + " Rounds" + "\n\nRounds won: " + wins + "\n\nRounds Lost: " + loses);
    //System.out.println("\nRounds won:" + wins );
    //System.out.println("Rounds Lost:" + loses);
    //System.out.println("---------------------");
    }
   
    }    while ( play.toLowerCase().charAt(0) == 'y'); 
				
    				
   
    // close your Scanner object after your done using it
    stdIn.close();    
  }

}