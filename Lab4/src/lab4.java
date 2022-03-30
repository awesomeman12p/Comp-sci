import java.util.Scanner;

public class lab4 {



		  public static void main (String[] args)
		  {
		    // create and initialize a Scanner object for use in this method ONLY
		    Scanner stdIn = new Scanner(System.in);
		    double penstotal,subtotal,saletax,finaltotal;
		    int pens,notebooks;
		    
			//welcome
		    System.out.println("Welcome to the office");
		    
		    //ask about pens
		    System.out.print("How many pens? ");
		    pens = stdIn.nextInt();
		    stdIn.nextLine();
		    
		    System.out.print("How many notebooks? ");
		    notebooks = stdIn.nextInt();
		    stdIn.nextLine();
		    
		    //Define totals
		    penstotal= (pens * 0.5);
		    subtotal = (penstotal + notebooks);
		    saletax = (subtotal * 0.055);
		    finaltotal = (subtotal + saletax);
		    //total 
		    System.out.println("Thank you, your bill is as follows ...\n");
		    System.out.println("Pens: $" + penstotal);
		    System.out.println("Notebooks: $" + notebooks + "\n");
		    System.out.println("Subtotal: $" + subtotal);
		    System.out.println("Sales tax: $" + saletax + "\n");
		    System.out.println("Grand-Total: $" + finaltotal);
		    
		    
		    
		      
		    // close your Scanner object after your done using it
		    stdIn.close();    		
	}

}
