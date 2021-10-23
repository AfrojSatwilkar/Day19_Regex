package com.company1.Day19_Regex;

import java.util.Scanner;

public class UserRegistration {

    Scanner scanner = new Scanner(System.in);
    UserDetails userDetails = new UserDetails();

    public void userFirstName() {
        System.out.println("Enter Your First Name : ");
        String firstName = scanner.next();
        userDetails.firstName(firstName);
    }

    public void userLastName() {
        System.out.println("Enter Your Last Name : ");
        String lastName = scanner.next();
        userDetails.lastName(lastName);
    }

    public void userEmailId() {
        System.out.println("Enter Your EmailId : ");
        String emailId = scanner.next();
        userDetails.email(emailId);
    }

    public void userMobileNumber() {
        System.out.println("Enter your MobileNumber");
        String phoneNumber = scanner.next();
        userDetails.phoneNumber(phoneNumber);
    }

    public void userPassword() {
        System.out.println("Enter your MobileNumber");
        String password = scanner.next();
        userDetails.password(password);
    }

    public void sampleEmailIds() {
        TestSampleEmailIds testSampleEmailIds = new TestSampleEmailIds();
        testSampleEmailIds.testForValidEmails();
    }
}
