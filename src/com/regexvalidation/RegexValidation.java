
package com.regexvalidation;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexValidation 
{
    String firstName;
    String lastName;
    String email;
    String mobileNumber;
    String password;
    
    Scanner readInput = new Scanner(System.in);
    
    public void firstNameValidation()
    {
        String firstNamePattern ="^[A-Z]{1}[a-z]{2,}$";
        System.out.print("Enter the First Name : ");
        firstName  = readInput.next();
        if(Pattern.matches(firstNamePattern, firstName))
        {
            System.out.println("✔");
            lastNameValidation();
        }
        else
        {
            System.out.println("Invalid FirstName");
            firstNameValidation();
        }
    }
    
    public void lastNameValidation()
    {
        String lastNamePattern = "^[A-Z]{1}[a-z]{2,}$";
        System.out.print("Enter the Last Name : ");
        lastName  = readInput.next();
        if(Pattern.matches(lastNamePattern, lastName))
        {
            System.out.println("✔");
            emailValidation();
        }
        else
        {
            System.out.println("Invalid LastName");
            lastNameValidation();
        }
    }
    
    public void emailValidation()
    {
        String emailPattern = "^[a-zA-Z0-9\\\\-\\\\+\\\\.]+.([a-zA-Z0-9])*@([a-z0-9]+.[a-z]{2,}.([a-z]{2,})?)$";
        System.out.print("Enter the Email ID : ");
        email  = readInput.next();
        if(Pattern.matches(emailPattern, email))
        {
            System.out.println("✔");
            mobileNumberValidation();
        }
        else
        {
            System.out.println("Invalid Email");
            emailValidation();
        }
    }
    
    public void mobileNumberValidation()
    {
        String mobilePattern = "^[0-9]{2}[-]?[0-9]{10}$";
        System.out.print("Enter the Mobile Number :");
        mobileNumber  = readInput.next();
        if(Pattern.matches(mobilePattern, mobileNumber))
        {
            System.out.println("✔");
            passwordValidation();
        }
        else
        {
            System.out.println("Invalid Number");
            mobileNumberValidation();
        }
    }
    
    public void passwordValidation()
    {
        String passwordPattern = "^(?=[A-Za-z0-9!@#]{8,}$)(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9]).*";
        System.out.println("RULES: [Minimum length is 8] [1 specialChar] [Atleast 1 Cap , Lower, digit]");
        System.out.print("Enter the Password :");
        password  = readInput.next();
        if(Pattern.matches(passwordPattern, password))
        {
            System.out.println("✔");
            display();
        }
        else
        {
            System.out.println("Invalid Password");
            passwordValidation();
        }
    }
    
    public void display()
    {
        System.out.println("\nUSER REGISTRATION SUCCSSFULL WITH NAME -> "+firstName);
    }
    
    public static void main(String[] args) 
    {
        System.out.println("* * * WELCOME TO USER REGISTRATION USING REGEX * * *\n");
            
        RegexValidation regexObject = new RegexValidation();
        regexObject.firstNameValidation();
    }   
}
