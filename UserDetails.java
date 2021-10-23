package com.company1.Day19_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserDetails {

    // validating first name
    public void firstName(String str) {
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            System.out.println("valid First Name");
        } else {
            System.out.println("invalid First Name");
        }
    }

    // validating last name
    public void lastName (String str){
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            System.out.println("valid Last Name");
        } else {
            System.out.println("invalid Last Name");
        }
    }

    // validating email
    public void email(String str) {
        Pattern pattern = Pattern.compile("^[a-zA-Z-9]+([._+-]*[0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$\"");
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            System.out.println("valid email");
        } else {
            System.out.println("invalid email");
        }
    }

    public void phoneNumber(String str) {
        Pattern pattern = Pattern.compile("^(\\+?\\d{1,3}?[- ]?)?(\\d{10})$");
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            System.out.println("valid phone number");
        } else {
            System.out.println("invalid phone number");
        }
    }

    public void password(String str) {
        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])([a-zA-Z0-9@$!%*#?&]){8,}$");
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            System.out.println("valid password");
        } else {
            System.out.println("invalid password");
        }
    }

}

