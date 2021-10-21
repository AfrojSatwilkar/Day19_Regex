package com.company1.Day19_Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    public void validate() {
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Phone number : ");
        String getUserInput = sc.next();
        Pattern pattern = Pattern.compile("^(\\+?\\d{1,2}?)?(\\d{10})$");
        Matcher matcher = pattern.matcher(getUserInput);
        while (matcher.find()) {
            flag = 1;
        }
        if (flag == 1) {
            System.out.println("valid phone number");
        } else {
            System.out.println("invalid phone number");
        }
    }
}
