//Customer.java
 /* Customer.java
  * 
  * Tommy Rojo <tommy.rojo@stu.bmcc.cuny.edu>
  *
  * Follow the instructions on (BOOK 699)
  *  "Person and Customer Classes" (Assignment 7)
  *
  */

public class Customer extends Person {
//TODO: Customer ID Number
//TODO: (boolean) mailing list opt-in

	private String custNumber;
	private boolean custOptIn;

	public Customer(String firstName, String lastName, String address, String telephone, String custNumber, boolean custOptIn) {
	
		super(firstName, lastName, address, telephone);

		this.custNumber = custNumber;
		this.custOptIn = custOptIn;

	}

	/*
 	 * returns customer number as a string
 	 */
	public String getCustNumber() {
		return this.custNumber;
	}

	/*
 	 * Returns mailing list opt-in as a string
 	 */
	public boolean getCustOptIn() {
		return this.custOptIn;
	}
	/*
  	 * Sets /NEW/ Customer number
  	 *
  	 * @custNumber - new customer number to be assigned
  	 */
	public void setCustNumber(String custNumber) {
		this.custNumber = custNumber;
	}
	
	/*
 	 * Sets /NEW/ customer opt in mailing list
 	 *
 	 * @custOptIn - customer opt in agreed?
 	 */
	public void setCustOptIn(boolean custOptIn) {
		this.custOptIn = custOptIn;
	}

	/*
 	 * Prints out all of the customer information
 	 *
 	 */

	public void print() {
		System.out.println("Customer Information:");
		System.out.println("First Name: " + this.getFirstName());
		System.out.println("Last Name: " + this.getLastName());
		System.out.println("Address: " + this.getAddress());
		System.out.println("Telephone: " + this.getTelephone());
		System.out.println("Customer Number: " + this.getCustNumber());
		System.out.println("Mailing List Opt-In?: " + this.getCustOptIn());
	}

}
