package com.example;

public class Reflection {


    public static void main(String args[]) {
        System.out.println("hello");
    }

    private String helloWorld(String message) {
        System.out.println("Input: " + message);
        return message;
    }

    private String multiWorld(String message, String multi) {
        System.out.println("Input 1: " + message);
        System.out.println("Input 2: " + multi);
        return multi;
    }
}