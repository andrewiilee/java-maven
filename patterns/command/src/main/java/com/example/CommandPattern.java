package com.example;

import com.example.command.Command;
import com.example.command.CommandFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.EnumUtils;

/**
 * Created by alee2 on 7/12/18.
 *
 * @author alee2
 */
class CommandPattern {

    private final FileConfig fileConfig;

    CommandPattern(FileConfig fileConfig) {
        this.fileConfig = fileConfig;
    }

    List<Command> execute() {
        if(fileConfig.commandIsPresent()) {
            List<Command> executors = addInputCommand();
            executors.forEach(Command::execute);
            return executors;
        } else {
            System.out.println("Not a command input");
            return new ArrayList<>();
        }
    }

    private List<Command> addInputCommand() {
        ArrayList<Command> executors = new ArrayList<>();

        Arrays.stream(fileConfig.getCommandInput()).forEach(input -> {
            System.out.println("Command split: " + input + ".");
            if(EnumUtils.isValidEnum(CommandFactory.class, input)) {
                Command command = CommandFactory.valueOf(input).getInstance();
                //Setting fileConfig into the constructor of input commands is a better way than
                //trying to initialize an object post-const. Improvements can be made here
                command.setFileConfig(fileConfig);
                command.validateFileConfig();
                executors.add(command);
            }
        } );
        return executors;
    }
}