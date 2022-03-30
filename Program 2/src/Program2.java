/*
  Zak Podolske 
  Your Section Number
 
  A short description of proram's purpose here ...
*/

public class Program2 
{ // begin class
  
  public static void main( String[] args )
  { // begin main method
	  Scanner stdIn = new Scanner(System.in);
	  double length, width;
	  double floorSpace = 0;
	  char response;
	  do 
	  {
	  System.out.print("Enter the length: "); length = stdIn.nextDouble(); System.out.print("Enter the width: "); width = stdIn.nextDouble();
	  floorSpace += length * width; System.out.print("Any more rooms? (y/n): "); response = stdIn.next().charAt(0);
	  } while (response == 'y' || response == 'Y');

	  System.out.println("Total floor space is " + floorSpace);
  
  
  
  
  } // end main method
  
} // end class
