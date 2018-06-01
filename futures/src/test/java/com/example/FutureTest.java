package com.example;

import org.junit.Test;

public class FutureTest {

    @Test
    public void execute_futures_example() {
        FutureExample example = new FutureExample();
        System.out.println(example.runFutures(100));
    }
}