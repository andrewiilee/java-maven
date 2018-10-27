package com.example.threading;

import com.example.models.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

//Two ways to create threading
//implement Runnable
//extend the Thread class
//And you could Executors manages a pool of threads
public class ThreadPersons {

    private final ExecutorService THREADS;
    private final List<Person> personList;
    private List<Callable<String>> callableList = new ArrayList<>();

    public ThreadPersons(List<Person> personList) {
        this.personList = personList;
        THREADS = Executors.newFixedThreadPool(personList.size());
    }

    public void multiplePersonWalk() {
        List<String> list = new ArrayList<>();
        for(Person person : personList) {
            callableList.add(person::walkInto);
        }
        try {
            //execute callable list based on the number of THREADS
            List<Future<String>> futures = THREADS.invokeAll(callableList);
            for (Future<String> message : futures) {
                list.add(message.get());
            }
        } catch (Exception e) {

        }
    }
}
