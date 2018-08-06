package com.example;

import com.example.command.refactor.Command;
import com.example.command.refactor.CommandFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.EnumUtils;

/**
 * Created by alee2 on 7/13/18.
 *
 * @author alee2
 */
public class CommandPatternRefactor {
    private final FileConfig fileConfig;

    CommandPatternRefactor(FileConfig fileConfig) {
        this.fileConfig = fileConfig;
    }

    List<Command> execute() {
        if (fileConfig.commandIsPresent()) {
            List<Command> executors = getAllExecutors();
            executors.forEach(Command::execute);
            return executors;
        } else {
            System.out.println("Not a command input");
            return new ArrayList<>();
        }
    }

    private List<Command> getAllExecutors() {
        ArrayList<Command> executors = new ArrayList<>();

        Arrays.stream(fileConfig.getCommandInput()).forEach(input -> {
            System.out.println("Input split: " + input + ".");
            if (EnumUtils.isValidEnum(CommandFactory.class, input)) {
                Command command = CommandFactory.valueOf(input).initializeCommand(fileConfig);
                executors.add(command);
            }
        });
        return executors;
    }
}
