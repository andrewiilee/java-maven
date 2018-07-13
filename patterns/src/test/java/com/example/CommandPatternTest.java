package com.example;

import com.example.command.FileConfig;
import com.example.command.FileExecutor;
import com.example.commands.Copy;
import com.example.commands.Done;
import com.example.commands.Dot;
import com.example.commands.Move;

import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CommandPatternTest {

    @Test
    public void command_happy_path() {
        FileConfig fileConfig = new FileConfig();
        fileConfig.setCommandInput("COMMAND: COPY MOVE DONE OUT DOT CREATE BLAH");
        fileConfig.setFileName("someFileName.txt");
        fileConfig.setFilePath("/some/directory/path/");

        CommandPattern cp = new CommandPattern(fileConfig);
        List<FileExecutor> executorList = cp.execute();

        assertEquals(4, executorList.size());
        assertTrue(executorList.stream().anyMatch(e -> e instanceof Move));
        assertTrue(executorList.stream().anyMatch(e -> e instanceof Copy));
        assertTrue(executorList.stream().anyMatch(e -> e instanceof Done));
        assertTrue(executorList.stream().anyMatch(e -> e instanceof Dot));

    }

    @Test(expected = NullPointerException.class)
    public void command_given_null_file_name() {
        FileConfig fileConfig = new FileConfig();
        fileConfig.setCommandInput("COMMAND: COPY");
        fileConfig.setFilePath("/some/directory/path/");

        CommandPattern cp = new CommandPattern(fileConfig);
        cp.execute();
    }
}
