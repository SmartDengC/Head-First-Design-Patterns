package com.dengc.strategy;

/**
 * 红鸭子
 *
 * @author 邓聪
 * @since 2025/1/17 12:41
 */
public class RedDuck extends Duck{
    // 构造函数
    public RedDuck(){
        // flyBehavior 是父类里面的方法
        // new FlyWithWing
        flyBehavior = new FlyWithWing();
    }

    @Override
    void display() {
        System.out.println("i am red duck");
    }
}
