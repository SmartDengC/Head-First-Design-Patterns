package com.dengc.strategy;



public class DuckTest {

    public void testDuck() {
        Duck duck = new RedDuck();
        duck.display();
        duck.swim();
        duck.performFly();
    }
    public void testRubberDuck() {
        Duck duck = new RubberDuck();
        duck.display();
        duck.swim();
        duck.performFly();
    }

}
