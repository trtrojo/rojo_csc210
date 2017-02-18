//Lottery.java

 /*
  * Lottery Application
  *
  * Tommy Rojo <tommy.rojo@stu.bmcc.cuny.edu>
  *
  * External lottery class to do all of the arethmetic
  *
  */

import java.util.Random;

public class Lottery {
Random rand = new Random();
private int[] lotteryNumbers = new int[5];

	public Lottery() {
		for (int i = 0; i < lotteryNumbers.length; i++) {
			lotteryNumbers[i] = rand.nextInt(9);
		}
	}

	/* setLotteryPicks(int userPicks[]);
	 * 
	 * Gets the user's lottery pick numbers to compare with the random
	 * numbers generated in the constructor. Returns an int with the
	 * number of matching numbers.
	 *
	 * usage: int x = setLotteryPicks(userpicks[]);
	 *
	 */
	public int setLotteryPicks(int[] userPicks) {

		int matchNumbers = 0;

		for (int i = 0; i < lotteryNumbers.length; i++) {
			if (lotteryNumbers[i] == userPicks[i]) {
				matchNumbers++;
			}
		}
		
		return matchNumbers;
	}

	/* getWinningNumbers()
	 * 
	 * Gets the winning numbers generated in the constructor. Returns
	 * an array int.
	 *
	 * Usage: int 
	 *
	 */

	public int[] getWinningNumbers() {
		return lotteryNumbers;
	}
}
