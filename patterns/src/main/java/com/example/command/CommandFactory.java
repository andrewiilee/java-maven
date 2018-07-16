package com.example.command;

import com.example.commands.Copy;
import com.example.commands.Done;
import com.example.commands.Dot;
import com.example.commands.Move;

import java.util.function.Supplier;

/**
 * Created by alee2 on 7/12/18.
 *
 * @author alee2
 */
public enum CommandFactory {
    MOVE(Move::new),
    COPY(Copy::new),
    DOT(Dot::new),
    DONE(Done::new);

    private Supplier<Command> instantiator;

    CommandFactory(Supplier<Command> instantiator) {
        this.instantiator = instantiator;
    }

    public Command getInstance() {
        return instantiator.get();
    }
}
