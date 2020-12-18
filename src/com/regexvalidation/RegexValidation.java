
package com.regexvalidation;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexValidation 
{
    final String FIRSTNAMEPATTERN =  "^[A-Z]{1}[a-z]{2,}$";
    final String LASTNAMEPATTERN = "^[A-Z]{1}[a-z]{2,}$";
    final String EMAILPATTERN = "^[a-zA-Z0-9\\\\-\\\\+\\\\.]+.([a-zA-Z0-9])*@([a-z0-9]+.[a-z]{2,}.([a-z]{2,})?)$";
    final String MOBILEPATTERN = "^[0-9]{2}[-]?[0-9]{10}$";
    final String PASSWORPATTERN = "^(?=[A-Za-z0-9!@#]{8,}$)(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9]).*";
    
    String firstName;
    String lastName;
    String email;
    String mobileNumber;
    String password;
    
    Scanner readInput = new Scanner(System.in);
    
    public void firstNameValidation()
    {
        System.out.print("Enter the First Name : ");
        firstName  = readInput.next();
        if(Pattern.matches(FIRSTNAMEPATTERN, firstName))
        {
            System.out.println(firstName+" ✔");
            lastNameValidation();
        }
        else
        {
            System.out.println("Invalid FirstName");
            System.out.println("---Retry It---");
            firstNameValidation();
        }
    }
    
    public void lastNameValidation()
    {
        System.out.print("Enter the Last Name : ");
        lastName  = readInput.next();
        if(Pattern.matches(LASTNAMEPATTERN, lastName))
        {
            System.out.println(lastName+" ✔");
            emailValidation();
        }
        else
        {
            System.out.println("Invalid LastName");
            System.out.println("---Retry It---");
            lastNameValidation();
        }
    }
    
    public void emailValidation()
    {
        System.out.print("Enter the Email ID : ");
        email  = readInput.next();
        if(Pattern.matches(EMAILPATTERN, email))
        {
            System.out.println(email+" ✔");
            mobileNumberValidation();
        }
        else
        {
            System.out.println("Invalid Email");
            System.out.println("---Retry It---");
            emailValidation();
        }
    }
    
    public void mobileNumberValidation()
    {
        System.out.print("Enter the Mobile Number :");
        mobileNumber  = readInput.next();
        if(Pattern.matches(MOBILEPATTERN, mobileNumber))
        {
            System.out.println(mobileNumber+" ✔");
            passwordValidation();
        }
        else
        {
            System.out.println("Invalid Number");
            System.out.println("---Retry It---");
            mobileNumberValidation();
        }
    }
    
    public void passwordValidation()
    {
        System.out.println("RULES: [Minimum length is 8] [1 specialChar] [Atleast 1 Cap , Lower, digit]");
        System.out.print("Enter the Password :");
        password  = readInput.next();
        if(Pattern.matches(PASSWORPATTERN, password))
        {
            System.out.println(password+" ✔");
            display();
        }
        else
        {
            System.out.println("Invalid Password");
            System.out.println("---Retry it---");
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
