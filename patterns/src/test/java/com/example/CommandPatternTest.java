package com.example;

import org.junit.Test;

public class CommandPatternTest {

    @Test
    public void commandPatternTest() {
        String inputCommandLine = "COMMAND: COPY MOVE DONE OUT DOT CREATE BLAH";
        CommandPattern cp = new CommandPattern(inputCommandLine);
        cp.execute();
    }

}