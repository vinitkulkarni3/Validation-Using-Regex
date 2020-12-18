
package com.regexvalidation;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexValidation 
{
    public static void main(String[] args) 
    {
        System.out.println("* * * WELCOME TO USER REGISTRATION USING REGEX * * *\n");
        
        String firstName;
        String lastName;
        String email;
        Scanner readInput = new Scanner(System.in);
        
        //FirstName Validation
        String firstNamePattern = "^[A-Z]{1}[a-z]{2,}$";
        System.out.print("Enter the First Name : ");
        firstName  = readInput.next();
        if(Pattern.matches(firstNamePattern, firstName))
        {
            System.out.println("Valid FirstName");
        }
        else
        {
            System.out.println("Invalid FirstName");
        }
        
        //LastName Validation
        String lastNamePattern = "^[A-Z]{1}[a-z]{2,}$";
        System.out.print("Enter the Last Name : ");
        lastName  = readInput.next();
        if(Pattern.matches(lastNamePattern, lastName))
        {
            System.out.println("Valid LastName");
        }
        else
        {
            System.out.println("Invalid LastName");
        }
        
        //Email Validation
        String emailPattern = "^[a-zA-Z0-9\\\\-\\\\+\\\\.]+.([a-zA-Z0-9])*@([a-z0-9]+.[a-z]{2,}.([a-z]{2,})?)$";
        System.out.print("Enter the Email ID : ");
        email  = readInput.next();
        if(Pattern.matches(emailPattern, email))
        {
            System.out.println("Valid Email");
        }
        else
        {
            System.out.println("Invalid Email");
        }
    }   
}
