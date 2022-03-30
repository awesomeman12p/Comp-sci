package lab6;

import java.net.CacheRequest;

/*
 Put comment block here
*/

// import the Scanner class for use in this program
import java.util.Scanner;

public class lab06
{

  public static void main (String[] args)
  {
    // create and initialize a Scanner object for use in this method ONLY
    Scanner stdIn = new Scanner(System.in);
        
 
    // Your code here
    int glasses, type;
    double cost, coat, total;

    cost = 0;
    System.out.print("What kind of glasses would you like:\n1 -> prescription, 2 -> non-prescription :");
    glasses = stdIn.nextInt();
    
    while (glasses !=1 && glasses !=2)
    {
      System.out.println("What kind of glasses would you like:\n1 -> prescription, 2 -> non-prescription :");
      glasses = stdIn.nextInt();
    }
    coat = 0;
    System.out.println("What kind of coating would you like:\n1 -> anti-glare, 2 -> brown tint :");
    type = stdIn.nextInt();
    
    while ( type !=1 && type !=2 )
    {
      System.out.println("What kind of coating would you like:\n1 -> anti-glare, 2 -> brown tint :");
      type = stdIn.nextInt();
    }


    //if statments 
    if ( glasses == 1)
    {
      cost += 40.0;
    }
    else
    {
      cost += 25.0;
    }
    if ( type == 1)
    {
      cost += 12.5;
    }
   else
    {
      cost += 9.99;
    }
   

    //print total
    System.out.println("Your total is $" + (cost + coat));

    // close your Scanner object after your done using it
    stdIn.close();    
  }

}