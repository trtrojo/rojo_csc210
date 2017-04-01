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
		System.out.println(" What is the sentence? > hello my name is fuckyou! please, go fuck yourself. KTHXBAI!!!!.");
		
		//sentence = KeyboardInput.nextLine();
		sentence = " hello my name is no! please, go no yourself. KTHXBAI!!!!.";

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

		System.out.println("[DEBUG] TOKEN LENGTH: " + tokens.length);

		int x = 1; //capitalize next character?
		
		for (int i = 0; tokens.length > i; i++) {
		
			if (tokens[i].matches("[.?!]") || i == 0) {
				//i++; 

				//capitalize next found letter
				for (boolean c = true; c != false && tokens.length > i; i++) {
					if (tokens[i].matches("[a-zA-Z]")) {
						System.out.println("[DEBUG] FOUND TOKEN: " + tokens[i]);
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
