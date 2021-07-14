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
				+ "3. Enter the Email :\n"
				+ "4. Enter the mobile number :\n"
				+ "5. PassWord Rule 1 (minimum 8 char):\n"
				+ "6. PassWord Rule 2 (1 upper case):\n"
				+ "7. PassWord Rule 3 (1 numeric number):\n"
				+ "8. Password Rule 4 (1 special character):\n"
				+ "9. Enter the EmailAll :");
		
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
				String regex3 = "^*+[a-zA-Z]+([.][a-zA-Z]+)*@[a-zA-Z]+[.][a-zA-Z]{2,3}+([.][a-zA-Z]+)*$"; //reg exp for email
	
				Pattern pattern3 = Pattern.compile(regex3);
	
				Matcher matcher3 = pattern3.matcher(Email); 
				
				boolean isMatcher3 = matcher3.matches();// boolean true/false
				if(isMatcher3)
					System.out.println("User Email is Valid....");
				else
					System.out.println("User Email is InValid....");
				break;
		case 4:
			Scanner scanner4 = new Scanner(System.in); 
			System.out.println("Enter User mobile number : "); 
			String mobile  = scanner4.nextLine(); 
			String regex4 ="^[0-9]{0,2}\\s{0,1}[0-9]{10}"; //reg exp for mobile number

			Pattern pattern4 = Pattern.compile(regex4);

			Matcher matcher4 = pattern4.matcher(mobile); 
			
			boolean isMatcher4 = matcher4.matches();// boolean true/false
			if(isMatcher4)
				System.out.println("User mobile number is Valid....");
			else
				System.out.println("User mobile number is InValid....");
			break;
		case 5:
			Scanner scanner5 = new Scanner(System.in); 
			System.out.println("Enter User PassWord1 : ");
			String PassWord1  = scanner5.next(); 
			String regex5 = "^[0-9]{8,}$"; //reg exp for minimum 8 number should have

			Pattern pattern5 = Pattern.compile(regex5);

			Matcher matcher5 = pattern5.matcher(PassWord1); 
			
			boolean isMatcher5 = matcher5.matches();// boolean true/false
			if(isMatcher5)
				System.out.println("User PassWord1 is Valid....");
			else
				System.out.println("User PassWord1 is InValid....");
			break;
		case 6:
			Scanner scanner6 = new Scanner(System.in); 
			System.out.println("Enter User PassWord2 : ");
			String PassWord2  = scanner6.next(); 
			String regex6 = "^[A-Z]{1}+[a-zA-z0-9]{8,}$";//atlist 1 capital char
			Pattern pattern6 = Pattern.compile(regex6);

			Matcher matcher6 = pattern6.matcher(PassWord2); 
			
			boolean isMatcher6 = matcher6.matches();// boolean true/false
			if(isMatcher6)
				System.out.println("User PassWord2 is Valid....");
			else
				System.out.println("User PassWord2 is InValid....");
			break;
		case 7:
			Scanner scanner7 = new Scanner(System.in); 
			System.out.println("Enter User PassWord3 : ");
			String PassWord3  = scanner7.next(); 
			String regex7 = "^[A-Z]{1}+[a-zA-Z].+[0-9].+{8,}$";
			Pattern pattern7 = Pattern.compile(regex7);
	
			Matcher matcher7 = pattern7.matcher(PassWord3); 
	
			boolean isMatcher7 = matcher7.matches();// boolean true/false
			if(isMatcher7)
				System.out.println("User PassWord3 is Valid....");
			else
				System.out.println("User PassWord3 is InValid....");
			break;
		case 8:
			Scanner scanner8 = new Scanner(System.in); 
			System.out.println("Enter User PassWord4 : ");
			String PassWord4  = scanner8.next(); 
			String regex8 = "^[A-Z]{1}+[a-zA-Z].*[@#$%^&*._+=].*[0-9].*{8,}$";//1 special character
			Pattern pattern8 = Pattern.compile(regex8);
	
			Matcher matcher8 = pattern8.matcher(PassWord4); 
	
			boolean isMatcher8 = matcher8.matches();// boolean true/false
			if(isMatcher8)
				System.out.println("User PassWord4 is Valid....");
			else
				System.out.println("User PassWord4 is InValid....");
			break;
		case 9:
			//Scanner scanner9 = new Scanner(System.in); 
			System.out.println("Enter User EmailAll : ");
			 String[] validEmailSample = {"abc@yahoo.com", "abc-100@yahoo.com", 
					 "abc.100@yahoo.com", "abc111@abc.com", "abc-100@abc.net", 
					 "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", 
					 "abc+100@gmail.com"};//check all email is valid
		        String[] invalidEmailSample = {"abc", "abc@.com.my", "abc123@gmail.a", 
		        		"abc123@.com", "abc123@.com.com", ".abc@abc.com", "abc()*@gmail.com", 
		        		"abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com",
		        		"abc@gmail.com.1a",  }; //this all email are invalid

		        System.out.println("------------Valid email------------ :");
		        emailValidate(validEmailSample);
		        System.out.println("\n--------Invalid emails------\n");
		        emailValidate(invalidEmailSample);
		    }
		} 
	public static void emailValidate(String[] emails) {
	        for (String email : emails) {
	            System.out.print(Pattern.matches("^*+[a-zA-Z0-9]+([.+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+[.][a-zA-Z]{2,3}+([.][a-zA-Z]+)*$", email) + " ");
	        }
	    }
	}
