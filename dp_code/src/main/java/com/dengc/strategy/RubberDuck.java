package com.dengc.strategy;

/**
 * 橡皮鸭子
 *
 * @author 邓聪
 * @since 2025/1/17 12:44
 */
public class RubberDuck extends Duck{
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
    }

    @Override
    void display() {
        // 橡皮鸭子
        System.out.println("I'm a rubber duck");
    }
}
