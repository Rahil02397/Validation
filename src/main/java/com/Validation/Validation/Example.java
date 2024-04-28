package com.Validation.Validation;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Example {
    public static void main(String[] args) {
//        String s1= "neudesic";
//        String s2= "Neudesic";
//
//        String s3=new String("neudesic");
//
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.replace("n","N"));
//        System.out.println(s1.equalsIgnoreCase(s2));
//        System.out.println(s1.equals(s2.toLowerCase()));
//        System.out.println(s1==s2);

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
//        names.forEach(name -> System.out.println(name));
//
// Using method reference
        names.forEach(System.out::println);
    }
}
