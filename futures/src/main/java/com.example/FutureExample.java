package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

class FutureExample {
    private static final ExecutorService THREADS = Executors.newFixedThreadPool(10);

    List<String> runFutures(int size) {
        List<String> list = new ArrayList<>();
        List<Callable<String>> callableList = new ArrayList<>();

        //commands are placed into a threadsafe callable list
        IntStream.range(1, size + 1).forEach(i -> callableList.add(() -> doIndividual(String.valueOf(i))));

        try {
            //execute callable list based on the number of THREADS
            List<Future<String>> futures = THREADS.invokeAll(callableList);

            //get results, this could throw error if one of the thread fails
            //get will block and wait
            for (Future<String> message : futures) {
                list.add(message.get());
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        return list;
    }

    private String doIndividual(String value) {
        return "some String " + value;
    }
}