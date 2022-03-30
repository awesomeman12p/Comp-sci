/*
  Zak Podolske 
  Section 401/824
 */

import java.util.Scanner;

public class Program3
{ // begin class
  
  public static void main( String[] args )
  { // begin main method
	  //scanner use
	  Scanner stdIn = new Scanner(System.in);
	  
	  //double definitions 
	  double length, width, height;
	  double roomsa = 0;
	  double wallsa = 0;
	 
	  //Input commands
	  System.out.print("Enter the length: "); 
	  length = stdIn.nextDouble(); 
	  stdIn.nextLine();
	  System.out.print("Enter the width: "); 
	  width = stdIn.nextDouble();
	  stdIn.nextLine();
	  System.out.print("Enter the Height: "); 
	  height = stdIn.nextDouble();
	  stdIn.nextLine();
	  System.out.print("Enter units: "); 
	  String response = stdIn.nextLine();
	  
	  

	  //Wall and room storage location 
	  roomsa += length * width; 
	  wallsa += (width + length + width + length)* height; 

	  //Outputs
	  System.out.println("The rooms floor surface area is : " + roomsa + " " + response + " Squared.");  
	  System.out.println("The room’s walls total surface area is : " + wallsa + " " + response + " Squared.");
	 
	  //Finish input methods
	  stdIn.close();    
  
  } // end main method
  
} // end class

