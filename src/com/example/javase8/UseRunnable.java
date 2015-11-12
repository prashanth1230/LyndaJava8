/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.javase8;

/**
 *
 * @author Prashanth
 */
public class UseRunnable {
    
    public static void main(String[] args) {
        Runnable r1 = () -> System.out.println("Running Thread 1");
        Runnable r2 = () -> System.out.println("Running Thread 2");
        new Thread(r1).start();
        new Thread(r2).start();
    }
    
}
