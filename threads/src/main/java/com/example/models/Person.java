package com.example.models;

public class Person {

    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public void walkInto() {
        System.out.println(name + " walked into store");
    }
}
