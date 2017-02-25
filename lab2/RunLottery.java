//RunLottery.java

 /* 
  * Lottery Application -- Application to run.
  * Tommy Rojo <tommy.rojo@stu.bmcc.cuny.edu>
  *
  * See page 491 of the book OR view README.md to get prompt.
  *
  */

import java.util.Scanner;

public class RunLottery {

	public static void main(String[] args) {

		int[] userPickNumbers = new int[5];
		int[] lotteryNumbers = new int[5];
		int matchNum;

		Lottery LO = new Lottery();

		lotteryNumbers = LO.getWinningNumbers();

		/* The below block is for a cheater mode
		 * To activate, run with the flag --cheat
		 *
		 * usage: java RunLottery --cheat
		 */
		if (args.length != 0 && args[0].equals("--cheat")) {
			System.out.println("Cheater Mode: Random Numbers are");
			for(int x = 0; x < lotteryNumbers.length; x++) {
				System.out.print(" " + lotteryNumbers[x] + " ");
			}
			System.out.print("\n");			
		}


		System.out.println("Lottery Application");

		//getUserPickNumbers is what prompts the user
		userPickNumbers = getUserPickNumbers();
		
		//Lottery.setLotteryPicks() returns how many matching numbers.
		//this is required in the prompt.
		matchNum = LO.setLotteryPicks(userPickNumbers);

		//broke this out into a fancy thing.
		printFancyResult(userPickNumbers, lotteryNumbers, matchNum);

	}

	/* printFancyResult()
	 * 
	 * This is super ugly, but that is all graphics programming.
	 * 
	 * Printing the fancy boxes for the lottery numbers were broken out
	 * into a separate function: printBoxyNumbers(int[] array).
	 *
	 * usage: printFancyResults(int[] userNumbersArray, 
	 * 				int[] winningNumbersArray, int MatchingNumberCount);
	 *
	 * TODO: Find a way to make nicer.
	 */
	public static void printFancyResult(int[] userPickNumbers, int[] lotteryNumbers, int matchNum) {

		System.out.println("--------------------------------------------------");

		if (matchNum == 0) {
			System.out.println("Sorry! You did not get any matching numbers, try again!");
			System.out.println("Your Numbers were:");
			printBoxyNumbers(userPickNumbers);
			System.out.println("The Winning Numbers are:");
			printBoxyNumbers(lotteryNumbers);
			System.out.println("Thanks for Playing!");
		}
		else if (matchNum > 0 && matchNum < lotteryNumbers.length) {
			System.out.println("You win with " + matchNum + " correct results!");
			System.out.println("Your Numbers:");
			printBoxyNumbers(userPickNumbers);
			System.out.println("The Winning Numbers are:");
			printBoxyNumbers(lotteryNumbers);
			System.out.println("Thanks for Playing!");
		}
		else {
			System.out.println("You are a GRAND PRIZE WINNER!");
			System.out.println("The Winning Numbers were:");
			printBoxyNumbers(lotteryNumbers);
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
		String topbar = "-"; //top bar where ---- go
		String data = "|"; //where numbers go
		String bottombar = "-"; //bottom bar where --- go
		for (int x = 0; x < numbers.length; x++) {
			topbar = topbar + "----";
			data = data + " " + numbers[x] + " |";
			bottombar = bottombar + "----";
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
			else { m = "What is your " + (x + 1) + "th pick?"; }

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
	 * String prompt - question to prompt user with
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
