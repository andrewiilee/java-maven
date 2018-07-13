package com.example.commands.refactor;

import com.example.FileConfig;
import com.example.command.refactor.AbstractCommand;
import com.example.command.refactor.Command;

/**
 * Created by alee2 on 7/12/18.
 *
 * @author alee2
 */
public class Copy extends AbstractCommand implements Command {

    public Copy(FileConfig fileConfig) {
        super(fileConfig);
    }

    @Override
    public void execute() {
        System.out.println("Copy detected and copying file");
        System.out.println("Copy: " + getFileConfig().getFilePath() + getFileConfig().getFileName());
    }
}
