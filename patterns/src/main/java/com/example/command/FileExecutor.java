package com.example.command;

import com.example.FileConfig;

/**
 * Created by alee2 on 7/12/18.
 *
 * @author alee2
 */
public interface FileExecutor {
    void execute();

    void setFileConfig(FileConfig fileConfig);

    void validateFileConfig();
}
