//Person.java
 /* Person.java -- Person class/object in current assignment.
  * 
  * Tommy Rojo <tommy.rojo@stu.bmcc.cuny.edu>
  *
  * Follow the instructions on (BOOK 699)
  *  "Person and Customer Classes" (Assignment 7)
  *
  */

public class Person {
//TODO: Person's Name
//TODO: Person's Address
//TODO: Person's Telephone Number
	private String firstName;
	private String lastName;
	private String address;
	private String telephone;

	public Person(String firstName, String lastName, String address, String telephone) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.telephone = telephone;
	}

	/*
 	 * Returns Person's first name (as string)
 	 */
	public String getFirstName() {
		return this.firstName;
	}

	/*
 	 * Returns Person's last name (as string)
 	 */
	public String getLastName() {
		return this.lastName;
	}

	/*
 	 *Returns address (as string)
 	 */
	public String getAddress() {
		return this.address;
	}
	/*
 	 *Returns telephone number (AS STRING)
	 */
	public String getTelephone() {
		return this.telephone;
	}

	/*
 	 * Sets first name
 	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/*
 	 * Sets last name
 	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/*
 	 * Sets current address
 	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/*
 	 * Sets telephone number
 	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

}
