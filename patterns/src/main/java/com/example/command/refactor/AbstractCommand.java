package com.example.command.refactor;

import com.example.FileConfig;

/**
 * Created by alee2 on 7/13/18.
 *
 * @author alee2
 */
public abstract class AbstractCommand {
    private FileConfig fileConfig;

    protected AbstractCommand(FileConfig fileConfig) {
        fileConfig.validate();
        this.fileConfig = fileConfig;
    }

    protected FileConfig getFileConfig() {
        return fileConfig;
    }
}
