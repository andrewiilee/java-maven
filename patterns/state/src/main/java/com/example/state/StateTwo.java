package com.example.state;

import com.example.Context;
import com.example.State;

/**
 * Created by alee2 on 8/6/18.
 *
 * @author alee2
 */
public class StateTwo implements State {

    @Override
    public void doStateAction(Context context) {
        System.out.println("StateTwo");
        context.setState(new Done());
    }
}
