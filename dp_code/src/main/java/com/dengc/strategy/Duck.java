package com.dengc.strategy;

/**
 * 父类
 *
 * @author 邓聪
 * @since 2025/1/17 12:32
 */
public abstract class Duck {
    // 为什么设计成抽象类？普通类呢？
    FlyBehavior flyBehavior;

    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    // 抽象方法没有具体的实现
    abstract void display();

    public void performFly() {
        flyBehavior.flying();
    }

    public void swim(){
        System.out.println("All ducks can swim");
    }
}
