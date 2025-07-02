package com.dengc.strategy;

import org.junit.jupiter.api.Test;

public class DuckTest {

    @Test
    public void testDuck() {
        Duck duck = new RedDuck();
        duck.display();
        duck.swim();
        duck.performFly();
    }
    @Test
    public void testRubberDuck() {
        Duck duck = new RubberDuck();
        duck.display();
        duck.swim();
        duck.performFly();
    }

}
