package com.example;

import com.example.models.Person;
import com.example.threading.ThreadPersons;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

//The purpose of learning threading this project is to discuss the
//motivation (speed) purpose (requirement) direction (the how)

//BDD Behavior driven development (cucumber)
/**
 * Non Threaded
 * 10 people walk into a coffee shop
 * 10 people making an order
 */

/**
 * Threaded
 * 10 people walk into a coffee shop
 * 10 people making an order
 */
public class CoffeePeopleTest {
    //TDD test driven development
    @Test
    public void given10people_whenWalk_thenEnterNonThreaded() {
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            personList.add(new Person(String.valueOf(i)));
        }
        for (Person p : personList) {
            p.walkInto();
        }
    }

    @Test
    public void given10people_whenWalk_thenEnterSimultaneously() {
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            personList.add(new Person(String.valueOf(i)));
        }
        ThreadPersons tp = new ThreadPersons(personList);
        tp.multiplePersonWalk();
    }
}
