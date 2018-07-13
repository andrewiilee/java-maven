package com.example.command;

/**
 * Created by alee2 on 7/13/18.
 *
 * @author alee2
 */
public abstract class AbstractFileConfig implements FileExecutor {

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
}
