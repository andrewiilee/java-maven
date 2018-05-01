package com.example;

import org.junit.Test;

/**
 * Created by alee2 on 4/13/18.
 *
 * @author alee2
 */
public class FluentTest {

    @Test
    public void fluet_test() {
        Pizza pizza = new Pizza().setBacon(true).setCheese(true).setPepperoni(false).build();
        System.out.println(pizza.isPepperoni());
        System.out.println(pizza.isCheese());
        System.out.println(pizza.isBacon());
    }
}
