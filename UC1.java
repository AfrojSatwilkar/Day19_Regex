package com.company1.Day19_Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC1 {
    public void validate() {
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Email address : ");
        String getUserInput = sc.next();
        Pattern pattern = Pattern.compile("^abc.[A-Za-z]+@bridgelabz.co$");
        Matcher matcher = pattern.matcher(getUserInput);
        while (matcher.find()) {
            flag = 1;
        }
        if (flag == 1) {
            System.out.println("valid email");
        } else {
            System.out.println("invalid email");
        }
    }
}
