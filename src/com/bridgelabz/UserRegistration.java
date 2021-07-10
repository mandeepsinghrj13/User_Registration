package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration //class name
{
	public static void main(String[] args) //main
	{
		System.out.println("Welcome To User Registration");//welcome message
		Scanner scanner = new Scanner(System.in); 
		String FirstName  = scanner.next(); //user input
		Pattern pattern = Pattern.compile("^([A-Z]{1}[a-z]{2,})");//Reg Exp
		Matcher matcher = pattern.matcher(FirstName); //reg match with first_name
		boolean isMatcher = matcher.matches();// boolean true/false
		System.out.println(isMatcher);
	}
}
