package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.EnumUtils;

/**
 * Created by alee2 on 7/12/18.
 *
 * @author alee2
 */
public class CommandPattern {

    private final String inputCommandLine;

    CommandPattern(String inputCommandLine) {
        this.inputCommandLine = inputCommandLine;
    }

    void execute() {
        if(inputCommandLine.contains("COMMAND")) {
            List<FileExecutor> executors = addInputCommand(inputCommandLine);
            executors.forEach(FileExecutor::execute);
        } else {
            System.out.println("No command");
        }
    }

    private List<FileExecutor> addInputCommand(String inputCommandLine) {
        ArrayList<FileExecutor> executors = new ArrayList<>();
        Arrays.stream(inputCommandLine.split(" ")).forEach(command -> {
            System.out.println("Command split: " + command + ".");
            if(EnumUtils.isValidEnum(Commands.class, command)) {
                executors.add(Commands.valueOf(command).getInstance());
            }
        } );
        return executors;
    }
}