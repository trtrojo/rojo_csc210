//CalcRainFall.java - calcrainfall class

 /* CalcRainFall -- Rainfall Calculator
 *
 * Tommy Rojo <tommy.rojo@stu.bmcc.cuny.edu>
 *
 * Follow the instructions on page 488/525(pdf) to create a rainfall
 * calculator. Instructions below.
 *
 * Write a RainFall class that stores the total rainfall for each of the 12 
 * months into an array of doubles. The program should have the methods that
 * return the following:
 *  - The total rainfall for the year
 *  - The average monthly rainfall
 *  - The month with the most rain
 *  - The month with the least rain
 *
 *  Demonstrate the class in a complete program
 *
 *  **Input Validation: Do not accept negative numbers for monthly rainfall
 *    figures.
 *
 *    This is the main application for the user
 *
 */

import java.util.Scanner;
import java.text.DecimalFormat; //module to truncate numbers

public class CalcRainFall {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("###.##");
	
		System.out.println("Rainfall Challenge -- Page 488/525 of text");
		System.out.println("Stores Rainfall for 12 months into an array of doubles");

		double rfArray[] = getRainFallArray();

		RainFall RF = new RainFall(rfArray);

		/*
		 * The prompt did not specify what really to do with the data
		 * so until something is said, just print it all out.
		 *
		 * NOTE: using df.format to make pretty.
		 *
		 */
		System.out.println("The total yearly rainfall is " + df.format(RF.getYearRainFall()));
		System.out.println("The average rainfall is " + df.format(RF.getAvgRainFall()));
		System.out.println("The lowest rainfall on record is " + RF.getLowestRainFall());
		System.out.println("The Highest rainfall on record is " + RF.getHighestRainFall());
		
	}

	/* getRainFallArray();
	 *
	 * Prompts the user for the rainfall for 12 months and returns a 
	 * double array.
	 *
	 * usage: double rainFallArray[] = getRainFallArray();
	 * TODO: Give number to allow arbitrary amount of months
	 */

	public static double[] getRainFallArray() {
		double[] rainFallArray = new double[12];
		
		for (int month = 0; month < 12; month++) {

			//Builds grammatically correct question and stores into rfPrompt
			String rfPrompt;
			double rfCurrMonth;

			if (month == 0) { rfPrompt = "What is the rainfall for the 1st month?"; }
			else if (month == 1) { rfPrompt = "What is the rainfall for the 2nd month?"; }
			else if (month == 2) { rfPrompt = "What is the rainfall for the 3rd month?"; }
			else { rfPrompt = "What is the rainfall for the " + (month + 1) + "th month?"; }

			rfCurrMonth = getDoubleInput(rfPrompt); //storing into a variable for input validation

			//Input validation: Amount cannot be less than 0
			while (rfCurrMonth < 0.0) {
				System.out.println("Rainfall amount cannot be less than 0. Try again.");
				rfCurrMonth = getDoubleInput(rfPrompt);
			}
			
			rainFallArray[month] = rfCurrMonth;
		}
			
		
		return rainFallArray;
	}


	/* getDoubleInput(prompt)
 	 *
 	 * prints a prompt based on the question and returns a double
 	 *
 	 * usage: double x = getDoubleInput("How much are you in debt?");
 	 */
	public static double getDoubleInput(String prompt) {

		Scanner KeyboardInput = new Scanner(System.in);
		System.out.print(prompt + " > ");

		return (KeyboardInput.nextDouble());
	}

}


