package com.example.command.refactor;

import com.example.FileConfig;

/**
 * Created by alee2 on 7/13/18.
 *
 * @author alee2
 */
public abstract class Command {
    private FileConfig fileConfig;

    abstract public void execute();

    protected Command(FileConfig fileConfig) {
        fileConfig.validate();
        this.fileConfig = fileConfig;
    }

    protected FileConfig getFileConfig() {
        return fileConfig;
    }
}
