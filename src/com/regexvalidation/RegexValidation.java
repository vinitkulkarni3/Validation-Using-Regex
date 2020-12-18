
package com.regexvalidation;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexValidation 
{
    public static void main(String[] args) 
    {
        System.out.println("* * * WELCOME TO USER REGISTRATION USING REGEX * * *\n");
        
        String firstName;
        String LastName;
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
        String LastNamePattern = "^[A-Z]{1}[a-z]{2,}$";
        System.out.print("Enter the Last Name : ");
        LastName  = readInput.next();
        if(Pattern.matches(LastNamePattern, LastName))
        {
            System.out.println("Valid LastName");
        }
        else
        {
            System.out.println("Invalid LastName");
        }
    }   
}
