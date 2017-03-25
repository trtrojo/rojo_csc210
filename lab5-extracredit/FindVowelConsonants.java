//FindVowelConsonants.java

/*FindVowelConsonants.java - STATIC class to find vowels.
 *
 * Tommy Rojo <tommy.rojo@stu.bmcc.cuny.edu>
 *
 * Follow the instructions on page (Book:609 PDF: 646) for details.
 *
 */


public class FindVowelConsonants {

	/**
	 * Finds the vowels in a given string. Returns an int with the number
	 *
	 * @param str - Input string to be considered
	 */
	public static int findVowels(String str) {
		int count = 0;
		String[] tokens = str.split("");
		for (int i = 0; i < tokens.length; i++) {
			if (tokens[i].matches("[a,e,i,o,u]")) {
				count++;
			}
		}
		return count;
	}

	/**
 	 *
 	 * Finds the Consonants in a given string. Returns an int with the number.
 	 *
 	 * @param str - Input string to be considered
 	 */
	public static int findConsonants(String str) {
		String[] tokens = str.split("");
		return tokens.length - findVowels(str);
	}


}
