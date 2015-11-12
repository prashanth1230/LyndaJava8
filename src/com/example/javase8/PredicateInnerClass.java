/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.javase8;

import com.example.javase8.model.Person;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author Prashanth
 */
public class PredicateInnerClass {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Joe", 48));
        people.add(new Person("Sue", 12));
        people.add(new Person("Mike", 73));
        people.add(new Person("x", 99));
        people.add(new Person("b", 12));
        people.add(new Person("v", 12));
        people.add(new Person("h", 49));
        people.add(new Person("y", 976));
        people.add(new Person("g", 88));
        people.add(new Person("i", 12));
        people.add(new Person("e", 34));
        people.add(new Person("p", 77));

        long startTime = System.nanoTime();
        Predicate<Person> pred = new Predicate<Person>() {
            @Override
            public boolean test(Person p) {
                return (p.getAge() >= 65);
            }
        };

        for (Person person : people) {
            if (pred.test(person)) {
                System.out.println(person.toString());
            }
        }
        long stopTime = System.nanoTime();
        long elapsedTime = stopTime - startTime;
        System.out.println(elapsedTime);
    }

}
