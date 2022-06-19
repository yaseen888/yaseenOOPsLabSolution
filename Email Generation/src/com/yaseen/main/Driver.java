package com.yaseen.main;
import com.yaseen.modal.Employee;
import com.yaseen.services.CredentialServices;

import java.util.Scanner;
public class Driver {

	public static void main(String[] args) {

		//creating object for Employee class
		Employee emp=new Employee("yaseen","fatima");
		//creating object for CredentialService class
		CredentialServices cs1=new CredentialServices();
		String generatedEmail;
 
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		System.out.println("Enter your choice\n");
		
	    	//Taking input from user
			Scanner sc=new Scanner(System.in);
			int option=sc.nextInt();
			switch(option) {
			case 1:
				generatedEmail=cs1.generateEmailAddress(emp.getFirstName().toLowerCase(),emp.getLastName().toLowerCase(),"tech");
				cs1.showCredentials(emp, generatedEmail);
				break;
			case 2:
				generatedEmail=cs1.generateEmailAddress(emp.getFirstName().toLowerCase(),emp.getLastName().toLowerCase(),"admin");
				cs1.showCredentials(emp, generatedEmail);
				break;
			case 3:
				generatedEmail=cs1.generateEmailAddress(emp.getFirstName().toLowerCase(),emp.getLastName().toLowerCase(),"hr");
				cs1.showCredentials(emp, generatedEmail);
				break;
			case 4:
				generatedEmail=cs1.generateEmailAddress(emp.getFirstName().toLowerCase(),emp.getLastName().toLowerCase(),"legal");
				cs1.showCredentials(emp, generatedEmail);
				break;
			default :
				System.out.println("Please provide the correct option");
				break;
			} 
			sc.close(); //close Scanner connection otherwise it will give warning
	}
}