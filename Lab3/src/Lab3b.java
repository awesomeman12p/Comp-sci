// <Zak Podolske>
// CS 250 <section>
// Lab Exercise 3 part b
// This program is designed to take a Celsius temperature as input
// and output the equivalent Fahrenheit temperature.
// import the Scanner class

import java.util.Scanner;

public class Lab3b
{
  public static void main(String[] args)
  {
    // Create an input scanner for keyboard
    Scanner stdIn = new Scanner(System.in);

    // Declare celsius variable
	  double celsius;
    // Prompt for temperature in degrees Celsius.
      System.out.print("Enter temperature (degrees Celsius): ");

    // Get the Celsius value from the user
      celsius = stdIn.nextDouble();

 // Declare fahrenheit variable
	  double fahrenheit; 
// Convert the Celsius temperature to Fahrenheit.
	   fahrenheit =(( (celsius + 32.0)) * 9/5);

        
	  // Output the results of the conversion in this format:
         // "<celsius> degrees Celsius is equal to <fahrenheit> degrees Fahrenheit."
	   System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
         // The values in <> are the value entered and the converted value.
        
	   // Close the input scanner
	    stdIn.close();

} 
  }