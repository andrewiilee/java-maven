package com.example.commands;

import com.example.command.Command;

/**
 * Created by alee2 on 7/12/18.
 *
 * @author alee2
 */
public class Copy extends Command {
    @Override
    public void execute() {
        System.out.println("Copy detected and copying file");
        System.out.println("Copy: " + getFileConfig().getFilePath() + getFileConfig().getFileName());
    }
}
