package com.abc.service;
import com.abc.model.*;
import java.util.Random;
/*CredentialService is a class dedicated to creating the email and password*/
public class CredentialService {

	private String password;
	private String email;

	public void generatePassword()		//generates a random password
	{
		String combinedChars  = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$()1234567890"; //password is combination of (number, capital letter, small letter & special character
		Random random = new Random();
		char[] password = new char[8];
		for(int i = 0; i< 8 ; i++) {
			password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
		}
		this.password=new String(password);//converting char array to string
	}

	public void generateEmailAddress(Employee emp,String dept)		//generates the email with respect to firstname,lastname and department
	{
		String firstName=emp.getFirstName().toLowerCase();
		String lastName=emp.getLastName().toLowerCase();
		this.email=firstName+lastName+"@"+dept+".abc.com";
	}
	public void  showCredentials()
	{
		System.out.println("Email    ---> "+this.email);
		System.out.println("Password ---> "+this.password);
	}
}
