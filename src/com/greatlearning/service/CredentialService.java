package com.greatlearning.service;
import com.greatlearning.model.*;
import java.util.Random;

public class CredentialService {
	public String generateEmailAddress(Employee emp) {
		//generate email address
		//System.out.println("")
		return emp.getfirstname().toLowerCase() + emp.getlastname().toLowerCase() + "@" + emp.getdepartment().toLowerCase() + "abc.com";
		
	}
	public String generatePassword() {
		
		Random random = new Random();
		
		String capitalletters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallletters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*()<>?/";
		
		String allowedChars = capitalletters+smallletters+numbers+specialCharacters;
		
		char[] password = new char[8];
		
		for (int i = 0; i<8; i++) {
			int idx = random.nextInt(allowedChars.length());
			password[i]= allowedChars.charAt(idx);
		}
				
			
		return new String(password);
	}
	
	public void showCredentials(Employee emp, String email, String password) {
		// display credentials
		System.out.println("Dear "+ emp.getfirstname() + " your generated credentials are as follows");
		System.out.println ("Email ----> " + email);
		System.out.println("Password ---> "+ password);
	}
}
