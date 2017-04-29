//DemoCustomer.java
 /*
  * DemoCustomer.java
  *
  * Tommy Rojo <tommy.rojo@stu.bmcc.cuny.edu>
  *
  * Follow the instructions on page (BOOK 699), Project 7:
  * "Person and Customer Classes"
  *
  *
  */

public class DemoCustomer {

	public static void main(String[] a) {

		Customer tSparkle = new Customer("Twilight", "Sparkle", "199 Chambers St. New York, NY 10019", "2122208000", "0001", true);
		
		tSparkle.print();

		//Line break~
		System.out.println("\n");

		System.out.println("Setting customer opt in to false");
		tSparkle.setCustOptIn(false);

		System.out.println("Setting telephone number to 0000000000");
		tSparkle.setTelephone("0000000000");

		System.out.println("Setting new address to 123 fake st.");
		tSparkle.setAddress("123 Fake St");

		System.out.println("Setting new customer number of 9999");
		tSparkle.setCustNumber("9999");
		
		//LINE BREAK~
		System.out.println("\n");


		System.out.println("Printing new stuff");
		tSparkle.print();

		
	}

}
