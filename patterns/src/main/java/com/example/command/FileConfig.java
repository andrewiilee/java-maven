package com.example.command;

import java.util.Objects;

/**
 * Created by alee2 on 7/13/18.
 *
 * @author alee2
 */
public class FileConfig {
    private String filePath;
    private String fileName;
    private String commandInput;

    public String getCommandInput() {
        return commandInput;
    }

    public void setCommandInput(String commandInput) {
        this.commandInput = commandInput;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    void validate() {
        if(Objects.isNull(fileName) || Objects.isNull(filePath)) {
            throw new NullPointerException("FileName and FilePath must be specified for commands to run");
        }
    }
}
