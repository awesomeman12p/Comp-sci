// import the Scanner class for use in this program
import java.util.Scanner;

public class program05
{

  public static void main (String[] args)
  {
    // create and initialize a Scanner object for use in this method ONLY
    Scanner stdIn = new Scanner(System.in);
        
 
  // Your code here
  int resultSoFar=0;
  String input=" ",Bitstring="",text;
  
  
  //define text
  text ="0 -> Shift Left, Add 0\n1 -> Shift Left, Add 1\n2 -> Exit, Evaluate\nChoose an operator from the menu above :";
  

  while ( input.charAt(0) != '2' )
  {
	//print
    System.out.print(text);
    input = stdIn.nextLine();
    //if statments 
    if ( input.charAt(0) == '0' )
    {
      Bitstring = Bitstring + "0";
      resultSoFar = 2*resultSoFar;
    }
      //if 1 is entered
      else if ( input.charAt(0) == '1' )
      {
        Bitstring = Bitstring + "1";
        resultSoFar = 2*resultSoFar + 1;
      }
      System.out.print(Bitstring + " = " + resultSoFar);
  }
  
      
  stdIn.close(); 
  
      

    // close your Scanner object after your done using it
  }

}