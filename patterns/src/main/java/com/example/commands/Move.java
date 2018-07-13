package com.example.commands;

import com.example.command.AbstractFileConfig;
import com.example.command.FileExecutor;

/**
 * Created by alee2 on 7/12/18.
 *
 * @author alee2
 */
public class Move extends AbstractFileConfig implements FileExecutor {
    @Override
    public void execute() {
        validateFileConfig();
        System.out.println("Move detected and moving");
        System.out.println("Move: " + getFileConfig().getFilePath() + getFileConfig().getFileName());
    }
}
