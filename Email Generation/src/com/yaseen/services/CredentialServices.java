package com.yaseen.services;
import java.util.Random;
import com.yaseen.modal.Employee;

public class CredentialServices{
          //generatePassword method for generating random password
	public String generatePassword() {
		int len=8;
		String capitalLetters ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters ="abcdefghijklmnopqrstuvwxy";
		String numbers ="0123456789";
		String specialCharacters="!@#$%&*";
		String chars = capitalLetters +smallLetters + numbers + specialCharacters ;
		
		//using random method
		
		Random random=new Random();
		//using StringBuilder for mutable Sequence of characters
		StringBuilder sb=new StringBuilder(len);
		
		for (int i=0; i < len; i++)
		{
			//use of charAt() method :to get character value
			//use of nextInt() as it is scanning the value as integer
			sb.append(chars.charAt(random.nextInt(chars.length())));
		}
		return sb.toString();
			
	}
	public String generateEmailAddress(String firstName, String lastName, String department)
	{
		return firstName+lastName+"@"+department+".abc.com";
	
	}
	//method for display credentials
	public void showCredentials(Employee emp,String email) {
		System.out.println("Dear "+ emp.getFirstName()+" your generated credentials are as follows ");
		System.out.println("Email --> "+ email);
		System.out.println("Password --> "+ generatePassword());
		
	}
	
}
