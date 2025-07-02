package com.dengc.strategy;

/**
 * 不会飞
 *
 * @author 邓聪
 * @since 2025/1/17 12:34
 */
public class FlyNoWay implements FlyBehavior{

    @Override
    public void flying() {
        System.out.println("I cann't flying with no way");
    }
}
