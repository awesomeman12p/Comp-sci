// <Zak Podolske>
// CS 250 <section>
// Lab Exercise 3 part a
// This program is designed to take a Fahrenheit temperature as input
// and output the equivalent Celsius temperature.
// import the Scanner class

import java.util.Scanner;
public class Lab3a
{
	public static void main(String[] args)
	{
		// Create an input scanner for keyboard
		Scanner stdIn = new Scanner(System.in);
		// Declare fahrenheit variable
		double fahrenheit;
		// Prompt for temperature in degrees Fahrenheit.
		System.out.print("Enter temperature (degrees Fahrenheit): ");

		// Get the fahrenheit value from the user
		fahrenheit = stdIn.nextDouble();

		// Declare celsius variable
		double celsius; 

		// Convert the Fahrenheit temperature to Celsius.

		celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);

		// Output the results of the conversion in this format: 
		// "<fahrenheit> degrees Fahrenheit is equal to <celsius> degrees Celsius."
		System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");

		// The values in <> are the value entered and the converted value.

		// Close the input scanner
		stdIn.close();
	}
}