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
	public ProductionWorker(String firstName, String lastName, String hireDate) {
		super(firstName, lastName, hireDate);
	}

	public void print() {
		System.out.print(super.getFirstName());
	}
}
