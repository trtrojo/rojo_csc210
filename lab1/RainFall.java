//Rainfall.java - rainfall class

/* RainFall -- RainFall Calculator Class
 *
 * Tommy Rojo <tommy.rojo@stu.bmcc.cuny.edu>
 *
 * See CalcRainfall.java for prompt
 *
 * This is the RainFall class that will do all the math in the prompt
 */

public class RainFall {
	//going to share the array between all functions in the class
	private double [] rainFallArray;

	public RainFall(double RFArray[]) {
		//this.rainFallArray = rainFallArray; //this is bad. Why?
		
		rainFallArray = new double[RFArray.length];
		for (int i = 0; i < RFArray.length; i++) {
			rainFallArray[i] = RFArray[i];
		}
	}

	/* getYearRainFall()
	 * 
	 * Adds up all of the totals in the array and returns as a double
	 * NOTE: You need to initalize the class with the array before this works.
	 *
	 * usage: double x = getYearRainFall();
	 */

	public double getYearRainFall() {
		double totalRainFall = 0.0;

		for(int currMonth = 0; currMonth < rainFallArray.length; currMonth++) {
			totalRainFall = (totalRainFall + rainFallArray[currMonth]);
		}

		return totalRainFall;
	}

	/* getAvgRainFall()
	 *
	 * Gets the average based on the array given in the constructor. Returns
	 * as a double.
	 * 
	 * usage: double x = getAvgRainFall()
	 * TODO: make the array length variable
	 */

	public double getAvgRainFall() {
		return ((getYearRainFall()) / 12.0);
	}

	/* getLowestRainFall()
 	 *
 	 * Gets the lowest rainfall on record. Returns as a double.
 	 *
 	 * usage: double x = getLowestRainFall();
 	 *
 	 * TODO: Get the month out as well.
 	 */
	public double getLowestRainFall() {
		double lowestRainFall = rainFallArray[0];

		for (int currMonth = 0; currMonth < rainFallArray.length; currMonth++) {
			if (rainFallArray[currMonth] < lowestRainFall) {
				lowestRainFall = rainFallArray[currMonth];
			}
		}
		
		return lowestRainFall;
	}

	/* getHighestRainFall()
	 *
	 * Gets the highest rainfall on record. Returns as a double.
	 *
	 * usage: double x = getHighestRainFall();
	 *
	 * TODO: Get the month as well.
	 */

	public double getHighestRainFall() {
		double highestRainFall = rainFallArray[0];

		for (int currMonth = 0; currMonth < rainFallArray.length; currMonth++) {
			if (rainFallArray[currMonth] > highestRainFall) {
				highestRainFall = rainFallArray[currMonth];
			}
		}
		return highestRainFall;
	}

}
