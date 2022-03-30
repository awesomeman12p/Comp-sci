import java.util.Scanner;

public class program33 {

	public static void main(String[] args) {
		
	    Scanner stdIn = new Scanner(System.in);


		//define variables 
		String firstName;
		String lastName;
	    int earned;
	    int innings; 
	    double era; 
		
		//inputs
	    System.out.print("Enter Pitcher First Name: "); 
	    firstName = stdIn.next();
	    stdIn.nextLine();
	    System.out.print("Enter Pitchers Last Name: ");
	    lastName = stdIn.next();
	    stdIn.nextLine();
	    System.out.print("Enter the Pitcher's number of earned runs: ");
	    earned = stdIn.nextInt();
	    stdIn.nextLine();
	    System.out.print("Enter number of innings pitched: ");
	    innings = stdIn.nextInt();
	    stdIn.nextLine();

	 	//calclations 
	 	era = ((double)earned *9)/innings;
	 
		//outputs
		System.out.println(firstName + " " + lastName + " has an ERA of " + era);
	    
		// close your Scanner object after your done using it
	    stdIn.close();    
	}

}
