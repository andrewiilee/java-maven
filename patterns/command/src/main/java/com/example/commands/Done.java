package com.example.commands;

import com.example.command.Command;

/**
 * Created by alee2 on 7/12/18.
 *
 * @author alee2
 */
public class Done extends Command {
    @Override
    public void execute() {
        System.out.println("Done detected and completing file");
        System.out.println("Done: " + getFileConfig().getFilePath() + getFileConfig().getFileName());
    }
}
