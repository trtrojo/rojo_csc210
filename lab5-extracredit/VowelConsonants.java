//VowelConsonants.java

 /*VowelConsonants.java -- Counts the number of vowels and consonants
 *
 * Tommy Rojo <tommy.rojo@stu.bmcc.cuny.edu>
 *
 * Follow the instructions on page (BOOK:609, PDF:646) for instructions
 *
 * This is assignment 4, Vowels and Consonants
 *
 * This is the menu class, driver class will be FindVowelConsonants
 */

import java.util.Scanner;

public class VowelConsonants {

	public static void main(String args[]) {
		
		System.out.println("Vowels And Consonants");
		String sentence = getStringInput("What is the string?");
		while (true) {
			switch(displayMenu()) {
				case 'a':
					System.out.println("The number of Vowels is " + 
						+ FindVowelConsonants.findVowels(sentence));
					break;
				case 'b':
					System.out.println("The number of Consonants is "
						+ FindVowelConsonants.findConsonants(sentence));
					break;
				case 'c':
					System.out.println("The number of Vowels is "
						+ FindVowelConsonants.findVowels(sentence));
					System.out.println("The number of Consonants is "
						+ FindVowelConsonants.findConsonants(sentence));
					break;
				case 'd':
					sentence = getStringInput("What is the NEW String?");
					break;
				case 'e':
					System.exit(0);
				default:
					System.out.println("Invalid Option, try again.");
			}
		}
	}

	/**
 	 *Displays a menu and returns a char with whatever the user wants
	 *
	 */
	public static char displayMenu() {

		System.out.println("Please make a selection");
		System.out.println("a. Count the number of vowels in the string");
		System.out.println("b. Count the number of consonants in the string");
		System.out.println("c. Count both the vowels and consonants in the string");
		System.out.println("d. Enter another string");
		System.out.println("e. Exit the program");

		return (getStringInput("Option?").charAt(0));
	}

	/**
 	 * Prompts the user for an input and returns a string.
 	 *
 	 * @param prompt - question to ask user
 	 */
	public static String getStringInput(String prompt) {
		Scanner KeyboardInput = new Scanner(System.in);
		System.out.print(prompt + " > ");
		return (KeyboardInput.nextLine());
	}
}
