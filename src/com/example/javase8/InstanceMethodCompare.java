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

/**
 *
 * @author Prashanth
 */
public class InstanceMethodCompare {
    
    public static void main(String[] args) {
        InstanceMethodCompare mainClass = new InstanceMethodCompare();
        mainClass.sortData();
    }
    
    public void sortData() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Joe", 48));
        people.add(new Person("Sue", 12));
        people.add(new Person("Mike", 73));
        
        Collections.sort(people, this :: compareAges);
        people.forEach(p -> System.out.println(p));
    }
    
    public int compareAges(Person p1, Person p2) {
        Integer age1 = p1.getAge();
        return age1.compareTo(p2.getAge());
    }
    
}
