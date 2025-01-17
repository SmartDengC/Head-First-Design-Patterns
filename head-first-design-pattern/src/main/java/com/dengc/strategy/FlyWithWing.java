package com.dengc.strategy;

/**
 * 会飞
 *
 * @author 邓聪
 * @since 2025/1/17 12:33
 */
public class FlyWithWing implements FlyBehavior{
    @Override
    public void flying() {
        System.out.println("I'm flying with wing!");
    }
}
