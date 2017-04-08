//ProductionWorker.java
 /* ProductionWorker.java -- Tracking Employee Salaries
  *
  * Tommy Rojo <tommy.rojo@stu.bmcc.cuny.edu>
  *
  * Follow the instructions on (Book 698)
  *
  * Implements the Employee.java class
  *
  */

public class ProductionWorker extends Employee {

	private int shift; //1 for day, 2 for night
	private double hourPayRate;

	/* Constructor
 	 *
 	 * Passes most of the params to the parent class (Employee)
 	 *
 	 * @param firstName - first name of employee
 	 * @param lastName - last name of employee
 	 * @param hireDate - hiring date
 	 * @param employeeNumber - Formatted Employee Number
 	 * @param shift - Shift ID (1 for day, 2 for night)
 	 * @param hourPayRate - Hourly Pay Rate
 	 *
 	 */
	public ProductionWorker(String firstName, String lastName, String hireDate, String employeeNumber,
				int shift, double hourPayRate) {

		super(firstName, lastName, hireDate, employeeNumber);
		this.shift = shift;
		this.hourPayRate = hourPayRate;

	}

	/*
  	 * Returns the shift ID (as int)
  	 */

	public int getShift() {
		return shift;
	}

	/*
 	 * Sets new shift ID
 	 *
 	 * @param shift
 	 */
	public void setShift(int shift) {
		this.shift = shift;
	}
	
	/* 
 	 * Returns the hourly pay rate (as double)
 	 *
 	 */
	public double getHourPayRate() {
		return hourPayRate;
	}

	/*
 	 * sets new hourly pay rate
 	 *
 	 * @param hourPayRate
 	 */
	public void setHourPayRate(double hourPayRate) {
		this.hourPayRate = hourPayRate;
	}

	/* 
 	 * Prints formatted employee details
 	 *
 	 */	
	
	public void printEmployee() {	
		System.out.println("Employee Details");
		System.out.println("\tFirst Name: " + getFirstName());
		System.out.println("\tLast Name: " + getLastName());
		System.out.println("\tHire Date: " + getHireDate());
		System.out.println("\tEmployee Number: " + getEmployeeNumber());
		System.out.println("\tShift ID: " + getShift());
		System.out.println("\tHourly Pay Rate: " + getHourPayRate());
	}

}
