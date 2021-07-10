package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration //class name
{
	public static void main(String[] args) //main
	{
		Scanner scanner = new Scanner(System.in); 
		System.out.println("---Welcome To User Registration---\n"
				+"Choose your option : \n"
				+ "1. Enter the First Name :\n"
				+ "2. Enter the Last Name :\n"
				+ "3. Enter the Email :");
		
		int option  = scanner.nextInt(); 
		System.out.println();
		switch(option) 
		{
		case 1:
				Scanner scanner1 = new Scanner(System.in); 
				System.out.println("Enter User First Name : ");
				String FirstName  = scanner1.next(); 
				String regex = "^([A-Z]{1}[a-z]{2,})";//Reg Exp
		
				Pattern pattern = Pattern.compile(regex);
		
				Matcher matcher = pattern.matcher(FirstName); //reg match with first_name
		
				boolean isMatcher = matcher.matches();// boolean true/false
				if(isMatcher)
					System.out.println("User First Name is Valid....");
				else
					System.out.println("User First Name is InValid....");
				break;
			
		case 2:
				Scanner scanner2 = new Scanner(System.in); 
				System.out.println("Enter User Last Name : ");
				String LastName  = scanner2.next(); 
				String regex2 = "^([A-Z]{1}[a-z]{2,})";//Reg Exp
		
				Pattern pattern2 = Pattern.compile(regex2);
		
				Matcher matcher2 = pattern2.matcher(LastName); //reg match with last_name
		
				boolean isMatcher2 = matcher2.matches();// boolean true/false
				if(isMatcher2)
					System.out.println("User Last Name is Valid....");
				else
					System.out.println("User Last Name is InValid....");
				break;
		case 3:
				Scanner scanner3 = new Scanner(System.in); 
				System.out.println("Enter User Email : ");
				String Email  = scanner3.next(); 
				String regex3 = "^[a-zA-Z]+([.][a-zA-Z]+)*@[a-zA-Z]+[.][a-zA-Z]{2,3}+([.][a-zA-Z]+)*$";
	
				Pattern pattern3 = Pattern.compile(regex3);
	
				Matcher matcher3 = pattern3.matcher(Email); 
				
				boolean isMatcher3 = matcher3.matches();// boolean true/false
				if(isMatcher3)
					System.out.println("User Email is Valid....");
				else
					System.out.println("User Email is InValid....");
				break;		
		}
	}
}