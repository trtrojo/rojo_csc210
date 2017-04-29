//DemoEmployee.java
 /* DemoEmployee.java -- tests Employee, ProductionWorker class
  *
  * Tommy Rojo <tommy.rojo@stu.bmcc.cuny.edu>
  *
  * Follow the instructions on page (Book 698)
  *
  * This will demonstrate the class as specified by the assignment
  *
  * NOTE: Employee -> ProductionWorker -> DemoEmployee
  */


public class DemoEmployee {
	public static void main(String[] a) {
		ProductionWorker tSparkle = new ProductionWorker("Twilight", "Sparkle", "02/10/2011", "025-E", 1, 18.25);
		
		System.out.println("Created tSparkle object, Printing object using .printEmployee()");
		tSparkle.printEmployee();
		System.out.print("\n\n");

		System.out.println("Setting Shift to 2 (night shift)");
		tSparkle.setShift(2);
		System.out.println("New Shift ID is: " + tSparkle.getShift() + "\n");
		
		System.out.println("Setting payrate to $20.00/hr");
		tSparkle.setHourPayRate(20.00);
		System.out.println("New Pay Rate is: " + tSparkle.getHourPayRate() + "\n");

		System.out.println("Setting name to Rainbow Dash");
		tSparkle.setFirstName("Rainbow");
		tSparkle.setLastName("Dash");
		System.out.println("New name is " + tSparkle.getFirstName() + " " + tSparkle.getLastName() + "\n");

		System.out.println("Returning all employee details:");
		tSparkle.printEmployee();

		System.out.println("done.");


	}
}
