/*
 Put comment block here
*/

// import the Scanner class for use in this program
import java.util.Scanner;

public class program07
{

  public static void main (String[] args)
  {
    // create and initialize a Scanner object for use in this method ONLY
    Scanner stdIn = new Scanner(System.in);
        
 
    // Your code here
    //dice declared p=player o=computer
    int pd1,pd2,pd3,od1,od2,od3,winsplayer=0,computer=0,ties=0;
    // declared if you want to play again
    String play="y",text;
	
    //print the start instructions
	text = "	        Welcome to Opponent Dice \n---------------------------------------------------------/nYou will be playing dice against the opponent/nHigh beats low, and same ties/nTriples beat Pairs and Junk/nPairs beat Junk/nIn the case of two identical Pairs - high card decides/nin the case of two Junks - its a tie/n---------------------------------------------------------";
    System.out.println(text);

    do {
     // dice roll
     pd1 = (int)(Math.random() * 6) + 1;
     pd2 = (int)(Math.random() * 6) + 1;
     pd3 = (int)(Math.random() * 6) + 1;
	 od1 = (int)(Math.random() * 6)  + 1;
	 od2 = (int)(Math.random() * 6)  + 1;
	 od3 = (int)(Math.random() * 6)  + 1;
     
    //adds how many times played
    //timesplayed++;
    
    //print total
    System.out.println("\n  Player\n" + pd1 + "  " + pd2 + "  " + pd3);
    System.out.println("----------");

	System.out.println("\n  Computer\n" + od1 + "  " + od2 + "  " + od3);
	System.out.println("----------");
    
	 //triple 
	 if ((od1==od2 && od1==od3) && (pd1!=pd2))
    	{
    	System.out.println("Triple, Computer wins");
    	computer++;
    	}
	 //triple humman 
		else if ((pd1==pd2 && pd1==pd3)&& (od1 != od2))
		{
		System.out.println("Triple, You win!");
		winsplayer++;
		}
			else if ((pd1==pd2 && pd1==pd3) && (od1==od2 && od1==od3) && (od1==pd1))
			{
			System.out.println("Triple tie");
			ties++;
			}
    			//twos computer computer won but it does not say anything fix both twos
    			else if ((od1==od2) || (od1==od3) || (od2==od3) && (pd1!=pd2 || pd1!=pd3 || pd2 !=pd3) && (pd1!=pd2 && pd1!=pd3 && pd2!=pd3) && (pd1+pd2<od1+od2 && pd2+pd3<od3+od2 && pd3+pd1<od3+od1))
    			{
    			System.out.println("computer wins pair");
    			computer++;
    			}
				  //twos humman
				  else if ((pd1==pd2 || pd1==pd3 || pd2==pd3 ) && (od1!=od2 || od1!=od3 || od2!=od3))
				  {
				  System.out.println("You Win pair");
				  winsplayer++;
				  }
				 
				 
				 	 //twos tie
    				else if ( (od1==pd1 && od2==pd2 && od2==od3 || od1==od2) || (od3==pd3 && od2==pd2 || od1==od2) || (od1==pd1 && od3==pd3 || od1==od2))
    				{
    				System.out.println("Tie");
    				ties++;
    				}
						//junk human
						else if ((od1!=od2 && od1!=od3 && od2!=od3) && (pd1!=pd2 && pd1!=pd3 && pd2!=pd3) && (pd1+pd2+pd3 > od1+od2+od3))
						{
						System.out.println("Junk you win!");
						winsplayer++;
						}
							//junk computer
							else if ((od1!=od2 && od1!=od3 && od2!=od3) && (pd1!=pd2 && pd1!=pd3 && pd2!=pd3) && (pd1+pd2+pd3 < od1+od2+od3))
							{
							System.out.println("Junk Computer wins :(");
							computer++;
							}
    
	
	//do you want to play again
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
    System.out.println("Rounds won " + winsplayer + "\n\nRounds tied: " + ties + "\n\nRounds Lost: " + computer);
    }
   
    }    while ( play.toLowerCase().charAt(0) == 'y'); 
				
    				
   
    // close your Scanner object after your done using it
    stdIn.close();    
  }

}