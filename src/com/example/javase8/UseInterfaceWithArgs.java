/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.javase8;

import com.example.javase8.interfaces.InterfaceWithArgs;

/**
 *
 * @author Prashanth
 */
public class UseInterfaceWithArgs {

    public static void main(String[] args) {
        InterfaceWithArgs obj = (v1, v2) -> {
            int result = v1 * v2;
            System.out.println("The resule is " + result);
        };
        obj.doSomething(10, 5);
    }
}
