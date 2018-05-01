package com.example;

/**
 * Created by alee2 on 4/13/18.
 *
 * @author alee2
 */
public class Pizza {

    private boolean cheese;
    private boolean pepperoni;
    private boolean bacon;

    public Pizza build() {
        return this;
    }

    public boolean isCheese() {
        return cheese;
    }

    public Pizza setCheese(boolean cheese) {
        this.cheese = cheese;
        return this;
    }

    public boolean isPepperoni() {
        return pepperoni;
    }

    public Pizza setPepperoni(boolean pepperoni) {
        this.pepperoni = pepperoni;
        return this;
    }

    public boolean isBacon() {
        return bacon;
    }

    public Pizza setBacon(boolean bacon) {
        this.bacon = bacon;
        return this;
    }
}
