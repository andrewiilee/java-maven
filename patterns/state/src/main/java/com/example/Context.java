package com.example;

/**
 * Created by alee2 on 8/6/18.
 *
 * @author alee2
 */
public class Context {
    private State state;

    private boolean fail;

    void doAction() {
        state.doStateAction(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setFail(boolean fail) {
        this.fail = fail;
    }

    public boolean isFail() {
        return fail;
    }
}
