



// import the Scanner class for use in this program
import java.util.Scanner;

public class program03
{
  public static void main (String[] args)
  {
    // create and initialize a Scanner object for use in this method ONLY
    Scanner stdIn = new Scanner(System.in);
        
 
    // Your code here
    String firstName, lastName;
 
    int earned;
    int innings; 
    double era; 

    System.out.print("Enter Pitcher First Name: "); 
    firstName = stdIn.toString();
    stdIn.nextLine();
    System.out.print("Enter Pitchers Last Name:");
    lastName = stdIn.toString();
    stdIn.nextLine();
    System.out.print("Enter the Pitcher's number of earned runs:");
    earned = stdIn.nextInt();
    stdIn.nextLine();
    System.out.print("Enter number of innings pitched:");
    innings = stdIn.nextInt();
    stdIn.nextLine();

 //calcualtion
 era = (earned * 9.0) / innings;
 
//outputs
 System.out.println(firstName + " " + lastName + " has an ERA of " + era);
    
 
    // close your Scanner object after your done using it
    stdIn.close();    
  }
}