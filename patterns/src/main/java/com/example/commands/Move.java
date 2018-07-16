package com.example.commands;

import com.example.command.Command;

/**
 * Created by alee2 on 7/12/18.
 *
 * @author alee2
 */
public class Move extends Command {
    @Override
    public void execute() {
        System.out.println("Move detected and moving");
        System.out.println("Move: " + getFileConfig().getFilePath() + getFileConfig().getFileName());
    }
}
