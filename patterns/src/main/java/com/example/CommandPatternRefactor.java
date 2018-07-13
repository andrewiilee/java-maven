package com.example;

import com.example.command.refactor.Commands;
import com.example.command.refactor.Command;

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

        Arrays.stream(fileConfig.getCommandInput()).forEach(command -> {
            System.out.println("Command split: " + command + ".");
            if (EnumUtils.isValidEnum(Commands.class, command)) {
                Command fileExecutor = Commands.valueOf(command).initializeCommand(fileConfig);
                executors.add(fileExecutor);
            }
        });
        return executors;
    }
}

