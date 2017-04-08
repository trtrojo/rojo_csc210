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

public class Employee {
	private String firstName;
	private String lastName;
	private String employeeNumber;
	private String hireDate;

	public Employee(String firstName, String lastName, String hireDate, String employeeNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.hireDate = hireDate;
		this.employeeNumber = employeeNumber;
	}

	/*
 	 * Returns Employee's first name (as String)
 	 *
 	 */
	public String getFirstName() {
		return this.firstName;
	}

	/*
 	 * Sets Employee's first name
 	 *
 	 * @param firstName - sets employee first name
 	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/*
 	 * Returns employee's last name (as String)
 	 */

	public String getLastName() {
		return this.lastName;
	}

	/*
 	 * Sets employee's last name
 	 * 
 	 * @param lastName - sets last name
 	 */
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/*
 	 * Returns employee's formatted number (as String)
 	 */
	public String getEmployeeNumber() {
		return this.employeeNumber;
	}

	/*
 	 * Sets new employee number
 	 */
	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	/*
 	 * Returns employee's hire date (MM/DD/YYYY)
 	 */

	public String getHireDate() {
		return this.hireDate;
	}

}
