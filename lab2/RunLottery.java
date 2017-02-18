//RunLottery.java

 /* 
  * Lottery Application -- Application to run.
  *
  * See page 491 of the book OR view README.md to get prompt.
  *
  */

import java.util.Scanner;

public class RunLottery {

	public static void main(String[] args) {

		int[] userPickNumbers = new int[5];
		int[] winRandNumbers = new int[5];

		Lottery LO = new Lottery();

		winRandNumbers = LO.getWinningNumbers();


		/* The below block is for a cheater mode
		 * 
		 * To activate, run with the flag --cheat
		 * 
		 * usage: java RunLottery --cheat
		 */

		if (args.length != 0 && args[0].equals("--cheat")) {
			System.out.println("Cheater Mode: Random Numbers are");
			for(int x = 0; x < winRandNumbers.length; x++) {
				System.out.print(" " + winRandNumbers[x] + " ");
			}
			System.out.print("\n");			
		}


		System.out.println("Lottery Application");
		userPickNumbers = getUserPickNumbers();
		int matchNum = LO.setLotteryPicks(userPickNumbers);

		//broke this out into a fancy thing.
		printFancyResult(userPickNumbers, winRandNumbers, matchNum);

	}

	/* printFancyResult()
	 *
	 *
	 *
	 */
	public static void printFancyResult(int[] userPickNumbers, int[] winRandNumbers, int matchNum) {

		System.out.println("--------------------------------------------------");

		if (matchNum == 0) {
			System.out.println("Sorry! You did not get any matching numbers, try again!");
			System.out.println("The Winning Numbers are:");
			printBoxyNumbers(winRandNumbers);
			System.out.println("Thanks for Playing!");
		}
		else if (matchNum > 0 && matchNum < winRandNumbers.length) {
			System.out.println("You win with " + matchNum + " correct results!");
			System.out.println("The Winning Numbers are:");
			printBoxyNumbers(winRandNumbers);
			System.out.println("Thanks for Playing!");
		}
		else {
			System.out.println("You are a GRAND PRIZE WINNER!");
			System.out.println("The Winning Numbers were:");
			printBoxyNumbers(winRandNumbers);
			System.out.println("Thanks for Playing!");
		}
	}

	/* printBoxyNumbers(int[] numbers)
	 *
	 * Prints boxy numbers to stdout. no code output.
	 * 
	 * usage: printBoxyNumbers(numbers)
	 */

	public static void printBoxyNumbers(int[] numbers) {
		String topbar = ""; //top bar where ---- go
		String data = "|"; //where numbers go
		String bottombar = ""; //bottom bar where --- go

		for (int x = 0; x < numbers.length; x++) {

		topbar = topbar + "-----";
		data = data + " " + numbers[x] + " |";
		bottombar = bottombar + "-----";
		
		}

		System.out.println(topbar);
		System.out.println(data);
		System.out.println(bottombar);

	}


	/* getUserPickNumbers(int length)
	 *
	 * Prompt the user for lottery pick numbers. returns an int array.
	 *
	 * int length - How many numbers to get from the user.
	 *
	 * usage: int[] x = getUserPickNumbers()
	 *
	 */
	public static int[] getUserPickNumbers() {
		int numbers[] = new int[5];
		String m; //Defines message string to give to the user.

		for(int x = 0; x < numbers.length; x++) {
			if (x == 0) { m = "What is your 1st pick?"; }
			else if (x == 1) { m = "What is your 2nd pick?"; }
			else if (x == 2) { m = "What is your 3rd pick?"; }
			else { m = "What is your " + x + "th pick?"; }

			numbers[x] = getIntInput(m);
			
			while (numbers[x] > 10) {
				System.out.println("Invalid number, please try again!");
				numbers[x] = getIntInput(m);
			}
		}

		return numbers;		

	}


	/* getIntInput(String prompt)
	 *
	 * Prints a prompt from a string on screen and returns an int
	 * 
	 * usage: int x = getIntInput("Hello World!");
	 *
	 */
	public static int getIntInput(String prompt) {
		Scanner KeyboardInput = new Scanner(System.in);
		System.out.print(prompt + " > ");

		return (KeyboardInput.nextInt());
	}



}