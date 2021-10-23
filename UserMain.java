package com.company1.Day19_Regex;

import java.util.Scanner;

public class UserMain {
    UserRegistration userRegistration = new UserRegistration();
    Scanner scanner = new Scanner(System.in);

    public void choice() {
        while (true) {
            System.out.println("Enter 1 To Check First Name\n"
                    + "Enter 2 To Check Second Name\n"
                    + "Enter 3 To Check EmailId\n"
                    + "Enter 4 To Check Mobile Number\n"
                    + "Enter 5 To Check Password\n"
                    + "Enter 6 To test the sample EmailIds\n"
                    + "Enter 0 To Exit");
            int userChoice = scanner.nextInt();
            switch (userChoice) {
                case 1 :
                    userRegistration.userFirstName();
                    break;
                case 2 :
                    userRegistration.userLastName();
                    break;
                case 3 :
                    userRegistration.userEmailId();
                    break;
                case 4 :
                    userRegistration.userMobileNumber();
                    break;
                case 5 :
                    userRegistration.userPassword();
                    break;
                case 6 :
                    userRegistration.sampleEmailIds();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default :
                    System.out.println("Enter the wrong input \n Please enter the Correct input");
                    continue;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("\n Welcome to the User Registration program by Regex \n");
        UserMain userMain = new UserMain();
        userMain.choice();
        //userMain.scanner.close();
    }
}