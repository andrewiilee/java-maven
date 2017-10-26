package com.example;

import java.util.Optional;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void simpleTest() {
        String str = null;
        Optional<String> optNum = Optional.ofNullable(str);

        System.out.println(optNum
                .filter(p -> !p.isEmpty() && Integer.parseInt(p) > 0)
                .orElse("0"));
    }
}
