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
		ProductionWorker lGibbs = new ProductionWorker("Leroy", "Gibbs", "09/23/2003", "110-A", 2, 20.75);

		System.out.println("Created two objects, tSparkle and lGibbs, printing using .printEmployee()");

		tSparkle.printEmployee();
		lGibbs.printEmployee();
	}
}
