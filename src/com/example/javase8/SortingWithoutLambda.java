/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.javase8;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Prashanth
 */
public class SortingWithoutLambda {
    
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
        for (String str : strings) {
            System.out.println(str);
        }
        
        //Case sensitive sort with Anonymous class
        Collections.sort(strings, new Comparator<String>(){
            @Override
            public int compare(String str1, String str2) {
                return str1.compareToIgnoreCase(str2);
            }
        });
        System.out.println("Sort with Comparator");
        for (String str : strings) {
            System.out.println(str);
        }
    }
    
}
