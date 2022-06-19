package com.abc.model;
/*This is the model class for new employees and requires the firstname and lastname of the employee */
public class Employee {

	private String firstName;
	private String lastName;
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}

}
