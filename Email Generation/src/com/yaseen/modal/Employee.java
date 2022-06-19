package com.yaseen.modal;

public class Employee {
	/*
	 * This class contains parameterised constructor to pass firstName and lastName of the employee
	 * This class return the name of the employee to the class CredentialServices
	 */
	private String firstName;
	 private String lastName;
	 // parameterised constructor to set the first and last name
    public Employee(String firstName,String lastName) {
    	this.firstName=firstName;
    	this.lastName=lastName;
    	
    }
    //return firstName
	public String getFirstName() {
		return firstName;
	}
	//return lastName
	public String getLastName() {
		return lastName;
	}
	
    

}