//SentenceCapitalizer.java
 /* SentenceCapitalizer.java -- Capitalize Sentences of String objects.
  *
  * Tommy Rojo <tommy.rojo@stu.bmcc.cuny.edu>
  *
  * Follow the insturctions on (Book 608, PDF 645)
  *
  * This is the only class as the prompt does not specify to break this out
  * to a separate class/object.
  *
  */

import java.util.Scanner;
import java.lang.*;

public class SentenceCapitalizer {

	public static void main(String[] args) {
		String sentence; //stores original sentence
	
		System.out.println("Sentence Capitalizer class");
		
		Scanner KeyboardInput = new Scanner(System.in);
		System.out.print("What is the sentence? > ");
		
		sentence = KeyboardInput.nextLine();

		if (isValid(sentence)) {
			System.out.println(capitalizeSentence(sentence));
		}
		 else {
			System.out.println("Invalid string, try again.");
		}
	}

	/**
	 * Capitalizes the sentence of input type string.
	 *
	 * Didnt realize until it was too late that using char to do anything
	 * would suck.
	 * 
	 * @param str - String to capitalize.
	 */

	public static String capitalizeSentence(String str) {
	
		StringBuilder strIn = new StringBuilder(str);
		
		String[] tokens = str.split("");

		for (int i = 0; tokens.length > i; i++) {
		
			if (tokens[i].matches("[.?!]") || i == 0) {
				//capitalize next found letter
				//c = capitalize next letter?
				//need to add bounds checking
				for (boolean c = true; c != false && tokens.length > i; i++) {
					if (tokens[i].matches("[a-zA-Z]")) {
						System.out.println("[DEBUG] FOUND TOKEN: " + tokens[i]);

						//this is so fucking terrible
						strIn.replace(i,i + 1, tokens[i].substring(0,1).toUpperCase());
						c = false;
					}
				}
			}

		}

		return strIn.toString();

	}

	/**
	 *
	 * Makes sure input string is valid
	 * returns true if yes, false if no
	 *
	 * will look for 0 length strings
	 *
	 * TODO: Search for non-alphabetical first length strings
	 *
	 * @param str - string to validate
	 */

	public static boolean isValid(String str) {

		if (str.length() == 0) {
			return false;
		}
		 else {
			return true;
		}
	}

}
