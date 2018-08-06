package com.example.commands;

import com.example.command.Command;

/**
 * Created by alee2 on 7/12/18.
 *
 * @author alee2
 */
public class Dot extends Command {
    @Override
    public void execute() {
        System.out.println("Dot detected and hiding file");
        System.out.println("Dot: " + getFileConfig().getFilePath() + getFileConfig().getFileName());
    }
}
