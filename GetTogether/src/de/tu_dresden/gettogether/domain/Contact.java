package de.tu_dresden.gettogether.domain;

/**
 * @author Markus Frank
 * 
 * Class that represents a Contact. Either a phonebook contact or an app internal 
 * contact or a User with password.
 *
 */

public class Contact {

	private String firstname;
	private String lastname;
	private String password;
	private String phonenumber;
	
	/**
	 * Constructor for a User with password.
	 * 
	 * @param fname Firstname
	 * @param lname Lastname
	 * @param password Password
	 * @param phonenumber Users phonenumber
	 */
	
	public Contact(String fname, String lname, String password, String phonenumber) {
		this.firstname = fname;
		this.lastname = lname;
		this.password = password;
		this.phonenumber = phonenumber;
	}

	
	/**
	 * Constructor for a Contact.
	 * 
	 * @param fname Firstname
	 * @param lname Lastname
	 * @param phonenumber Users phonenumber
	 */
	
	public Contact(String fname, String lname , String phonenumber) {
		this.firstname = fname;
		this.lastname = lname;
		this.phonenumber = phonenumber;
	}


	public String getFirstname() {
		return firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public String getPassword() {
		return password;
	}


	public String getPhonenumber() {
		return phonenumber;
	}
	
	
	
}
