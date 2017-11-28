package com.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

/**
 * Read file java 8 style
 */
public class ReadFileTest {

    @Test
    public void readFileTest() throws IOException {
        String content = new String(Files.readAllBytes(Paths.get("src/test/resources/file.txt")));
        assertThat("Content does not match", content, is("File is read"));
    }

}
