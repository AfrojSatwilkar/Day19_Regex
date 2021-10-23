package com.company1.Day19_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestSampleEmailIds {

    static String[] validEmails = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com",
            "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au",
            "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com", "abc", "abc@.com.my","abc123@gmail.a", "abc123@.com",
            "abc123@.com.com", ".abc@abc.com", "abc()*@gmail.com",
            "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com",
            "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"};

    public void testForValidEmails() {
        for (int i = 0; i < validEmails.length; i++) {
            Pattern pattern = Pattern.compile("^[a-zA-Z-9]+([._+-]*[0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$");
            Matcher matcher = pattern.matcher(validEmails[i]);
            if (matcher.matches()) {
                System.out.println(validEmails[i]+" : Valid");
            } else {
                System.out.println(validEmails[i]+" : Invalid");
            }
        }
        System.out.println(" ");
    }
}
