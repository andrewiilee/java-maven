package com.example.command.refactor;

import com.example.FileConfig;
import com.example.commands.refactor.Copy;
import com.example.commands.refactor.Move;

/**
 * Created by alee2 on 7/13/18.
 *
 * @author alee2
 */
public enum CommandFactory implements Initialize {
    MOVE {
        @Override
        public Command initializeCommand(FileConfig fileConfig) {
            return new Move(fileConfig);
        }
    },
    COPY {
        @Override
        public Command initializeCommand(FileConfig fileConfig) {
            return new Copy(fileConfig);
        }
    }
}
