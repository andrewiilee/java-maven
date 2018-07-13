package com.example;

import com.example.command.refactor.Command;
import com.example.commands.refactor.Copy;
import com.example.commands.refactor.Move;

import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by alee2 on 7/13/18.
 *
 * @author alee2
 */
public class CommandPatternRefactorTest {

    @Test
    public void command_happy_path() {
        FileConfig fileConfig = new FileConfig();
        fileConfig.setCommandInput("COMMAND: COPY MOVE DONE OUT DOT CREATE BLAH");
        fileConfig.setFileName("someFileNameRefactorVersion.txt");
        fileConfig.setFilePath("/some/directory/path/refactor/version");

        CommandPatternRefactor cp = new CommandPatternRefactor(fileConfig);
        List<Command> executorList = cp.execute();

        assertEquals(2, executorList.size());
        assertTrue(executorList.stream().anyMatch(e -> e instanceof Move));
        assertTrue(executorList.stream().anyMatch(e -> e instanceof Copy));
    }
}

