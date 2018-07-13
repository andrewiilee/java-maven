package com.example;

import com.example.command.Commands;
import com.example.command.FileConfig;
import com.example.command.FileExecutor;

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

    List<FileExecutor> execute() {
        if(fileConfig.getCommandInput().contains("COMMAND")) {
            List<FileExecutor> executors = addInputCommand(fileConfig);
            executors.forEach(FileExecutor::execute);
            return executors;
        } else {
            System.out.println("Not a command input");
            return new ArrayList<>();
        }
    }

    private List<FileExecutor> addInputCommand(FileConfig fileConfig) {
        ArrayList<FileExecutor> executors = new ArrayList<>();

        Arrays.stream(fileConfig.getCommandInput().split(" ")).forEach(command -> {
            System.out.println("Command split: " + command + ".");
            if(EnumUtils.isValidEnum(Commands.class, command)) {
                FileExecutor fileExecutor = Commands.valueOf(command).getInstance();
                //Setting fileConfig into the constructor of input commands is a better way than
                //trying to initialize an object post-const. Improvements can be made here
                fileExecutor.setFileConfig(fileConfig);
                fileExecutor.validateFileConfig();
                executors.add(fileExecutor);
            }
        } );
        return executors;
    }
}