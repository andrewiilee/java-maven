package com.example.command;

import com.example.FileConfig;

/**
 * Created by alee2 on 7/13/18.
 *
 * @author alee2
 */
public abstract class Command {

    private FileConfig fileConfig;

    public FileConfig getFileConfig() {
        return fileConfig;
    }

    public void validateFileConfig() {
        fileConfig.validate();
    }

    public void setFileConfig(FileConfig fileConfig) {
        this.fileConfig = fileConfig;
    }

    public abstract void execute();
}
