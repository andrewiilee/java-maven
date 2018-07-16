package com.example.commands.refactor;

import com.example.FileConfig;
import com.example.command.refactor.Command;

/**
 * Created by alee2 on 7/12/18.
 *
 * @author alee2
 */
public class Move extends Command {

    public Move(FileConfig fileConfig) {
        super(fileConfig);
    }

    @Override
    public void execute() {
        System.out.println("Move detected and moving");
        System.out.println("Move: " + getFileConfig().getFilePath() + getFileConfig().getFileName());
    }
}
