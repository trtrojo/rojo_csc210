//Employee
 /*
  * Employee.java -- Employee object specified in lab 6
  *
  * Tommy Rojo <tommy.rojo@stu.bmcc.cuny.edu>
  * 
  * Follow the instructions on page (BOOK 698)
  *
  * TODO: Create an employee class with name, number, hire date
  *
  * Number needs to be in format XXX-[A-M]
  *
  */

import java.util.Random;

public class Employee {
	private String firstName;
	private String lastName;
	private String employeeId;
	private String hireDate;

	public Employee(String firstName, String lastName, String hireDate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.hireDate = hireDate;
		this.employeeId = this.genEmployeeId();
	}

	/* genEmployeeId()
	 *
	 * Generates employee ID according to the format "XXX-L", where X 
	 * is a number between 0-9 and L is a letter between A-M.
	 *
	 */
	private String genEmployeeId() {
		Random rand = new Random();
		return "000-A";
	}

	/*getFirstName()
 	 *
 	 *
 	 */
	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public String getEmployeeId() {
		return this.employeeId;
	}

	public String getHireDate() {
		return this.hireDate;
	}

	/*print();
	 * function to print employee name, ID, hireDate
	 *
	 */
	public void print() {

	}

}
