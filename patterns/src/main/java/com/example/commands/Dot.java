package com.example.commands;

import com.example.command.AbstractFileConfig;
import com.example.command.FileExecutor;

/**
 * Created by alee2 on 7/12/18.
 *
 * @author alee2
 */
public class Dot extends AbstractFileConfig implements FileExecutor {
    @Override
    public void execute() {
        System.out.println("Dot detected and hiding file");
        System.out.println("Dot: " + getFileConfig().getFilePath() + getFileConfig().getFileName());
    }
}
