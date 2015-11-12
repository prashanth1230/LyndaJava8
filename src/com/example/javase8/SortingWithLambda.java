/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.javase8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Prashanth
 */
public class SortingWithLambda {
    
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("AAA");
        strings.add("bbb");
        strings.add("CCC");
        strings.add("ddd");
        strings.add("EEE");
        
        //Simple case sensitive sort
        Collections.sort(strings);
        System.out.println("Simple sort");
        strings.stream().forEach((str) -> {
            System.out.println(str);
        });
        
        //Case sensitive sort with Anonymous class
        //Using Member method reference
        Collections.sort(strings, String::compareToIgnoreCase);
        //Using the lambda expression
        //Collections.sort(strings, (String str1, String str2) -> str1.compareToIgnoreCase(str2));
        System.out.println("Sort with Comparator");
        strings.stream().forEach((str) -> {
            System.out.println(str);
        });
    }

}
