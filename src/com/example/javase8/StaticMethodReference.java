/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.javase8;

import com.example.javase8.model.Person;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author Prashanth
 */
public class StaticMethodReference {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Joe", 48));
        people.add(new Person("Sue", 12));
        people.add(new Person("Mike", 73));
        
        Collections.sort(people, Person :: compareAges);
        people.forEach(p -> System.out.println(p));
    }

}
