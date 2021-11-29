package com.greatlearning.main;
import java.util.Scanner;
import com.greatlearning.model.*;
import com.greatlearning.service.*;

public class Driver {
	
	private static Scanner sc = new Scanner(System.in);
	
	// Take inputs from the user for firstname, lastname, choice (Department id - 1,2,3,4)
	public static void main(String[] args) {
		
		System.out.println("Enter your Firstname");
		String firstname = sc.next();
		
		System.out.println("Enter your Lastname");
		String lastname = sc.next();
		
		System.out.println("Choose your department ");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resources ");
		System.out.println("4. Legal" );
		
		int choice = sc.nextInt();
		Employee emp;
		
		switch(choice) {
			case 1: 
				emp = new Employee(firstname, lastname, "tech");
				break;
			case 2:
				emp = new Employee(firstname, lastname, "adm");
				break;
			case 3:
				emp = new Employee(firstname, lastname, "hr");
				break;
			case 4:
				emp = new Employee(firstname, lastname, "lg");
				break;
			default:
				System.out.println("Wrong choice");
				return;
		}
		
		CredentialService cs = new CredentialService();
		String email = cs.generateEmailAddress(emp);
		//System.out.println("Dear "+ firstname + " your generated credentials are as follows");
		//System.out.println ("Email ----> " + email);
		String password = cs.generatePassword();
		//System.out.println("Password ---> "+ password);
		cs.showCredentials(emp, email, password);
	}
}
