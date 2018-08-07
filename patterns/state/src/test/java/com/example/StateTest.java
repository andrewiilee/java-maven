package com.example;

import com.example.state.Done;
import com.example.state.StateOne;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class StateTest {

    @Test
    public void stateOneTest() {
        Context context = new Context();
        context.setState(new StateOne());

        doContext(context);
        context.doAction();
    }

    @Test
    public void stateDoneTest() {
        Context context = new Context();
        context.setFail(true);
        context.setState(new StateOne());

        doContext(context);
        context.doAction();
    }

    private void doContext(Context context) {
        while(!(context.getState() instanceof Done)) context.doAction();
    }
}
