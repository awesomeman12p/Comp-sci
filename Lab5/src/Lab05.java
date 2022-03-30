import java.util.Scanner;

public class Lab05
{
  public static void main(String[] args) 
  {
    Scanner stdIn = new Scanner(System.in);
    
    //
    System.out.println("CS 201 Resturan Guide\n");
    
    //define variables
    String response;
    char s, f; // s=spicy f=fancy
    boolean spicy, fancy;

    // ask user for prefeerence
    System.out.print("Do you like spicy food? (y /n) :");
    //Get the next token
    response = stdIn.next();
    //look only at first charicter
    s = response.charAt(0);
    if (s == 'y' || s == 'Y')
      spicy = true;
    else
      spicy = false;
    
    // ask user for preferenc of fancy
    System.out.print("Do you want to go to a fancy resturant? (y / n) : ");
    //Get the token
    response = stdIn.next();
    //look only at first char
    f = response.charAt(0);
    fancy = (f == 'y') || (f == 'Y');

    //make suggestion
    if ( !spicy )
    {
        if ( fancy )
        {
            System.out.println("I suggest you go to Chez Paris");
        }
        else //not fancy  
        {
            System.out.println("I suggest you go to Joe's Diner.");    
        }
    }
    if ( spicy )
    {
        if ( fancy )
        {
            System.out.println("I suggest you go to Thai Garden Palace.");
        }
        else //not fancy 
        {
            System.out.println("I suggest you go to Alberto's tcqueria.");
        }
    }
    
      stdIn.close();
  }
}

