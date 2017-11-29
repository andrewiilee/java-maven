package com.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;
import java.util.stream.IntStream;
import org.junit.Test;

/**
 * Read csv file java 8 style
 */
public class ReadCSVFileTest {

    @Test
    public void csvFileTest() throws Exception {

        InputStreamReader isr = new InputStreamReader(new FileInputStream(new File("src/test/resources/input.csv")));
        try (BufferedReader br = new BufferedReader(isr)) {
            String[] headers = Arrays.stream(br.readLine().split(",")).map(String::trim).toArray(String[]::new);
            List<Map<String, String>> records = br.lines()
                    .map(s -> s.split(","))
                    .map(t -> IntStream.range(0, t.length)
                            .boxed()
                            .collect(toMap(i -> headers[i], i -> t[i].trim())))
                    .collect(toList());
            System.out.println(Arrays.toString(headers));
            System.out.println(records);
        }
    }
}
